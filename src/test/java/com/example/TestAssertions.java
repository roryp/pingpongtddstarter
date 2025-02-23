package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestAssertions {

    @Test
    public void test1() {
        CalculateRomanToArabic calc = new CalculateRomanToArabic();
        assertEquals(1, calc.romanToArabic("I"), "1 expected");
    }

}
