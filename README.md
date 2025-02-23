# Ping Pong TDD Starter

![Ping Pong TDD](pingpingtdd.gif)

Welcome to the **Ping Pong TDD Starter** project. This project is designed to illustrate test-driven development (TDD) principles through a simple example.

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

## Getting Started

1. **Clone the Repository**
   
   ```bash
   git clone <repository-url>
   ```

2. **Import the Project**
   
   Open the project in your favorite IDE (such as Eclipse or IntelliJ IDEA).

3. **Build the Project**
   
   Use Maven to build the project:
   
   ```bash
   mvn clean install
   ```

4. **Run the Tests**
   
   Execute the tests to verify everything is working:
   
   ```bash
   mvn test
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

---