Employee Management System
This project is a Java-based Employee Management System that leverages Object-Oriented Programming (OOP) concepts to efficiently manage employee data. The system includes two modes: Admin and Employee, each with distinct functionalities.

Features
Admin Mode:
Add Employee: Insert new employee details, including name, age, ID, job title, and salary.

Delete Employee: Remove an employee from the system using their unique ID.

Update Employee: Modify existing employee information.

View Employee: Retrieve and display details of a specific employee by ID.

Calculate Average Salary: Compute the average salary of all employees.

Get Highest Paid Employee: Identify and display the highest-paid employee.

Employee Mode:
Employees can view their own details (future enhancements may include editing personal information or requesting updates).

Core Functionalities
Employee Attributes:

private String name

private int age

private int ID

private String jobTitle

private double salary

Services Provided:

Insert, delete, update, and view employee records.

Calculate average salary across all employees.

Identify the highest-paid employee.

Helper Functions:

Validate unique IDs to prevent duplication.

Manage array-based storage for employees (interfaces.employees).

Technologies Used
Programming Language: Java

Concepts Applied: OOP principles (encapsulation, inheritance, and abstraction)

User Interaction: Command-line interface using Scanner for input.

How It Works
The system uses an array to store employee objects (Employee class). Admins can perform CRUD operations on employee data through the EmployeeServices class. Helper methods ensure data integrity by checking for unique IDs and managing array indices.

Future Enhancements
Add database integration for persistent storage (e.g., MySQL or SQLite).

Implement a GUI using JavaFX or Swing for better user experience.

Include additional features like role-based access control, leave management, and performance tracking.

This project demonstrates how OOP concepts can be effectively applied to real-world problems like employee management.
