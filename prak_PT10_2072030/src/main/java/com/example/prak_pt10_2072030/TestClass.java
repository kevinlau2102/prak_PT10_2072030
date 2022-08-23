package com.example.prak_pt10_2072030;

public class TestClass {

    public String divideByThree(int n) {
        if (n % 3 == 0) {
            return "Fizz";
        }
        else {
            return "Not Fizz";
        }
    }

    public String divideByFive(int n) {
        if (n % 5 == 0) {
            return "Buzz";
        } else {
            return "Not Buzz";
        }
    }

    public String divideByThreeFive(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        } else {
            return "Not FizzBuzz";
        }
    }
}
