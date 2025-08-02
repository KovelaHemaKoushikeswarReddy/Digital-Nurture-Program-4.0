import React from 'react';

const IndianPlayers = () => {
  const T20players = ["Rohit", "Kohli", "Pant", "Bumrah", "Jadeja"];
  const RanjiPlayers = ["Pujara", "Rahane", "Shaw", "Iyer", "Ashwin"];

  // Merge arrays
  const allPlayers = [...T20players, ...RanjiPlayers];

  // Destructuring
  const [odd1, even1, odd2, even2, odd3, even3, odd4, even4, odd5, even5] = allPlayers;

  return (
    <div>
      <h2>Merged Players:</h2>
      <p>{allPlayers.join(', ')}</p>
      <h3>Odd Team Players:</h3>
      <ul>
        <li>{odd1}</li>
        <li>{odd2}</li>
        <li>{odd3}</li>
        <li>{odd4}</li>
        <li>{odd5}</li>
      </ul>
      <h3>Even Team Players:</h3>
      <ul>
        <li>{even1}</li>
        <li>{even2}</li>
        <li>{even3}</li>
        <li>{even4}</li>
        <li>{even5}</li>
      </ul>
    </div>
  );
};

export default IndianPlayers;
