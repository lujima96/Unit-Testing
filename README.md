

# Unit Testing Demo with JUnit, AssertJ & Mockito

This project demonstrates how to write effective unit tests in Java using popular libraries such as JUnit 5, AssertJ, and Mockito. The tests cover various scenarios including parameterized tests, exception handling, and the use of spies to stub behavior in methods.

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Technologies](#technologies)
- [Setup & Installation](#setup--installation)
- [Running the Tests](#running-the-tests)
- [Project Structure](#project-structure)
- [License](#license)

---

## Overview

The goal of this project is to showcase best practices in unit testing Java applications. The sample tests provided demonstrate how to:

- Verify the correctness of methods that perform arithmetic operations.
- Handle exceptions correctly using AssertJ’s exception assertions.
- Use parameterized tests to run multiple test scenarios efficiently.
- Utilize Mockito to spy on objects and control method behavior during testing.

---

## Features

- **Parameterized Testing:**  
  Tests the `addPositive` method with different sets of inputs, including both valid and invalid values.  
  - Expects correct sums for valid positive integers.
  - Throws an `IllegalArgumentException` when one or both inputs are non-positive.

- **Basic Functionality Testing:**  
  Verifies that the `halved` method correctly divides numbers by 2 and handles negative numbers as well.

- **Mockito Spy & Stubbing:**  
  Uses a spy object to stub the `getRandomInt` method, ensuring that `randomNumberSquared` computes a predictable value.

---

## Technologies

- **Java 8+**
- **JUnit 5:** For writing and running unit tests.
- **AssertJ:** For fluent assertions.
- **Mockito:** For creating spies and stubbing methods in tests.

---

## Setup & Installation

1. **Clone the Repository:**

   ```bash
   git clone https://github.com/yourusername/your-project.git
   cd your-project
   ```

2. **Build Environment:**  
   Ensure you have Java 8 or higher installed.  
   Use your favorite IDE (e.g., IntelliJ IDEA, Eclipse) or a build tool like Maven/Gradle.

3. **Dependencies:**  
   If using Maven, make sure your `pom.xml` includes dependencies for JUnit 5, AssertJ, and Mockito. For Gradle, include similar dependencies in your `build.gradle`.

---

## Running the Tests

### Using an IDE

- Open the project in your IDE.
- Navigate to the test class (`TestDemoJUnitTest.java`).
- Right-click and choose "Run" to execute the tests.

### Using Maven

Run the following command in the terminal:

```bash
mvn test
```

### Using Gradle

Run the following command in the terminal:

```bash
gradle test
```

The test output will indicate whether each test passed or failed, and it will provide details in case of any issues.

---

## Project Structure

```
.
├── README.md               # This file
├── src
│   ├── main
│   │   └── java
│   │       └── your/package/path
│   │           └── TestDemo.java         # Class containing the methods under test
│   └── test
│       └── java
│           └── your/package/path
│               └── TestDemoJUnitTest.java  # Unit tests demonstrating various techniques
└── pom.xml or build.gradle  # Build configuration file
```

---

## License

This project is licensed under the [MIT License](LICENSE).

---

Feel free to fork, contribute, or raise issues if you have any questions or suggestions regarding the tests or project implementation!

Enjoy testing!
