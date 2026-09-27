# Library Management System

A simple console-based Library Management System developed in Java. The application allows users to manage books and students, issue and return books, and view available library records.

## Features

- Add new books
- Add students
- Issue books to students
- Return books
- View all books
- View all students
- Track whether a book is issued
- Track the number of books borrowed by each student
- Search books and students using their IDs

## Tech Stack

- Java
- Object-Oriented Programming (OOP)
- Java Collections Framework
- ArrayList
- Scanner
- Console-based application

## Project Structure

```text
Library-Management-System/
│
├── book.java
├── student.java
└── library.java
```

How It Works

The application maintains separate collections for books and students.

Books are represented using the book class, which stores information such as book ID, book name, author name, and issue status.

Students are represented using the student class, which stores student information and the books borrowed by the student.

The library class provides the main menu and handles operations such as adding books, adding students, issuing books, returning books, and displaying records.


User → Main Menu → Library Management System → Issue/Return Book → Records Updated → Display Records
