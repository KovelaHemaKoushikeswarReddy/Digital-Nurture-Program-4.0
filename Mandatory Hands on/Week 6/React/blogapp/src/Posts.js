// src/Posts.js
import React, { Component } from "react";
import Post from "./Post";

class Posts extends Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
      error: null,
    };
  }

  // Step 6: loadPosts()
  loadPosts() {
    fetch("https://jsonplaceholder.typicode.com/posts")
      .then((response) => response.json())
      .then((data) => {
        this.setState({ posts: data });
      })
      .catch((err) => {
        this.setState({ error: err });
      });
  }

  // Step 7: componentDidMount
  componentDidMount() {
    this.loadPosts();
  }

  // Step 9: componentDidCatch
  componentDidCatch(error, info) {
    alert("An error occurred: " + error.toString());
    console.error("Error caught in component:", error, info);
  }

  // Step 8: render
  render() {
    const { posts } = this.state;
    return (
      <div>
        <h1>Blog Posts</h1>
        {posts.map((post) => (
          <Post key={post.id} title={post.title} body={post.body} />
        ))}
      </div>
    );
  }
}

export default Posts;
