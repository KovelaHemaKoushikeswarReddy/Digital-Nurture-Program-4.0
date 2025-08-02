import React, { useState } from 'react';
import './App.css';

function GuestPage() {
  return (
    <div>
      <h2>Welcome Guest</h2>
      <p>You can browse flights, but you must log in to book tickets.</p>
      <ul>
        <li>✈️ Flight A123 – Hyderabad to Mumbai – ₹3500</li>
        <li>✈️ Flight B456 – Delhi to Bangalore – ₹4500</li>
      </ul>
    </div>
  );
}

function UserPage() {
  return (
    <div>
      <h2>Welcome User</h2>
      <p>You can browse and book flights.</p>
      <ul>
        <li>
          ✈️ Flight A123 – Hyderabad to Mumbai – ₹3500
          <button style={{ marginLeft: '10px' }}>Book</button>
        </li>
        <li>
          ✈️ Flight B456 – Delhi to Bangalore – ₹4500
          <button style={{ marginLeft: '10px' }}>Book</button>
        </li>
      </ul>
    </div>
  );
}

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  let content;
  if (isLoggedIn) {
    content = <UserPage />;
  } else {
    content = <GuestPage />;
  }

  return (
    <div className="App" style={{ padding: '20px', fontFamily: 'Arial' }}>
      <h1>Flight Ticket Booking App</h1>
      <button onClick={() => setIsLoggedIn(!isLoggedIn)}>
        {isLoggedIn ? 'Logout' : 'Login'}
      </button>

      <hr />
      {content}
    </div>
  );
}

export default App;
