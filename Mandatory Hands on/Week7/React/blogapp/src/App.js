import { useState } from 'react';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';

function App() {
  const [view, setView] = useState('book');

  return (
    <div>
      <h1>Blogger App</h1>
      <button onClick={() => setView('book')}>Book</button>
      <button onClick={() => setView('blog')}>Blog</button>
      <button onClick={() => setView('course')}>Course</button>

      {/* Conditional Rendering - Method 1: if-else style */}
      {view === 'book' && <BookDetails />}
      {view === 'blog' && <BlogDetails />}
      {view === 'course' && <CourseDetails />}

      {/* Method 2: Ternary Operator */}
      {/* 
        view === 'blog' ? <BlogDetails /> : <div>Select Blog</div>
      */}

      {/* Method 3: Switch Case (in separate function) */}
    </div>
  );
}

export default App;
