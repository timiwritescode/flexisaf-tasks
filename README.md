# Java Annotations Lesson Project

This project demonstrates the use of Java annotations as part of a learning module. It includes sample annotation definitions, annotated classes, and unit tests.

## Prerequisites

- Java JDK 21 (or latest LTS)
- Maven (for build and test management)

## Project Structure

- `src/main/java/com/flexisaf_internship/java_annotations/`  
  Contains annotation definitions and sample annotated classes.
- `src/test/java/com/flexisaf_internship/java_annotations/`  
  Contains unit tests for the annotation usage.
- `pom.xml`  
  Maven project configuration file.

## Setting Up the Project

1. **Clone the repository:**
   ```bash
   git clone <repository-url>
   cd flexisaf-tasks
   ```

2. **Ensure Java 21 is installed:**
   ```bash
   java -version
   # Should output version 21.x.x
   ```
   If not, download and install JDK 21 from [Adoptium](https://adoptium.net/) or your preferred vendor.

3. **Ensure Maven is installed:**
   ```bash
   mvn -version
   # Should output Maven version and Java 21
   ```
   If not, install Maven from [Maven Downloads](https://maven.apache.org/download.cgi).

## Building the Project

To compile the source code and generate the JAR file:

```bash
mvn clean package
```

The compiled classes and JAR will be in the `target/` directory.

## Running the Tests

To execute all unit tests:

```bash
mvn test
```

Test reports will be generated in `target/surefire-reports/`.

## About the Lesson

This project is designed to help you understand:
- How to define custom Java annotations
- How to use annotations in Java classes
- How to write tests for annotated code

Explore the `java_annotations` package for examples and test cases.

---

For any issues, please open an issue in this repository.
