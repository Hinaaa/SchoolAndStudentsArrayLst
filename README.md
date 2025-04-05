# SchoolStudentManagement

## Overview:
This project manages a school’s student records. It allows adding, removing, finding, and displaying students in a school system. The project uses an `ArrayList` to dynamically store and manage student data.

## How It Works:

### **Student Class**:
Represents a student with the following attributes:
- First Name
- Last Name
- Student ID

The class provides getter and setter methods to access and modify the student data.

### **School Class**:
Manages a list of `Student` objects and provides operations such as:
- Adding students to the list
- Displaying all students
- Finding a specific student by ID
- Removing a student from the list

### **Main Class**:
Demonstrates the functionality of the `School` class by performing operations like:
- Adding new students to the school
- Finding a student by their details
- Removing a student from the school’s list
- Displaying the updated student list

## Key Concepts:
- **ArrayList**: Used to store student objects dynamically.
- **CRUD Operations**: Create (Add), Read (Find), Update (Modify), and Delete (Remove) operations on student records.

## Files:
- **Main.java**: Contains the entry point of the program and demonstrates how to interact with the `School` class.
- **Student.java**: Defines the structure of a student and contains their attributes.
- **School.java**: Manages the student list and provides methods to add, remove, find, and display students.

## Requirements:
- **Java 17+**
- IDE (e.g., IntelliJ IDEA or Eclipse)
