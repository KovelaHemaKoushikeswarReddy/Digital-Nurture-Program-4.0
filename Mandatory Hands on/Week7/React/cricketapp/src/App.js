import React, { useState } from 'react';
import ListofPlayers from './components/ListofPlayers.js';
import IndianPlayers from './components/IndianPLayers.js';

function App() {
  const [flag, setFlag] = useState(true); // state-controlled flag

  return (
    <div className="App">
      <h1>Welcome to Cricket App</h1>

      {/* Toggle Button */}
      <button onClick={() => setFlag(!flag)} style={{ marginBottom: '1rem' }}>
        Show {flag ? 'Indian Players' : 'List of Players'}
      </button>

      {/* Conditional Rendering */}
      {flag ? <ListofPlayers /> : <IndianPlayers />}
    </div>
  );
}

export default App;
