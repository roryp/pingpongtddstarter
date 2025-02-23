# Ping-Pong TDD Challenge

This README describes the process and steps for completing the challenge using the ping-pong TDD approach with two people. The approach emphasizes collaboration, alternating between writing tests and implementing code.

## Steps to Complete the Challenge

1. **Define roles:**
   - One person writes the tests (Red cycle) while the other writes the code (Green cycle).
   - Swap roles after each cycle.

2. **Write a small, failing test:**
   - Start with a simple test. For example, test that converting the Roman numeral "I" yields the number 1.

3. **Run the test to confirm failure:**
   - This ensures that the test is valid and the feature is not already implemented.

4. **Implement the simplest solution:**
   - Write just enough code to pass the failing test.
   - For example, implement conversion logic for "I".

5. **Run tests and verify that they pass:**
   - Make sure your new code passes all tests.

6. **Swap roles and repeat:**
   - The previous code-writer now writes the next test, such as testing that "II" converts to 2.
   - Implement the minimal changes to make the new test pass.

7. **Incrementally add functionality:**
   - Continue adding tests and updating the code for additional Roman numeral cases.
   - Refactor the code as needed while ensuring all tests remain green.

8. **Review:**
   - At the end of the cycle, review the implementations, ensuring the design is clear and the tests cover a wide range of scenarios including error cases.

## Running the Tests

To run the tests, simply run the `TestAssertions` main method. The output should indicate that all tests have passed.

## Conclusion

This ping-pong TDD approach not only helps in writing code that works but also promotes collaboration and continuous improvement. Enjoy building and extending your Roman numeral converter!