# Ping Pong TDD Starter

Vibe coding with [GitHub Copilot](vibecode.md) overview.

Prefer the audio? NoteBookllm audio overview: [Audio](audio.wav)

![Ping Pong TDD](pingpingtdd.gif)

Welcome to the **Ping Pong TDD Starter** with [Github Copilot](https://docs.github.com/en/copilot). This project is designed to help you practice Test-Driven Development (TDD) using a collaborative approach. The goal is to implement a Roman numeral to Arabic numeral converter through a series of small, incremental steps, alternating between writing tests and implementing code.

<h2>Problem description</h2>

The Kata says you should write a function to convert from Roman Numerals to decimal numerals.
In order to keep the kata light, we will not check for valid Roman Numeral.

Roman numerals, the numeral system of ancient Rome, uses combinations of letters from the Latin alphabet to signify values. 
They are based on seven symbols:

| Symbol  | Value    |
| ------- | -------- |
| I       |    1     |
| V       |    5     |
| X       |   10     |
| L       |   50     |
| C       |  100     |
| D       |  500     |
| M       | 1000     |

Numbers are formed by combining symbols together and adding the values. 
Generally, symbols are placed in order of value, starting with the largest values. 
When smaller values precede larger values, 
the smaller values are subtracted from the larger values, 
and the result is added to the total. 

Example:

| Roman Number  | Computation                                    | Value      | Comment                         |
| ------------- | ---------------------------------------------- | ---------- | ------------------------------- |
| MMVI          |  1000 + 1000 + 5 + 1                           | 2006       | only addition                   |
| MCMXLIV       |   1000 + (1000 - 100) + (50 - 10) + (5 - 1)    | 1944       | addition and substraction       |

There is also no need to be able to convert numbers larger than 3000 (The Romans themselves didn't tend to go any higher).
(Solution can be found in the Solution branch)

## Setting Up Your Environment

We encourage you to attempt the challenge and learn the latest AI-powered coding features available in Visual Studio Code Insiders and GitHub Copilot. Follow these steps to set up your environment:

### 1. Install Visual Studio Code Insiders
Download the latest daily build of Visual Studio Code Insiders, which provides early access to cutting-edge features and improvements. You can install it side-by-side with your stable version if needed.

- **Download:** [Visual Studio Code Insiders](https://code.visualstudio.com/insiders/)

### 2. Install [GitHub.copilot](https://marketplace.visualstudio.com/items?itemName=GitHub.copilot)

### 3. Enable Copilot Next Edit Suggestions
Copilot Next Edit Suggestions (NES) is designed to enhance your editing workflow by providing context-aware code suggestions—even when modifying existing code.

- **Setup Steps:**
  - Open your VS Code Insiders settings.
  - Enable the setting by adding the following to your `settings.json`:
    ```json
    "github.copilot.nextEditSuggestions.enabled": true
    ```
  - Alternatively, use the Settings UI to search for "Copilot Next Edit Suggestions" and toggle it on.
  - We recommend setting the model to `gpt-4o-copilot` by adding the following line to your `settings.json`:
    ```json
    "github.copilot.selectedCompletionModel": "gpt-4o-copilot",
    ```
  - Reload VS Code to apply the changes.
  - As you code, notice the ghost text suggestions; use the Tab key to navigate and accept them.

For additional context, see the [Copilot Next Edit Suggestions blog post](https://code.visualstudio.com/blogs/2025/02/12/next-edit-suggestions).

### 4. Install the Java extension pack
If not already installed, install the [Java extension pack](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack) in VS Code Insiders to enable Java development features.

### 5. Enable Agent Mode for GitHub Copilot
Agent mode takes your coding assistance to the next level. In this mode, GitHub Copilot can iterate on its own suggestions, identify errors, and even propose terminal commands to help complete tasks autonomously.

- **Setup Steps:**
  - Ensure you're running VS Code Insiders.
  - Open the Copilot Edits panel in VS Code.
  - In the panel, switch the mode from "Edit" to "Agent" (this option is typically available near the model picker in the Copilot Chat interface).
  - Confirm that the Agent mode setting is enabled in your settings.
  - With Agent mode active, Copilot will not only suggest inline code changes but also infer and complete related subtasks.

For more details on Agent mode, refer to the [GitHub Copilot: The Agent Awakens blog post](https://github.blog/news-insights/product-news/github-copilot-the-agent-awakens).

## Project Structure

```
pom.xml
README.md
src/
  main/
    java/
      com/
        example/
          CalculateRomanToArabic.java
  test/
    java/
      com/
        example/
          TestAssertions.java
```

## Maven Configuration Details

This project uses Maven for dependency management and build automation. The `pom.xml` file contains the following key configurations:

- Java version: 17
- JUnit Jupiter for unit testing
- Maven Surefire Plugin for test execution
- Maven Compiler Plugin for compilation

Maven handles all dependencies and build processes automatically, allowing you to focus on the TDD practice without worrying about configuration.

## Running Tests Locally

You can run the tests in several ways:

### Using Maven Command Line

```bash
# Run all tests in the project
mvn test

# Run a specific test class
mvn -Dtest=TestAssertions test

# Run a specific test method
mvn -Dtest=TestAssertions#testIV test
```

### Using VS Code

1. Open the test file in the editor
2. Click on the "Run Test" button appearing above the test method
3. Alternatively, use the Test Explorer panel to run individual or all tests
4. You can also right-click on a test method or class and select "Run Test"

### Using VS Code Terminal

You can open the integrated terminal in VS Code and run Maven commands directly:

```bash
./mvnw test    # Use this on Unix/macOS
mvnw.cmd test  # Use this on Windows
```

## Usage

Implement new features following TDD practices. Write a failing test first, then implement the minimal code to pass the test, and finally refactor the code.

## First 20 Steps of Ping Pong TDD

Below are the first 20 steps, alternating between Player 1 (writing tests) and Player 2 (writing code).

### Step 1: Player 1 - Test for "I" = 1

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAssertions {
    @Test
    public void testI() {
        CalculateRomanToArabic converter = new CalculateRomanToArabic();
        assertEquals(1, converter.convert("I"));
    }
}
```

### Step 2: Player 2 - Implement "I"

```java
public class CalculateRomanToArabic {
    public int convert(String roman) {
        if ("I".equals(roman)) {
            return 1;
        }
        return 0;
    }
}
```

### Step 3: Player 1 - Test for "V" = 5

```java
@Test
public void testV() {
    CalculateRomanToArabic converter = new CalculateRomanToArabic();
    assertEquals(5, converter.convert("V"));
}
```

### Step 4: Player 2 - Implement "V"

```java
public int convert(String roman) {
    if ("I".equals(roman)) {
        return 1;
    } else if ("V".equals(roman)) {
        return 5;
    }
    return 0;
}
```

### Step 5: Player 1 - Test for "X" = 10

```java
@Test
public void testX() {
    CalculateRomanToArabic converter = new CalculateRomanToArabic();
    assertEquals(10, converter.convert("X"));
}
```

### Step 6: Player 2 - Implement "X"

```java
public int convert(String roman) {
    if ("I".equals(roman)) {
        return 1;
    } else if ("V".equals(roman)) {
        return 5;
    } else if ("X".equals(roman)) {
        return 10;
    }
    return 0;
}
```

### Step 7: Player 1 - Test for "L" = 50

```java
@Test
public void testL() {
    CalculateRomanToArabic converter = new CalculateRomanToArabic();
    assertEquals(50, converter.convert("L"));
}
```

### Step 8: Player 2 - Implement "L"

```java
public int convert(String roman) {
    if ("I".equals(roman)) {
        return 1;
    } else if ("V".equals(roman)) {
        return 5;
    } else if ("X".equals(roman)) {
        return 10;
    } else if ("L".equals(roman)) {
        return 50;
    }
    return 0;
}
```

### Step 9: Player 1 - Test for "C" = 100

```java
@Test
public void testC() {
    CalculateRomanToArabic converter = new CalculateRomanToArabic();
    assertEquals(100, converter.convert("C"));
}
```

### Step 10: Player 2 - Implement "C"

```java
public int convert(String roman) {
    if ("I".equals(roman)) {
        return 1;
    } else if ("V".equals(roman)) {
        return 5;
    } else if ("X".equals(roman)) {
        return 10;
    } else if ("L".equals(roman)) {
        return 50;
    } else if ("C".equals(roman)) {
        return 100;
    }
    return 0;
}
```

### Step 11: Player 1 - Test for "D" = 500

```java
@Test
public void testD() {
    CalculateRomanToArabic converter = new CalculateRomanToArabic();
    assertEquals(500, converter.convert("D"));
}
```

### Step 12: Player 2 - Implement "D"

```java
public int convert(String roman) {
    if ("I".equals(roman)) {
        return 1;
    } else if ("V".equals(roman)) {
        return 5;
    } else if ("X".equals(roman)) {
        return 10;
    } else if ("L".equals(roman)) {
        return 50;
    } else if ("C".equals(roman)) {
        return 100;
    } else if ("D".equals(roman)) {
        return 500;
    }
    return 0;
}
```

### Step 13: Player 1 - Test for "M" = 1000

```java
@Test
public void testM() {
    CalculateRomanToArabic converter = new CalculateRomanToArabic();
    assertEquals(1000, converter.convert("M"));
}
```

### Step 14: Player 2 - Implement "M"

```java
public int convert(String roman) {
    if ("I".equals(roman)) {
        return 1;
    } else if ("V".equals(roman)) {
        return 5;
    } else if ("X".equals(roman)) {
        return 10;
    } else if ("L".equals(roman)) {
        return 50;
    } else if ("C".equals(roman)) {
        return 100;
    } else if ("D".equals(roman)) {
        return 500;
    } else if ("M".equals(roman)) {
        return 1000;
    }
    return 0;
}
```

### Step 15: Player 1 - Test for "II" = 2

```java
@Test
public void testII() {
    CalculateRomanToArabic converter = new CalculateRomanToArabic();
    assertEquals(2, converter.convert("II"));
}
```

### Step 16: Player 2 - Refactor for Multi-Character Addition

```java
public int convert(String roman) {
    int total = 0;
    for (char c : roman.toCharArray()) {
        switch (c) {
            case 'I': total += 1; break;
            case 'V': total += 5; break;
            case 'X': total += 10; break;
            case 'L': total += 50; break;
            case 'C': total += 100; break;
            case 'D': total += 500; break;
            case 'M': total += 1000; break;
        }
    }
    return total;
}
```

### Step 17: Player 1 - Test for "III" = 3

```java
@Test
public void testIII() {
    CalculateRomanToArabic converter = new CalculateRomanToArabic();
    assertEquals(3, converter.convert("III"));
}
```

### Step 18: Player 2 - No Change Needed

The current implementation passes the test for "III".

### Step 19: Player 1 - Test for "IV" = 4

```java
@Test
public void testIV() {
    CalculateRomanToArabic converter = new CalculateRomanToArabic();
    assertEquals(4, converter.convert("IV"));
}
```

### Step 20: Player 2 - Implement Subtractive Notation

```java
public int convert(String roman) {
    int total = 0;
    int prevValue = 0;
    for (int i = roman.length() - 1; i >= 0; i--) {
        int value = getValue(roman.charAt(i));
        if (value < prevValue) {
            total -= value;
        } else {
            total += value;
        }
        prevValue = value;
    }
    return total;
}

private int getValue(char c) {
    switch (c) {
        case 'I': return 1;
        case 'V': return 5;
        case 'X': return 10;
        case 'L': return 50;
        case 'C': return 100;
        case 'D': return 500;
        case 'M': return 1000;
        default: return 0; // Simplified for demo
    }
}
```

---

## Final Code After 20 Steps

### TestAssertions.java

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAssertions {
    @Test
    public void testI() { assertEquals(1, new CalculateRomanToArabic().convert("I")); }
    @Test
    public void testV() { assertEquals(5, new CalculateRomanToArabic().convert("V")); }
    @Test
    public void testX() { assertEquals(10, new CalculateRomanToArabic().convert("X")); }
    @Test
    public void testL() { assertEquals(50, new CalculateRomanToArabic().convert("L")); }
    @Test
    public void testC() { assertEquals(100, new CalculateRomanToArabic().convert("C")); }
    @Test
    public void testD() { assertEquals(500, new CalculateRomanToArabic().convert("D")); }
    @Test
    public void testM() { assertEquals(1000, new CalculateRomanToArabic().convert("M")); }
    @Test
    public void testII() { assertEquals(2, new CalculateRomanToArabic().convert("II")); }
    @Test
    public void testIII() { assertEquals(3, new CalculateRomanToArabic().convert("III")); }
    @Test
    public void testIV() { assertEquals(4, new CalculateRomanToArabic().convert("IV")); }
}
```

### CalculateRomanToArabic.java

```java
public class CalculateRomanToArabic {
    public int convert(String roman) {
        int total = 0;
        int prevValue = 0;
        for (int i = roman.length() - 1; i >= 0; i--) {
            int value = getValue(roman.charAt(i));
            if (value < prevValue) {
                total -= value;
            } else {
                total += value;
            }
            prevValue = value;
        }
        return total;
    }

    private int getValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0; // Simplified for demo
        }
    }
}
```

---

## Next Steps

Continue the Ping Pong TDD process by adding tests for cases like `"VI"` (6), `"IX"` (9), `"XL"` (40), and handling invalid inputs. This builds a robust converter incrementally.

## Solve with GitHub Copilot chat agent mode

To solve this Roman numeral conversion problem using GitHub Copilot's agent mode:

1. Open the GitHub Copilot chat panel in VS Code
2. Switch to "Agent" mode in the interface
3. Prompt Copilot with a specific request like: "Solve and run the tests until the number 2999"
4. Observe how Copilot:
   - Analyzes the existing code and tests
   - Creates new test cases incrementally
   - Implements code to handle those tests
   - Refactors for efficiency and readability
   - Validates the solution with all test cases

Agent mode is particularly effective for TDD as it understands the concept of incremental development and can reason about test coverage and edge cases.

## Additional Resources

- [Martin Fowler's Guide to TDD](https://martinfowler.com/articles/practical-test-pyramid.html)
- [Roman Numeral Conversion Rules](https://en.wikipedia.org/wiki/Roman_numerals)
- [GitHub Copilot Documentation](https://docs.github.com/en/copilot)
- [JUnit 5 User Guide](https://junit.org/junit5/docs/current/user-guide/)
