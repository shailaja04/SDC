import { Link } from "react-router-dom";

function Navbar() {
  return (
    <nav>
      <Link to="/">Register</Link> 
      <br></br>
      <Link to="/login">Login</Link> 
       <br></br>
      <Link to="/about">About</Link>  <br></br>
      <Link to="/contact">Contact</Link>
    </nav>
  );
}

export default Navbar;
