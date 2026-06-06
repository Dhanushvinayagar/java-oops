# How Java Code Executes

## Overview

Computers can only understand **machine code** (binary instructions made of `0`s and `1`s).

Java programs are written in a human-readable format, so they must be translated into machine code before the CPU can execute them.

Java achieves this using **Bytecode** and the **Java Virtual Machine (JVM)**.

---

# Java Execution Flow

```text
Java Source Code (.java)
          │
          ▼
      javac Compiler
          │
          ▼
    Bytecode (.class)
          │
          ▼
         JVM
          │
          ▼
     JIT Compiler
          │
          ▼
     Machine Code
          │
          ▼
      CPU Executes
```

---

# Step 1: Write Java Source Code

Java programs are written in files with the `.java` extension.

Example:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

File name:

```text
Main.java
```

---

# Step 2: Compilation

The Java compiler (`javac`) converts the source code into **Bytecode**.

Command:

```bash
javac Main.java
```

Output:

```text
Main.class
```

### What is Bytecode?

Bytecode is an intermediate representation of Java code.

- Not human-readable Java code
- Not machine code
- Can be executed by any JVM

Because bytecode is platform-independent, the same `.class` file can run on different operating systems.

---

# Step 3: JVM Loads the Bytecode

To run the program:

```bash
java Main
```

The **Java Virtual Machine (JVM)** performs the following tasks:

1. Loads the `.class` file
2. Verifies bytecode for safety
3. Allocates memory
4. Converts bytecode into machine code
5. Executes the machine code

---

# Step 4: JIT Compilation

Modern JVMs use a **JIT (Just-In-Time) Compiler**.

The JIT compiler:

- Identifies frequently executed code
- Converts it into native machine code
- Stores the compiled version for reuse

This significantly improves performance.

```text
Bytecode
   │
   ▼
JIT Compiler
   │
   ▼
Machine Code
   │
   ▼
CPU Execution
```

---

# Why Java is Platform Independent

Java follows the principle:

> Write Once, Run Anywhere (WORA)

The compiled bytecode (`.class`) is the same on all operating systems.

```text
           Main.class
                │
      ┌─────────┼─────────┐
      ▼         ▼         ▼
   JVM      JVM       JVM
Windows    Linux     macOS
      │         │         │
      ▼         ▼         ▼
 Machine   Machine   Machine
   Code      Code      Code
```

### Important

- Java Bytecode is **Platform Independent**
- JVM is **Platform Dependent**

Each operating system has its own JVM implementation that converts bytecode into machine code for that platform.

---

# JDK, JRE, and JVM

## JVM (Java Virtual Machine)

The JVM is responsible for executing Java programs.

### Responsibilities

- Loads bytecode
- Verifies bytecode
- Manages memory
- Performs garbage collection
- Executes code using JIT
- Converts bytecode to machine code

---

## JRE (Java Runtime Environment)

JRE provides everything required to **run** Java applications.

### Contains

- JVM
- Java Libraries
- Runtime Components

### Does Not Contain

- Compiler (`javac`)
- Development tools

Use JRE when you only need to run Java programs.

---

## JDK (Java Development Kit)

JDK is used for developing Java applications.

### Contains

- JRE
- JVM
- Compiler (`javac`)
- Archiver (`jar`)
- Debugging tools
- Documentation tools

Use JDK when writing, compiling, and running Java programs.

---

# Relationship Between JDK, JRE, and JVM

```text
JDK
 └── JRE
      └── JVM
```

Meaning:

- JVM is inside JRE
- JRE is inside JDK

---

# JVM Memory Areas

## Stack Memory

Stores:

- Method calls
- Local variables
- References

Example:

```java
int age = 20;
```

`age` is stored in stack memory.

---

## Heap Memory

Stores:

- Objects
- Arrays

Example:

```java
Student s = new Student();
```

The `Student` object is stored in heap memory.

---

# Compile Time vs Run Time

## Compile Time

Source code is converted into bytecode.

```text
Main.java
    │
    ▼
 javac
    │
    ▼
Main.class
```

Steps:

1. Write Java code
2. Compile using `javac`
3. Generate bytecode (`.class`)

---

## Run Time

Bytecode is executed by the JVM.

```text
Main.class
    │
    ▼
 JVM
    │
    ▼
 JIT Compiler
    │
    ▼
 Machine Code
    │
    ▼
 CPU Execution
```

Steps:

1. JVM loads bytecode
2. Bytecode verification occurs
3. Memory is allocated
4. JIT converts bytecode into machine code
5. CPU executes the machine code

---

# Quick Summary

| Component | Purpose |
|------------|----------|
| `.java` | Java source code |
| `javac` | Java compiler |
| `.class` | Bytecode file |
| JVM | Executes bytecode |
| JIT Compiler | Converts bytecode to machine code |
| JRE | Environment for running Java applications |
| JDK | Development toolkit for Java |
| Stack | Stores local variables and method calls |
| Heap | Stores objects and arrays |

---

# Final Execution Flow

```text
1. Write Code
      │
      ▼
   Main.java
      │
      ▼
2. Compile
   javac Main.java
      │
      ▼
   Main.class
      │
      ▼
3. Run
   java Main
      │
      ▼
4. JVM Loads Bytecode
      │
      ▼
5. JIT Converts to Machine Code
      │
      ▼
6. CPU Executes Program
```

### One-Line Summary

**Java Source Code (.java) → Compiler (javac) → Bytecode (.class) → JVM → JIT Compiler → Machine Code → CPU Execution**