package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestAssertions {

    @Test
    public void test1() {
        CalculateRomanToArabic converter = new CalculateRomanToArabic();
        assertEquals(1, converter.convert("I"));
    }

}
