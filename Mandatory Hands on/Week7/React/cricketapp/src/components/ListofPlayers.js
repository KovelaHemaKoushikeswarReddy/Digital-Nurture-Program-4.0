import React from 'react';

const players = [
  { name: "Virat", score: 85 },
  { name: "Rohit", score: 45 },
  { name: "Rahul", score: 75 },
  { name: "Bumrah", score: 65 },
  { name: "Hardik", score: 80 },
  { name: "Pant", score: 30 },
  { name: "Ashwin", score: 90 },
  { name: "Kohli", score: 88 },
  { name: "Dhawan", score: 55 },
  { name: "Chahal", score: 35 },
  { name: "Jadeja", score: 72 }
];

const ListofPlayers = () => {
  const filteredPlayers = players.filter(p => p.score < 70); // Arrow Function
  return (
    <div>
      <h2>All Players:</h2>
      <ul>
        {players.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>
      <h3>Players with score below 70:</h3>
      <ul>
        {filteredPlayers.map((player, index) => (
          <li key={index}>{player.name}</li>
        ))}
      </ul>
    </div>
  );
};

export default ListofPlayers;
