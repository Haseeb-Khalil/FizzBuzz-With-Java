package org.unitTesting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    private FizzBuzz fizzBuzzBasic;

    @BeforeEach
    void setUp() {
        fizzBuzzBasic = new FizzBuzz();
    }

    @DisplayName("When a number provided is Zero or Negative")
    @Nested
    class ZeroOrNegativeShouldThrowException {
        @Test
        @DisplayName("Then it should throw an exception")
        void testZeroOrNegativeNumbersShouldThrowException() {
            assertAll("Verify all conditions for a zero or negative number",
                    () -> assertThrows(IllegalArgumentException.class, () -> fizzBuzzBasic.fizzBuzz(-1)),
                    () -> assertThrows(IllegalArgumentException.class, () -> fizzBuzzBasic.fizzBuzz(0)),
                    () -> assertThrows(IllegalArgumentException.class, () -> fizzBuzzBasic.fizzBuzz(-10)),
                    () -> assertThrows(IllegalArgumentException.class, () -> fizzBuzzBasic.fizzBuzz(-100))
            );
        }
    }


    @DisplayName("When a number provided is not divisible by 3, 5 or 3 and 5")
    @Nested
    class NumberNotDivisibleByThreeFiveOrThreeFiveShouldReturnNumber {

        @Test
        @DisplayName("Then it should return the number as a string")
        void testNotDivisibleByThreeFiveAndThreeAndFiveShouldReturnNumber() {
            assertEquals("1", fizzBuzzBasic.fizzBuzz(1));
            assertEquals("2", fizzBuzzBasic.fizzBuzz(2));
            assertEquals("4", fizzBuzzBasic.fizzBuzz(4));
            assertEquals("7", fizzBuzzBasic.fizzBuzz(7));
            assertEquals("11", fizzBuzzBasic.fizzBuzz(11));
            assertEquals("13", fizzBuzzBasic.fizzBuzz(13));

        }

    }

    @DisplayName("When a number provided divisible by 3")
    @Nested
    class NumberDivisibleByThreeShouldReturnFizz {

        @Test
        @DisplayName("Then it should return Fizz")
        void testNumbersDivisibleByThreeShouldReturnFizz() {
            assertEquals("Fizz", fizzBuzzBasic.fizzBuzz(3));
            assertEquals("Fizz", fizzBuzzBasic.fizzBuzz(6));
            assertEquals("Fizz", fizzBuzzBasic.fizzBuzz(63));
            assertEquals("Fizz", fizzBuzzBasic.fizzBuzz(69));
            assertEquals("Fizz", fizzBuzzBasic.fizzBuzz(99));
            assertEquals("Fizz", fizzBuzzBasic.fizzBuzz(72));
        }
    }

    @DisplayName("When a number provided is divisible by 5")
    @Nested
    class NumberDivisibleByFiveShouldReturnBuzz {

        @Test
        @DisplayName("Then it should return Buzz")
        void testNumbersDivisibleByFiveShouldReturnBuzz() {
            assertEquals("Buzz", fizzBuzzBasic.fizzBuzz(5));
            assertEquals("Buzz", fizzBuzzBasic.fizzBuzz(10));
            assertEquals("Buzz", fizzBuzzBasic.fizzBuzz(20));
            assertEquals("Buzz", fizzBuzzBasic.fizzBuzz(25));
            assertEquals("Buzz", fizzBuzzBasic.fizzBuzz(35));
            assertEquals("Buzz", fizzBuzzBasic.fizzBuzz(40));
        }
    }

    @DisplayName("When a number provided is divisible by 3 and 5")
    @Nested
    class NumberDivisibleByThreeFiveShouldReturnFizzBuzz {

        @Test
        @DisplayName("Then it should return FizzBuzz")
        void testNumbersDivisibleByThreeAndFiveShouldReturnFizzBuzz() {
            assertEquals("FizzBuzz", fizzBuzzBasic.fizzBuzz(15));
            assertEquals("FizzBuzz", fizzBuzzBasic.fizzBuzz(30));
            assertEquals("FizzBuzz", fizzBuzzBasic.fizzBuzz(45));
            assertEquals("FizzBuzz", fizzBuzzBasic.fizzBuzz(60));
            assertEquals("FizzBuzz", fizzBuzzBasic.fizzBuzz(75));
            assertEquals("FizzBuzz", fizzBuzzBasic.fizzBuzz(90));
        }
    }


}