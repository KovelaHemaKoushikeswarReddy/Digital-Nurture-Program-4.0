// src/Post.js
import React, { Component } from "react";

class Post extends Component {
  render() {
    const { title, body } = this.props;
    return (
      <div style={{ margin: "20px", border: "1px solid #ccc", padding: "10px" }}>
        <h2>{title}</h2>
        <p>{body}</p>
      </div>
    );
  }
}

export default Post;
