## Experiment 1
# Aim: Responsive Shopping Cart Web Application
## Project Overview
This is a responsive shopping cart web application built using HTML,CSS and Js.It includes the following features:
-> User Registration
-> User Login
-> Product Catalog
-> Shopping Cart
## Features
-> Registration and Login pages with form validation
-> Product catalog displaying items in a responsive grid
-> Cart functionality to add/remove items
-> Fully responsive design using CSS Flexbox and Grid
## Technologies Used
-> HTML
-> CSS
-> JS
## Pages
-> register.html – User registration
-> login.html – User login
-> catalog.html – Product listing
-> cart.html – Shopping cart page
## How to Run
STEP TO RUN THE PROJECT
1.Clone the repository:
2.git clone https://github.com/swayamprakashm/program-12.git
3.cd shopping-cart
4.Install dependencies:
5.npm install
6.Run the server:
7.node server.js
8.Open the browser and visit
9.http://localhost:3000
        (OR)
Just Go to GoLive option
## Author
ASHWINI SHAILAJA (https://github.com/shailaja04)
## License
This project is open-source and free to use.
## Output
![image](https://github.com/user-attachments/assets/fabf7bac-4745-4c17-b25d-4968767d29bc)
![image](https://github.com/user-attachments/assets/045c7187-9032-4a57-8b38-67d8b0a6d758)
![image](https://github.com/user-attachments/assets/999f3422-af76-4167-8a66-869f43f679b3)
![image](https://github.com/user-attachments/assets/945c78bc-cdea-43c2-9144-73c9362e1338)
![image](https://github.com/user-attachments/assets/c468f15f-74d7-4e7f-9732-89508472f2f9)

## Experiment 2
# Aim: Responsive Shopping Cart Web Application using Bootstrap
## Project Overview
This is a responsive shopping cart web application built using HTML,CSS,JS. The app allows users to register, log in, browse products, and manage their shopping cart.
## Features
-> User Registration and Login forms with validation
-> Product Catalog using Bootstrap Grid
-> Shopping Cart to add/remove items
-> Fully responsive design using Bootstrap components
## Technologies Used
-> HTML
-> CSS
-> Bootstrap 5
-> JS
## Pages
-> register.html – User registration
-> login.html – User login
-> catalog.html – Product catalog with Bootstrap Cards/Grid
-> cart.html – Shopping cart page with item management
## How to Run
1. Clone or download the repository.
2. Open any of the `.html` files in your browser.
3. Navigate through the app using the navbar or links.
                 (OR)
Just Go to GoLive option
## Author
ASHWINI SHAILAJA (https://github.com/shailaja04)
## License
This project is open-source and free to use.
## Output
![image](https://github.com/user-attachments/assets/34724808-0b21-4754-ac40-63c927540d5d)
![image](https://github.com/user-attachments/assets/dae868a7-b778-409a-b64f-74878a910493)

## Experiment 3
# Aim: Shopping Cart Web Application with Client-Side Validation
## Project Overview
This is a responsive shopping cart web application built using HTML,CSS,JS,Bootst. It includes user
registration, login, product catalog, and a shopping cart—now enhanced with client-side validation
using JS.
## Features
-> Client-side validation for registration and login forms using JavaScript
-> Real-time input validation feedback (email, password, etc.)
-> Product catalog displayed using Bootstrap Cards and Grid
-> Shopping cart functionality to add and remove products
-> Fully responsive layout using Bootstrap
## Technologies Used
-> HTML
-> CSS
-> Bootstrap
-> JS
## Pages
-> register.html – User registration with JavaScript validation
-> login.html – User login with input checks
-> catalog.html – Product listing
-> cart.html – Shopping cart page
## Client-Side Validation Includes
 Required field checks
 Valid email format
 Password strength rules (min length, characters)
 Matching confirm password
 Instant feedback using JavaScript
## How to Run
1. Download or clone the repository.
2. Open `register.html` or `login.html` in a browser to test validation.
3. Navigate through catalog and cart pages using navbar or links.
                             (OR)
   Just Go to GoLive option.
## Author
ASHWINI SHAILAJA (https://github.com/shailaja04)
## License
This project is open-source and free to use.
## Output
![image](https://github.com/user-attachments/assets/4fdb15be-a7de-45c2-86a8-f8332764373f)

## Experiment 4
# Aim: Weather Info App using ES6 and OpenWeatherMap API
## Project Overview
This project demonstrates the use of ES6 features by the Weather data from OpenWeatherMap API an display the graph on this webpage.
## Features
 Fetches real-time weather data** using OpenWeatherMap API
 Displays temperature and weather info in a graph
 Uses modern JS(ES6) syntax:
 Arrow Functions
 Callbacks
 Promises
 Async/Await
## Technologies Used
HTML
CSS
JS
[OpenWeatherMap API](https://openweathermap.org/)
[Chart.js](https://www.chartjs.org/) for graph rendering
## How It Works
1. User enters a city name.
2. App fetches weather data using `fetch()` and async/await.
3. The data is displayed in a line/bar chart using Chart.js.
## Files
index.html – UI for entering city and displaying graph
style.css – Basic styling
script.js – JavaScript using ES6 features
## How to Use
1. Get a free API key from [https://openweathermap.org/api](https://openweathermap.org/api)
2. Replace `"YOUR_API_KEY"` in `script.js` with your API key.
3. Open index.html in a browser.
4. Enter a city name and view the graph.
5. ![image](https://github.com/user-attachments/assets/f7e45097-1c99-4978-a7b8-96f747842920)
## Author
ASHWINI SHAILAJA (https://github.com/shailaja04)
## License
This project is open-source and free to use.
## Output
![image](https://github.com/user-attachments/assets/009dd3f1-3bce-47c6-ab2e-ed5a846f1955)
![image](https://github.com/user-attachments/assets/cf5ecdd1-24d7-4146-a43a-06bf1112a38c)

## Experiment 5
# Aim: Java Standalone CRUD Application with Database
## Project Overview
This is a standalone Java application that connects to a MySQL database and performs CRUD operations (Create, Read, Update, Delete) on a database table.
## Features
 Add new records
 View all records
 Update existing records
 Delete records
 Simple console-based UI using Java
## Technologies Used
 JDBC (Java Database Connectivity)
 MySQL or Oracle Database
 Command-line interface 
## Database Requirements
 MySQL Example
 sql
CREATE DATABASE studentdb;
USE studentdb;
CREATE TABLE students (
  id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(100),
  email VARCHAR(100),
  course VARCHAR(50)
);

## How to Run
1. Install Java and MySQL.
2. Update DB connection details in the Java code:
## 
String url = "jdbc:mysql://localhost:3306/studentdb";
String username = "root";
String password = "your_password";
3. Compile and run
javac CRUDApp.java
java CRUDApp
## Files
1. CRUDApp.java – Main class with CRUD operations.
## Author
ASHWINI SHAILAJA (https://github.com/shailaja04)
## License
This project is open-source and free to use.
## Output
![image](https://github.com/user-attachments/assets/9b3ffc31-6457-4cfd-86a2-498099124c99)

## Experiment 6
# Aim: Shopping Cart App with Servlet & DB Integration
## Overview
This project adds Servlet controllers to the shopping cart app (Exp 1), enabling interaction with a MySQL (from Exp 5) for user and product data.
## Features
- User Registration & Login (via Servlets)
- Product & Cart Management
- Database connection using JDBC
- Runs on Apache Tomcat
## Tech Used
- Java Servlets, JDBC
- HTML, CSS, Bootstrap
- MySQL or Oracle DB
- Apache Tomcat
## Files
- RegisterServlet.java, LoginServlet.java
- ProductServlet.java, CartServlet.java
- web.xml for servlet mapping
## Run Steps
1. Add JDBC JAR to `WEB-INF/lib`
2. Deploy to Tomcat
3. Access at `http://localhost:8080/YourApp/`
## Author
ASHWINI SHAILAJA (https://github.com/shailaja04)
## Output
![image](https://github.com/user-attachments/assets/42327668-2453-4eba-8f89-a348c597a9f6)
![image](https://github.com/user-attachments/assets/f337c543-d82b-4448-81a6-6468580e22a1)

## Experiment 7
## Aim: Session Tracking in Web Applications
## Overview
This project explores session tracking mechanisms like Cookies and HTTP Sessions to maintain user transaction history in a web application.
## Features
- Tracks user login and actions across pages
- Stores user-specific data like cart items or visit history
- Demonstrates both:
   1. Cookies
   2. HTTP Session (using `HttpSession` in Servlets)
## Tech Used
- Java Servlets
- HTML, CSS
- Apache Tomcat
## What’s Implemented
Cookies: Store small user data on the browser
HttpSession: Server-side user tracking with `HttpSession` object
## Files
- `LoginServlet.java`, `SessionServlet.java`, `LogoutServlet.java`
- `web.xml` – Servlet configuration
## Run Steps
1. Deploy the app on Apache Tomcat
2. Access `login.html` → Login → Navigate pages
3. Check how session or cookies maintain user info
## Author
ASHWINI SHAILAJA (https://github.com/shailaja04)
## Output
![image](https://github.com/user-attachments/assets/d650e1e9-d521-4fd3-b389-d558ef97af9c)
![image](https://github.com/user-attachments/assets/40e1a533-dd52-4107-bb45-25e922f064fc)


***Nodejs***

## Experiment 8
# Aim : Node.js Custom Server & Core Modules Demo
## Overview
This project demonstrates how to create a custom HTTP server using Node.js and explores built-in modules like os,path,and events.
## Features
-  Custom server using `http` module
-  Handles basic routing and file serving
-  Uses `os` to display system info
-  Uses `path` to handle file paths
-  Uses `events` to emit and listen for events
## Modules Used
- `http` – Creates the server
- `os` – System info (hostname, memory, CPU)
- `path` – File path operations
- `events` – Custom event handling
- `fs` – Read/write files (optional)
##  How to Run
1. Install Node.js
2. Save `server.js`
3. Run:
   node server.js
4.Visit http://localhost:3000 in browser
## Output
![image](https://github.com/user-attachments/assets/01fe7040-aa89-4d07-a9f9-27c90f4300a9)

## Experiment 9
# Aim: Express REST API for Student Data CRUD
## Project Overview
This is an **Express.js** web application that provides a REST API to perform **CRUD operations** on student data.
You can test the API endpoints using **Postman**.
## Features
- Create, Read, Update, Delete student records
- RESTful API endpoints
- JSON data format
- Tested with Postman
## Technologies Used
- Node.js
- Express.js
- Body-parser (for JSON parsing)
- Nodemon (optional for development)
## API Endpoints
| Method | Endpoint           | Description            |
|--------|--------------------|------------------------|
| POST   | `/students`        | Create a new student   |
| GET    | `/students`        | Get all students       |
| GET    | `/students/:id`    | Get student by ID      |
| PUT    | `/students/:id`    | Update student by ID   |
| DELETE | `/students/:id`    | Delete student by ID   |
## How to Run
1. Clone the repo and navigate to the project folder.
2. Install dependencies:
   npm install express body-parser
3. Start the server:
   node app.js
   Use Postman to test the API at http://localhost:3000
## Output
![image](https://github.com/user-attachments/assets/34526210-0883-4f9b-b0f6-bf9d2146cb82)

## Experiment 10
# Aim: Express REST API with JWT Authentication
## Overview
This is a secure **Express.js REST API** for performing CRUD operations on student data. 
It uses **JWT (JSON Web Tokens)** to protect authorized endpoints. API testing can be done using **Postman**.
## Features
-  JWT-based user login & token generation
-  Protected CRUD endpoints for student data
-  Token must be sent in `Authorization` header
## Technologies Used
- Node.js, Express.js
- JSON Web Token (`jsonwebtoken`)
- Body-parser
## API Endpoints
### Public
| Method | Endpoint      | Description     |
|--------|---------------|-----------------|
| POST   | `/login`      | Get JWT token   |
### Protected (require token)
| Method | Endpoint        | Description          |
|--------|------------------|----------------------|
| POST   | `/students`      | Create a student     |
| GET    | `/students`      | Get all students     |
| PUT    | `/students/:id`  | Update student by ID |
| DELETE | `/students/:id`  | Delete student       |
## How to Run
1. Install dependencies:
   npm install express body-parser jsonwebtoken
2.Start the server:
   node app.js
3. Use Postman:
First call /login to get the token
Add Authorization: Bearer <token> in headers for all other requests
## Output
{
"id": "1717682112345",
"name": "Alice",
"age": 22,
"course": "B.Tech"
}

## Experiment 11
# Aim: React Student Management System
## Overview
A simple React.js application for a Student Management System with pages for Registration,Login,Contact,and About.
Routing is implemented using React Router.
## Features
- Registration & Login Forms
- Contact Page
- About Page
- Navigation between pages using React Router
## Technologies Used
- React.js (with Create React App)
- React Router DOM
- CSS for basic styling
## Pages
- `/register` – Student Registration
- `/login` – User Login
- `/contact` – Contact Information
- `/about` – About the System
## How to Run
1. Create the app:
   npx create-react-app student-management
   cd student-management
   npm install react-router-dom
2. Replace App.js and create pages (Register.js, Login.js, Contact.js, About.js)
3. Start the app:
   npm start
   Open http://localhost:3000 in your browser
## Output
![image](https://github.com/user-attachments/assets/a4c85e67-58ee-4c5c-aa95-046a7dfba3d7)

## Experiment 12
# React Weather App with Chart.js
## Overview
This React application fetches current and historical weather data from OpenWeatherMap API and displays it using Chart.js in graphical format.
## Features
-  Fetch current weather by city
-  Display weather trends (temperature, humidity, etc.)
-  Graphical charts using Chart.js
-  Uses a React service to call OpenWeatherMap API
## Technologies Used
- React.js
- Chart.js
- Axios
- OpenWeatherMap API
## Key Components
- `WeatherService.js` – Handles API calls
- `WeatherChart.js` – Renders charts using Chart.js
- `WeatherPage.js` – UI for input and display
## Setup
1. Get a free API key from [openweathermap.org](https://openweathermap.org/)
2. Add it in `.env` file:
3. EACT_APP_WEATHER_API_KEY=your_api_key
## How to Run
npx create-react-app react-weather-app
cd react-weather-app
npm install axios chart.js react-chartjs-2
npm start
Then open: http://localhost:3000
## Output
![image](https://github.com/user-attachments/assets/54464db7-5def-471b-8328-49e46ff11185)
![image](https://github.com/user-attachments/assets/7a0757fa-4238-4de5-9b14-0def01fe42f2)
![image](https://github.com/user-attachments/assets/a173a544-c950-4644-a5ce-9c35744ca37b)

## Experiment 13
# Aim: React TODO App
## Overview
A simple React.js TODO application to add, edit, and delete tasks. The app is built with reusable components and deployed to GitHub Pages.
##  Features
- Add tasks
- Mark tasks as complete
- Edit tasks
- Delete tasks
- Data saved in local state
## Technologies Used
- React.js (with Create React App)
- CSS for styling
- GitHub Pages for deployment
## Components
- `TodoList.js` – Displays list of todos
- `TodoItem.js` – Represents individual task
- `AddTodo.js` – Form to add new todo
- `App.js` – Main container
##  How to Run Locally
npx create-react-app react-todo
cd react-todo
npm start
## Deployment (GitHub Pages)
Install GitHub Pages:
npm install gh-pages --save-dev
In package.json, add:
"homepage": "https://yourusername.github.io/react-todo",
"scripts": {
  "predeploy": "npm run build",
  "deploy": "gh-pages -d build"
}
Deploy:
npm run deploy
## Output
![image](https://github.com/user-attachments/assets/415e563e-0708-474f-a517-e5e865285897)
![image](https://github.com/user-attachments/assets/2071c8ba-cd67-4ff0-ac85-ccfb983f1bc5)

## Experiment 14
# Aim:Django Student Management System
## Overview
A basic Django web application for a Student Management System with Registration,Login,Contact,and About pages. Routing is handled using Django URLs.
## Features
-  User Registration & Login
-  Contact Page
-  About Page
-  Template-based page rendering
-  URL routing with `urls.py`
## Technologies Used
- Python 3.x
- Django (4.x+)
- HTML, CSS (Bootstrap for UI)
## Project Structure
- `students/` – Django app
  - `views.py` – Page logic
  - `urls.py` – App-level routing
  - `templates/` – HTML pages
- `project/urls.py` – Main routing
- `project/settings.py` – Configuration
## How to Run
1. Create virtual env and install Django
   pip install django
2.Start project & app
django-admin startproject student_project
cd student_project
python manage.py startapp students
3.Run server
python manage.py runserver
4.Visit http://localhost:8000
## Output
![image](https://github.com/user-attachments/assets/58796211-6757-4106-a665-b7e3b2c2742d)
![image](https://github.com/user-attachments/assets/33a077f2-c3b9-4b07-9415-5afe8dd98a23)
![image](https://github.com/user-attachments/assets/f7a6f001-b3a5-4c88-9425-9381726166aa)
![image](https://github.com/user-attachments/assets/f3458d34-cec9-4057-8be2-cce8b8776cb1)
![image](https://github.com/user-attachments/assets/40355f52-3ce1-420b-b32a-d24e89e8c33f)

## Experiment 15
# Aim: Django Weather App with Chart.js
## Overview
A Django application that fetches weather data (current and historical) from OpenWeatherMap API and displays it using Chart.js for graphical representation.
##  Features
-  Fetch current and past weather by city
-  Display temperature, humidity trends using charts
-  API integration with OpenWeatherMap
-  Graphical charts using Chart.js (in templates)
## Technologies Used
- Django (4.x+)
- Requests (for API calls)
- Chart.js (in frontend)
- HTML, CSS, Bootstrap
## Key Structure
- `weather_app/`
  - `views.py` – Fetch API data and pass to templates
  - `urls.py` – URL routing
  - `templates/weather.html` – Chart rendering
- `settings.py` – Add app & templates setup
## API Setup
1. Get API key from [openweathermap.org](https://openweathermap.org/)
2. Add it in `views.py` or `settings.py`
## How to Run
pip install django requests
python manage.py runserver
#  Visit: http://localhost:8000/weather/
## Output
![image](https://github.com/user-attachments/assets/6e94e498-27c2-4307-901c-8c87268a5c0a)

## Experiment 16
# Aim: Django TODO Application
## Overview
A basic TODO application built using the Django framework. It allows users to create, view, update, and delete tasks. The project is also deployed to GitHub.
##  Features
-  Add new tasks
-  Mark tasks as completed
-  Edit tasks
-  Delete tasks
-  Clean routing with Django URLs
## Technologies Used
- Django (4.x+)
- SQLite (default DB)
- HTML, CSS (Bootstrap for UI)
## Project Structure
- `todo_app/` – Django app
  - `models.py` – Task model
  - `views.py` – Logic for CRUD
  - `urls.py` – Routing
  - `templates/` – HTML templates
- `project/urls.py` – Project-level URLs
## How to Run
1. Install Django:
   pip install django
2. Start project and app:
django-admin startproject todo_project
cd todo_project
python manage.py startapp todo_app
3. Apply migrations:
python manage.py makemigrations
python manage.py migrate
4. Run server:
python manage.py runserver
5. Visit: http://localhost:8000
## GitHub Deployment
Push code to GitHub:
git init
git remote add origin https://github.com/yourusername/django-todo-app.git
git add .
git commit -m "Initial commit"
git push -u origin main
## Output
![image](https://github.com/user-attachments/assets/9e1be989-c90b-4782-9ae8-0498ff084d9f)



