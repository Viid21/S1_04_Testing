# 🧑‍💻 Task S1.04. Java Testing and Assertions  
**Author:** David Rey  
**Corrected by:**  

## 📄 Description  
This project includes several exercises organized by difficulty level, focusing on Java testing techniques using JUnit, AssertJ, and Test-Driven Development (TDD). The goal is to validate object behavior, exception handling, and collection integrity through structured unit tests.

### 🔹 Level 1 – JUnit  
**Exercise 1 – Library Book Collection Management**  
- Create a Java class that manages a collection of books in a library.  
- The class must allow adding books, retrieving the full list, accessing a book by position, inserting a book at a specific position, and removing a book by title.  
- Validate the functionality using JUnit tests:  
  - Ensure the list is not null after object creation.  
  - Confirm the expected size after inserting books.  
  - Verify correct book positioning.  
  - Check for absence of duplicate titles.  
  - Retrieve a book title by position.  
  - Confirm list updates after adding/removing a book.  
  - Ensure alphabetical order is maintained.

**Exercise 2 – DNI Letter Calculation**  
- Create a class named `CalculoDni` that calculates the letter of a Spanish DNI given its numeric part.  
- Write a parameterized JUnit test to validate the calculation against 10 predefined DNI numbers.

**Exercise 3 – Exception Handling Test**  
- Create a class with a method that throws an `ArrayIndexOutOfBoundsException`.  
- Write a JUnit test to verify that the exception is correctly thrown.

### 🔹 Level 2 – AssertJ  
**Exercise 1 – Integer Equality Assertions**  
- Write assertions to verify that two integer objects are equal and not equal.

**Exercise 2 – Object Reference Assertions**  
- Write assertions to confirm that two object references are the same and different.

**Exercise 3 – Array Equality Assertions**  
- Write assertions to validate that two integer arrays are identical.

**Exercise 4 – Mixed Object List Assertions**  
- Create an `ArrayList` containing various object types.  
- Write assertions to verify:  
  - The insertion order of objects.  
  - That the list contains all objects regardless of order.  
  - That a specific object appears only once.  
  - That a missing object is not present.

**Exercise 5 – Map Key Assertion**  
- Create a `Map` and verify that it contains a specific key.

**Exercise 6 – Exception Assertion**  
- Trigger an `ArrayIndexOutOfBoundsException` and assert that it is thrown correctly.

**Exercise 7 – Optional Emptiness Assertion**  
- Create an empty `Optional` and assert that it is indeed empty.

### 🔹 Level 3 – TDD  
**Exercise 1 – Calculator Development via TDD**  
- Create a test class `CalculadoraTest` with tests for basic operations: addition, subtraction, multiplication, and division.  
- Initially run the tests (they should fail).  
- Implement the `Calculadora` class with the required methods.  
- Re-run the tests and iterate using the TDD cycle:  
  - Write tests → Implement → Refactor → Repeat.

## 💻 Technologies Used  
- Java SE 24  
- IntelliJ IDEA as the development environment  
- Git & GitHub for version control  
- JDK for compiling and running the code  
- Testing Frameworks:  
  - JUnit for unit testing  
  - AssertJ for fluent assertions  
- TDD methodology for iterative development  
- Exception handling and Optional API

## 📋 Requirements  
- Java Development Kit (JDK) 24 or higher  
- IntelliJ IDEA or any Java-compatible IDE  
- Git installed to clone the repository  
- Basic knowledge of unit testing and Java syntax

## 🛠️ Installation  
- Clone the repository:  
```bash
git clone https://github.com/Viid21/S1_04_Testing.git
