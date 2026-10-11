# Java Console-Based Projects

A collection of Java console-based applications developed to strengthen core Java fundamentals, object-oriented programming (OOP), problem-solving, and application development skills.

## About This Repository

This repository contains hands-on Java projects ranging from beginner-level programs to larger menu-driven applications. Each project focuses on applying programming concepts to practical scenarios.

## Projects

> Add or update project folder names below to match the projects available in this repository.

| # | Project | Description | Concepts Practiced |
|---|---|---|---|
| 1 | Array Operations | Performs common operations on arrays, such as searching and processing elements. | Arrays, loops, methods |
| 2 | Library Management System | A menu-driven application to manage books and basic library operations. | Classes, objects, encapsulation, collections, loops |
| 3 | Online Shopping Order System | Simulates product selection and order processing in a console. | Arrays, conditionals, methods, input handling |
| 4 | Tic-Tac-Toe Game | A two-player console game with win and draw detection. | Arrays, loops, methods, conditional logic |
| 5 | Student Management System | Manages student information and basic student-related operations. | OOP, classes, objects, CRUD logic |
| 6 | Banking System | Simulates basic banking operations such as deposits, withdrawals, and balance checks. | Encapsulation, methods, validation |
| 7 | JDBC Login Application | Demonstrates database-backed login and credential validation. | JDBC, SQL, `PreparedStatement`, exception handling |
| 8 | Other Java Practice Programs | Small programs for practicing Java syntax, logic, and data processing. | Variables, operators, loops, arrays, methods |

## Key Skills Demonstrated

- **Core Java:** variables, data types, operators, control flow, loops, arrays, strings, and methods.
- **Object-Oriented Programming:** classes, objects, encapsulation, inheritance, polymorphism, and abstraction where applicable.
- **Collections and Data Handling:** using suitable Java data structures where required.
- **Exception Handling:** handling invalid input and runtime errors.
- **Database Connectivity:** JDBC and SQL for projects that use a database.
- **Problem Solving:** implementing menu-driven workflows, validation, searching, and business logic.
- **Code Organization:** separating responsibilities into classes and methods for maintainability.

## Technologies Used

- Java
- JDK
- Eclipse IDE or Visual Studio Code
- Git and GitHub
- MySQL and JDBC *(for database-connected projects only)*

## Prerequisites

Before running a project, install:

1. A compatible JDK.
2. Eclipse IDE or Visual Studio Code with Java support.
3. MySQL and a JDBC driver, if the project connects to a database.

Verify your Java installation:

```bash
java -version
javac -version
```

## How to Run a Project

### Option 1: Run through an IDE

1. Clone or download this repository.
2. Open the required project folder in Eclipse or Visual Studio Code.
3. Locate the Java class containing `public static void main(String[] args)`.
4. Configure the JDK and any required libraries.
5. Run the class and follow the console prompts.

### Option 2: Compile and run from the terminal

Navigate to the directory containing the Java source file:

```bash
javac Main.java
java Main
```

Replace `Main.java` and `Main` with the actual filename and class name. Projects containing multiple packages or external libraries may require a project-specific compile command.

## Running JDBC Projects

For projects that use MySQL:

1. Install and start MySQL.
2. Create the database and tables required by the project.
3. Update the database URL, username, and password in the project's configuration.
4. Add the MySQL Connector/J driver to the project.
5. Run the application.

**Security note:** Do not commit real database passwords or other secrets to GitHub. Use environment variables or a local configuration file excluded through `.gitignore`. Use `PreparedStatement` with parameterized queries for user input.



Adjust this structure to match your actual folders. If projects are separate Eclipse projects, keep their individual source folders and configuration files as needed.

## Learning Outcomes

Through these projects, I practice translating requirements into program logic, designing classes and methods, validating user input, debugging errors, and building interactive console applications. Database-enabled projects also provide practice with SQL and JDBC.

## Future Improvements

- Add unit tests and input-validation test cases.
- Improve code documentation and exception handling.
- Add persistent storage to projects that currently store data only in memory.
- Refactor larger applications into clearer layers.
- Add screenshots or sample console output to each project folder.
- Expand selected applications into web-based projects.

## Author

**Your Name**

- GitHub: [Add your GitHub profile URL]
- LinkedIn: [Add your LinkedIn profile URL]
- Email: [Add your professional email address]

---

*This repository is a learning portfolio. Features and technologies vary by project; refer to each project's source code and documentation for exact implementation details.*
