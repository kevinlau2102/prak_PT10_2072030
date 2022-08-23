package com.example.prak_pt10_2072030;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestClassTest {
    static TestClass test;
    @BeforeAll
    static void setUp() {
        test = new TestClass();
    }

    @Test
    void divideByThree() {
        assertEquals("Fizz", test.divideByThree(3));
    }

    @Test
    void divideByFive() {
        assertEquals("Buzz", test.divideByFive(5));
    }

    @Test
    void divideByThreeFive() {
        assertEquals("FizzBuzz", test.divideByThreeFive(15));
    }
}