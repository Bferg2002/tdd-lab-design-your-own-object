
# TDD Lab — Design Your Own Object

In this lab you will design and build your own Java class from scratch and write tests for it using everything you learned in class — including JUnit 5 and JaCoCo for coverage reporting.

Your goal is to hit **80% code coverage** driven entirely by your tests.

An example is provided in the **object.example** package — see `Person.java` and `PersonTest.java` for reference.

---

## How To Get Started

### Step 1 — Fork This Repo

Click the **Fork** button in the top right corner of this page.

### Step 2 — Clone Your Fork

Clone the repo to your local machine and open the project in IntelliJ.

### Step 3 — Create Your Package

Inside `src/main/java/object/` create a new package using your first and last name — all lowercase, no dashes:

```
src/main/java/object/firstnamelastname/
```

For example:
```
src/main/java/object/jordaneldridge/
```

Do the same inside `src/test/java/object/`:

```
src/test/java/object/firstnamelastname/
```

### Step 4 — Create Your Class and Test File

Inside your package create your class file and your test file:

```
src/main/java/object/firstnamelastname/YourClassName.java
src/test/java/object/firstnamelastname/YourClassNameTest.java
```

### Step 5 — Do Not Touch the Example Package

> **Do not modify anything inside `object.example` — this is the reference example only.**

---

## Running Your Tests

From the root of the project run:

```bash
mvn clean test
```

You should see output that ends with:

```
BUILD SUCCESS
```
---

## Viewing Your Coverage Report

After running `mvn clean test` open your JaCoCo report:

```bash
open target/site/jacoco/index.html
```

Click into your class name to see a method level breakdown. Your goal is **80% or above**. Any method showing 0% is a gap — write a test for it.

---

## Lab Requirements

Your class must have:
- At least **5 fields**
- A **constructor** that takes all fields as parameters
- **Getters and setters** for all fields
- At least **2 custom methods** beyond getters and setters
- At least **one validation** using `IllegalArgumentException`

Your tests must cover:
- Constructor happy path and validation
- All getters and setters
- All custom methods including happy path, edge cases, and validation
- At least one `assertThrows`
- AAA pattern visible in every test

---

## How To Submit

### Step 1 — Commit and Push Your Work

### Step 2 — Open a Pull Request


In the PR description include:
- What object you chose and why
- Your JaCoCo coverage percentage
- Anything you found challenging or interesting

---

## Important Rules

- Only add files inside **your own package** — never modify anyone else's package
- Do not modify the `object.example` package

---

## Grading Checklist

- At least 5 fields with getters and setters
- At least 2 custom methods with meaningful behavior
- Tests for constructor, getters, setters, and all custom methods
- At least one validation test using `assertThrows`
- JaCoCo coverage at 80% or above
- Correct package name — all lowercase, no dashes
- Pull Request open with correct title and description


