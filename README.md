# LeetCode Practice Project

A comprehensive Java project for practicing data structures and algorithms.

## 🚀 Project Overview

This project is built with Spring Boot 4 and Java 25 and contains implementations of various data structures and algorithmic solutions, primarily following Scott Barrett's DSA Udemy [course](https://www.udemy.com/course/data-structures-and-algorithms-java/) and Robert Lafore's Data Structures and Algorithms in Java 2nd Edition book. It also has solutions for some Leet Code problems.

## 📁 Project Structure

````
leetcode/
├── gradle/
│   ├── wrapper/
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │       ├── jonas/
│   │   │           ├── leetcode/
│   │   │               ├── dsa/
│   │   │               │   ├── laforesbook/            # Algorithms found in Robert Lafore's book
│   │   │               │   ├── scottbarrett/           # Algorithms found in Scott Barrett's DSA Udemy course
│   │   │               ├── exercises/                  # Leet Code problems solutions 
│   │   │               └── LeetcodeApplication.java
│   │   ├── resources/
│   │       └── application.yml
│   ├── test/
│       ├── java/
│           ├── com/
│               ├── jonas/
│                   ├── leetcode/
│                       ├── exercises/                  # Unit tests for Leet Code problems
├── README.md
├── build.gradle
├── gradlew
├── gradlew.bat
└── settings.gradle
````

## 🔧 Technology Stack

- **Java**: 25
- **Spring Boot**: 4.0.1
- **Build Tool**: Gradle
- **Testing**: JUnit 5

## 📚 Data Structures Covered

1. **Singly Linked List**
2. **Doubly Linked List**

## 🤝 Acknowledgments
**Scott Barrett's DSA course for the curriculum and implementations.**

**Robert Lafore's Data Structures and Algorithms in Java 2nd Edition book.**

**LeetCode platform for problem-solving practice.**