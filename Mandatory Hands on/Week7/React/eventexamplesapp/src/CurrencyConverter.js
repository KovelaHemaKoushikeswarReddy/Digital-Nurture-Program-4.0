import React, { useState } from 'react';

function CurrencyConverter() {
  const [rupees, setRupees] = useState('');
  const [euros, setEuros] = useState(null);

  const handleSubmit = () => {
    const euroRate = 0.011; // 1 INR = 0.011 EUR approx
    const converted = parseFloat(rupees) * euroRate;
    setEuros(converted.toFixed(2));
  };

  return (
    <div>
      <h2>Currency Converter</h2>
      <input
        type="number"
        placeholder="Enter amount in INR"
        value={rupees}
        onChange={(e) => setRupees(e.target.value)}
      />
      <button onClick={handleSubmit} style={{ marginLeft: '10px' }}>
        Convert to Euro
      </button>

      {euros && (
        <p>
          ₹{rupees} = €{euros}
        </p>
      )}
    </div>
  );
}

export default CurrencyConverter;
