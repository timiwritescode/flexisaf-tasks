# Java Collections Iterator Implementation

## Overview

This project implements a Java program that uses the Iterator interface to loop through lists and perform specific actions such as removing elements or modifying them during iteration.

## What Was Implemented

### Core Implementation
- **IteratorUtil Class**: A utility class with a generic method that safely iterates through lists
- **Functional Interface Integration**: Uses `BiConsumer` to allow flexible operations during iteration


### Key Features
- Generic type support for any list element type
- Safe iteration with element removal capabilities
- Element modification during iteration
- Collection filtering and processing

## Operations Demonstrated

The implementation supports several common list operations:

1. **Element Removal**: Remove elements based on conditions (e.g., remove words shorter than 4 characters)
2. **Element Modification**: Modify elements in-place (e.g., convert to uppercase)
3. **Element Collection**: Filter and collect elements into new lists
4. **Complex Operations**: Combine removal and modification in a single iteration

## Test Cases

Six comprehensive test cases were implemented to verify functionality:

1. **testRemoveElementsByCondition**: Tests conditional element removal
2. **testModifyElementsInPlace**: Tests in-place element modification
3. **testCollectElementsToAnotherList**: Tests element collection based on criteria
4. **testNoOpOperationKeepsListUnchanged**: Tests that empty operations don't affect the list
5. **testRemoveAllElements**: Tests complete list clearance
6. **testComplexOperationRemoveAndModify**: Tests combined removal and modification operations

## How to Test

### Prerequisites
- Java 17 or higher
- Maven 3.6 or higher

### Running Tests
```bash
# Navigate to the project directory
cd java_collections

# Run all tests
mvn test

# Build the project
mvn clean compile
```

### Expected Results
All 6 test cases should pass, demonstrating:
- Safe iterator-based list manipulation
- Proper handling of element removal during iteration
- Successful element modification and collection operations

## Technical Stack
- **Language**: Java 17
- **Build Tool**: Maven
- **Testing Framework**: JUnit 5
- **Key Concepts**: Iterator interface, Java Collections Framework, Functional Programming

## Learning Objectives Achieved
- Proper use of Iterator interface for safe collection traversal
- Understanding of when to use iterator removal vs collection removal
- Implementation of functional programming concepts in Java
- Comprehensive testing of collection operations

---

**Reference**: [Oracle Java Collections Tutorial](https://docs.oracle.com/javase/tutorial/collections/index.html)