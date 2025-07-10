# 🧑‍💼 Employee Management System

> Built with ❤️ by Harshita Gupta

A full-stack Employee Management System built using **Spring Boot**, **MySQL**, and a simple **HTML/CSS/JS frontend**. It allows users to perform CRUD operations on employee records.

---

## 🌟 Features

- ➕ Add new employees  
- 📋 View all employees  
- ✏️ Update existing employee details  
- ❌ Delete employees  
- 🔗 Connects to MySQL using Spring Data JPA  
- 📦 RESTful APIs exposed via Spring Boot  
- 🧑‍💻 Frontend created with pure HTML, CSS & JavaScript (no framework)

---

## 💻 Technologies Used

- Spring Boot 3.5.x  
- MySQL  
- Spring Data JPA  
- REST API  
- HTML5, CSS3, JavaScript  
- Postman (for testing)

---

## 📂 Project Structure

spring-boot-employee-management/
│
├── employee-management/
│ ├── src/
│ │ ├── main/
│ │ │ ├── java/
│ │ │ │ └── com/harshita/employee/
│ │ │ │ ├── controller/
│ │ │ │ ├── entity/
│ │ │ │ ├── repository/
│ │ │ │ ├── service/
│ │ │ │ └── EmployeeManagementApplication.java
│ │ │ └── resources/
│ │ │ ├── static/
│ │ │ │ └── index.html
│ │ │ ├── application.properties


---

## 🔗 API Endpoints

| Method | Endpoint                   | Description                      |
|--------|----------------------------|----------------------------------|
| GET    | `/api/employees`           | Retrieve all employees           |
| GET    | `/api/employees/{id}`      | Retrieve employee by ID          |
| POST   | `/api/employees`           | Add new employee                 |
| PUT    | `/api/employees/{id}`      | Update existing employee by ID   |
| DELETE | `/api/employees/{id}`      | Delete employee by ID            |

---

## 📸 Preview

![Project Overview]
(https://github.com/hershiee/spring-boot-employee-management/blob/main/employee-management/projectOverview.png.png)

---

## 🛠️ Setup Instructions

1. Clone the repository  
   git clone https://github.com/hershiee/spring-boot-employee-management.git
   cd employee-management

2. Create your MySQL database:
   CREATE DATABASE employee_db;

3.Update your application.properties:
  spring.datasource.url=jdbc:mysql://localhost:3306/employee_db
  spring.datasource.username=root
  spring.datasource.password=your_password

4. Run the Spring Boot application:
   mvn spring-boot:run
   
5.Open the frontend:
   http://localhost:8080/index.html


## 🏁 Future Improvements
Add login/signup with JWT

Role-based access (Admin/User)

React frontend

Deploy to Railway(Deployment)


## 🙌 Acknowledgements
Thanks to EmbarkX Udemy Course for foundational learning.


## ✨ Author
**Harshita Gupta**
📫 https://www.linkedin.com/in/harshita-gupta-283a15172/
💼 Aspiring Software Developer | Java | Spring Boot | Problem Solver



   

