# Flexisaf Tasks

This repository contains solutions to the **Flexisaf** Internship Backend Track (Intermediate Level).
The repository follows a monorepository structure, where each solution is organized as a Maven module. Maven is used for both build automation and dependency management.

## Project Structure

```text
flexisaf-internship/           # Root project (parent POM)
│── pom.xml                    # Parent Maven configuration
│── README.md                  # Overview and navigation
│
├── task1/                     # Module 1: Solution for Task 1
│   ├── pom.xml
│   └── README.md              # Instructions for Task 1
│
├── task2/                     # Module 2: Solution for Task 2
│   ├── pom.xml
│   └── README.md              # Instructions for Task 2
│
├── task3/                     # Module 3: Solution for Task 3
│   ├── pom.xml
│   └── README.md              # Instructions for Task 3
│
└── ...                        # Additional tasks/modules

```
## Module Instructions
Each module contains its own README.md with task-specific details and instructions.
- Task 1
- Task 2
- Task 3 
- _(and so on)_

## Build & Run
- Build all modules:
```bash
$ mvn clean install
```

- Build a specific module(e.g., `task1`)
```bash
$ mvn clean install -pl task1
```