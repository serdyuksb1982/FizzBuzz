package com.gradle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FizzBuzzTest {
    @Test
    public void FizzBuzzNorm() {
        Assertions.assertEquals("11", FizzBuzz.runFizzBuzz(11));
        Assertions.assertEquals("2", FizzBuzz.runFizzBuzz(2));
    }

    @Test
    public void FizzBuzzFromThree() {
        Assertions.assertEquals("Fizz", FizzBuzz.runFizzBuzz(3));
    }

    @Test
    public void FizzBuzzFromFive() {
        Assertions.assertEquals("Buzz", FizzBuzz.runFizzBuzz(5));
    }

    @Test
    public void FizzBuzzAllNumbers() {
        Assertions.assertEquals("FizzBuzz", FizzBuzz.runFizzBuzz(15));
    }
}