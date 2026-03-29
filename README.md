[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/pG3gvzt-)
# PCCCS495 – Term II Project

## Project Title
Student Attendance Management 
---

## Problem Statement (max 150 words)
In many schools and colleges, attendance is still recorded manually using registers or spreadsheets, which is time-consuming and prone to errors. Managing attendance for multiple students becomes difficult, especially when calculating attendance percentages or tracking records over time.
This project aims to develop a console-based Student Attendance Management System using Object-Oriented Programming concepts. The system will allow users to add students, mark attendance, view attendance records, and calculate attendance percentages efficiently. It improves accuracy, reduces manual effort, and provides a structured way to manage student attendance data.
---

## Target user
---Teachers
	•	School / College Administrators


## Core Features
•	Add new students
	•	View student list
	•	Mark attendance (Present / Absent)
	•	View attendance records
	•	Calculate attendance percentage
	•	Handle invalid inputs using exception handling

- 
- 
- 

---

## OOP Concepts Used
- Abstraction:Abstraction is implemented by separating the business logic into service classes, hiding internal implementation and exposing only necessary methods like adding students and marking attendance.
- Inheritance:Inheritance can be used by creating a base class Person and extending it into a Student class to reuse common properties like name.
- Polymorphism:Polymorphism is achieved through method overriding or overloading, allowing different implementations of methods such as displaying student or attendance details.
- Exception Handling:Exception handling is used to manage invalid inputs such as incorrect menu options or wrong student IDs, ensuring the program does not crash.
- Collections / Threads:ArrayList (from Java Collections Framework) is used to store student and attendance data dynamically.

---

## Proposed Architecture Description
The system follows a modular architecture with different layers. The Student class stores student details, and the Attendance class maintains attendance records. A repository layer manages data storage using ArrayList. The service layer contains the main logic for adding students, marking attendance, and calculating percentages. The main class provides a menu-driven interface for user interaction. This design ensures proper separation of concerns and demonstrates effective use of OOP principles.
---

## How to Run
Install Java (JDK 8 or above)
	2.	Open the project in an IDE (IntelliJ / Eclipse / VS Code)
  
	3.	Compile the program using:
---javac Main.java


## Git Discipline Notes
Minimum 10 meaningful commits required.
•	Minimum 10 meaningful commits are required
	•	Each commit should represent a specific change or feature
	•	Example commits:
	•	Added Student class
	•	Implemented attendance feature
	•	Added percentage calculation
	•	Improved error handling
