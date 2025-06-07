const express = require('express');
const studentsRoutes = require('./students');

const app = express();

// Add this to parse JSON request body
app.use(express.json());

// Use the students routes after body parsing middleware
app.use('/api/students', studentsRoutes);

const PORT = process.env.PORT || 3000;
app.listen(PORT, () => {
  console.log(`Server is running on port ${PORT}`);
});

