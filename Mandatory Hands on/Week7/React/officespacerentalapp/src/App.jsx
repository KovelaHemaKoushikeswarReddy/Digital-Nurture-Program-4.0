import React from 'react';

const offices = [
  {
    name: "SkyView Spaces",
    rent: 45000,
    address: "MG Road, Bengaluru",
    image: "https://picsum.photos/id/1011/400/200" // reliable
  },
  {
    name: "TechHub Towers",
    rent: 75000,
    address: "HiTech City, Hyderabad",
    image: "https://picsum.photos/id/1015/400/200" // reliable
  },
  {
    name: "EcoSpace",
    rent: 60000,
    address: "Kondapur, Hyderabad",
    image: "https://picsum.photos/id/1016/400/200" // reliable
  }
];

function App() {
  return (
    <div style={{ padding: '20px', fontFamily: 'Arial' }}>
      <h1 style={{ color: 'navy' }}>Office Space Rental App</h1>

      {offices.map((office, index) => (
        <div
          key={index}
          style={{
            border: '1px solid #ccc',
            padding: '15px',
            marginBottom: '10px',
            borderRadius: '8px',
            display: 'flex',
            alignItems: 'center',
            gap: '20px'
          }}
        >
          <img
            src={office.image}
            alt={office.name}
            style={{ width: '200px', height: '100px', objectFit: 'cover' }}
          />
          <div>
            <h2>{office.name}</h2>
            <p><strong>Address:</strong> {office.address}</p>
            <p>
              <strong>Rent:</strong>{" "}
              <span style={{ color: office.rent < 60000 ? 'red' : 'green' }}>
                ₹{office.rent}
              </span>
            </p>
          </div>
        </div>
      ))}
    </div>
  );
}

export default App;
