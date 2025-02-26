# Roman Numeral Converter Solution

## Overview
This solution implements a web application that converts Roman numerals to Arabic numbers. The application follows a Test-Driven Development (TDD) approach and is built using Spring Boot framework.

## Project Structure
The project is organized as follows:

```
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── example/
│   │           ├── CalculateRomanToArabic.java    # Core conversion logic
│   │           ├── RomanNumeralController.java    # Web controller
│   │           └── RomanNumeralConverterApplication.java  # Application entry point
│   └── resources/
│       └── templates/
│           └── index.html                        # Frontend UI
└── test/
    └── java/
        └── com/
            └── example/
                └── TestAssertions.java           # Test cases
```

## Components

### 1. Core Conversion Logic (CalculateRomanToArabic.java)
The `CalculateRomanToArabic` class contains the algorithm to convert Roman numerals to Arabic numbers. The implementation:

- Processes the Roman numeral string from right to left
- Uses the subtraction principle (e.g., IV = 5-1 = 4) by comparing current value with previous value
- Includes a mapping function for individual Roman numeral characters
- Handles edge cases such as null or empty inputs

Main conversion algorithm:
1. If the Roman numeral is null or empty, return 0
2. Process each character from right to left
3. If the current character's value is greater than or equal to previous value, add to result
4. Otherwise, subtract from result (handles cases like IV where I is less than V)

### 2. Web Controller (RomanNumeralController.java)
The controller handles HTTP requests:

- GET `/` - Displays the main page with the conversion form
- POST `/convert` - Processes form submission, performs conversion, and returns results

The controller uses dependency injection to access the conversion service and passes the converted value to the view using Spring's Model.

### 3. Frontend Interface (index.html)
The application provides a clean, responsive user interface that:

- Shows an input form for entering Roman numerals
- Displays conversion results or error messages
- Includes helpful instructions on valid Roman numerals and examples

### 4. Test Implementation (TestAssertions.java)
The solution includes test cases for the conversion logic:

- Currently tests conversion of "I" to 1
- Additional tests would be required for comprehensive testing of other Roman numerals and edge cases

## Technology Stack
- **Java 21**: Core programming language
- **Spring Boot 3.2.1**: Web application framework
- **Thymeleaf**: Server-side HTML templating
- **JUnit 5**: Testing framework
- **Maven**: Build and dependency management

## Running the Application
To run the application:

1. Ensure you have Java 21 and Maven installed
2. Build the project: `mvn clean package`
3. Run the application: `java -jar target/pingpongtdd-1.0-SNAPSHOT.jar`
4. Access the web interface at: `http://localhost:8080`

## Future Enhancements
Potential improvements to consider:

1. Add validation for proper Roman numeral format
2. Implement bidirectional conversion (Arabic to Roman)
3. Expand test coverage for edge cases and all Roman numeral combinations
4. Add logging for monitoring and troubleshooting
5. Implement a REST API for programmatic access