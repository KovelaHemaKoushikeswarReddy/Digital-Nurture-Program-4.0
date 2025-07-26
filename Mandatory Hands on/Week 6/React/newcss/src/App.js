import logo from './logo.svg';
import './App.css';
import Box1 from './Components/box1';
import Box2 from './Components/box2';
import Box3 from './Components/box3';
function App() {
  return (
  <div className='box-container'>
    <Box1/>
    <Box2/>
      <Box3/>
  </div>
  );
}

export default App;
