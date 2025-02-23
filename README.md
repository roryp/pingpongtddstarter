# Roman to Arabic Kata with Ping Pong TDD Using JUnit Jupiter

This project demonstrates how to implement a Roman numeral converter that converts Roman numeral strings to their corresponding Arabic numeral values using a Ping Pong style of Test-Driven Development (TDD). The tests are written using JUnit Jupiter (JUnit 5).

## Prerequisites

- Java Development Kit (JDK) 21 or higher
- Maven
- An IDE or text editor of your choice

## Setup Instructions

1. Clone the repository:
   ```sh
   git clone <repository-url>
   ```
2. Navigate to the project directory:
   ```sh
   cd pingpongtddstarter
   ```
3. Build the project using Maven:
   ```sh
   mvn clean install
   ```
4. Run the tests using Maven:
   ```sh
   mvn test
   ```

## Ping Pong TDD Workflow

Follow these steps to implement the kata using a Ping Pong TDD cycle:

1. **Write a Failing Test:**
   - Start with a simple test case (e.g., converting `"I"` to `1`).
   - Create the test method in `TestAssertions.java`.

2. **Implement Minimal Code:**
   - Write just enough code in `CalculateRomanToArabic.java` to make the test pass.

3. **Run the Tests:**
   - Execute your tests using your build tool or IDE to verify that the new test passes.

4. **Refactor:**
   - Clean up your code without changing functionality.
   - Improve readability and structure.

5. **Repeat:**
   - Continue with the next test case (e.g., handling `"II"`, `"III"`, `"IV"`, etc.).
   - Gradually add support for more complex Roman numeral rules and edge cases.

---

## Suggested Test Cases

Below are some test cases to help guide your development:

- **Single Numerals:**
  - `"I"` should return `1`
  - `"V"` should return `5`
  - `"X"` should return `10`

- **Subtractive Notation:**
  - `"IV"` should return `4`
  - `"IX"` should return `9`

- **Larger Numbers:**
  - `"XL"` should return `40`
  - `"XC"` should return `90`
  - `"CD"` should return `400`
  - `"CM"` should return `900`

- **Complex Numerals:**
  - `"MCMXCIV"` should return `1994`

## Project Structure

- `src/main/java/com/example/CalculateRomanToArabic.java`: Contains the logic for converting Roman numerals to Arabic numerals.
- `src/main/java/com/example/Main.java`: The main entry point of the application.
- `src/test/java/com/example/TestAssertions.java`: Contains the test cases for the Roman numeral converter.

## License

This project is licensed under the MIT License.