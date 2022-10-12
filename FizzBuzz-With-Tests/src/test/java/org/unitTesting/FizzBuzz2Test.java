package org.unitTesting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzz2Test {

    private FizzBuzz2 fizzBuzzBetweenTwoNumbers;

    @BeforeEach
    void setUp() {
        fizzBuzzBetweenTwoNumbers = new FizzBuzz2();
    }

    @DisplayName("When a numbers provided are Zero or Negative")
    @Nested
    class ZeroOrNegativeShouldThrowException {
        @Test
        @DisplayName("Then it should throw an exception")
        void testZeroOrNegativeNumbersShouldThrowException() {
            assertAll("Verify all conditions for a zero or negative number",
                    () -> assertThrows(IllegalArgumentException.class, () -> fizzBuzzBetweenTwoNumbers.fizzBuzz2(-1, -2)),
                    () -> assertThrows(IllegalArgumentException.class, () -> fizzBuzzBetweenTwoNumbers.fizzBuzz2(0, 0)),
                    () -> assertThrows(IllegalArgumentException.class, () -> fizzBuzzBetweenTwoNumbers.fizzBuzz2(-10, -100)),
                    () -> assertThrows(IllegalArgumentException.class, () -> fizzBuzzBetweenTwoNumbers.fizzBuzz2(-100, -100))
            );
        }
    }

    @DisplayName("When numbers between a and b are not divisible by 3, 5 or 3 and 5")
    @Nested
    class NumberNotDivisibleByThreeOrFiveAndThreeAndFiveShouldAddFizzToResult {

        @Test
        @DisplayName("Then it should add string number to the result")
        void testNumbersNotDivisibleByThreeOrFiveAndThreeAndFiveShouldAddStringNumberToArrayResult() {
            assertAll("Verify all conditions for non divisible of three, five three and five(Fizz)",
                    () -> assertEquals(0, Collections.frequency(fizzBuzzBetweenTwoNumbers.fizzBuzz2(1, 2), "Fizz")),
                    () -> assertEquals(0, Collections.frequency(fizzBuzzBetweenTwoNumbers.fizzBuzz2(1, 4), "Buzz")),
                    () -> assertEquals(0, Collections.frequency(fizzBuzzBetweenTwoNumbers.fizzBuzz2(1, 14), "FizzBuzz")),
                    () -> assertEquals(1, Collections.frequency(fizzBuzzBetweenTwoNumbers.fizzBuzz2(1, 2), "1")),
                    () -> assertEquals(1, Collections.frequency(fizzBuzzBetweenTwoNumbers.fizzBuzz2(1, 2), "2"))

            );
        }
    }

    @DisplayName("When numbers between a and b are divisible by 3")
    @Nested
    class NumberDivisibleByThreeShouldAddFizzToResult {

        @Test
        @DisplayName("Then it should add Fizz to the result")
        void testNumbersDivisibleByThreeShouldAddFizzToArrayResult() {
            assertAll("Verify all conditions for divisible by three(Fizz)",
                    () -> assertEquals(4, Collections.frequency(fizzBuzzBetweenTwoNumbers.fizzBuzz2(1, 15), "Fizz")),
                    () -> assertEquals(3, Collections.frequency(fizzBuzzBetweenTwoNumbers.fizzBuzz2(1, 10), "Fizz")),
                    () -> assertEquals(2, Collections.frequency(fizzBuzzBetweenTwoNumbers.fizzBuzz2(1, 6), "Fizz")),
                    () -> assertEquals(1, Collections.frequency(fizzBuzzBetweenTwoNumbers.fizzBuzz2(1, 3), "Fizz"))
            );
        }
    }

    @DisplayName("When numbers between a and b are divisible by 5")
    @Nested
    class NumberDivisibleByThreeShouldAddBuzzToResult {

        @Test
        @DisplayName("Then it should add Buzz to the result")
        void testNumbersDivisibleByThreeShouldAddFizzToArrayResult() {
            assertAll("Verify all conditions for divisible by five(Buzz)",
                    () -> assertEquals(3, Collections.frequency(fizzBuzzBetweenTwoNumbers.fizzBuzz2(1, 20), "Buzz")),
                    () -> assertEquals(2, Collections.frequency(fizzBuzzBetweenTwoNumbers.fizzBuzz2(1, 15), "Buzz")),
                    () -> assertEquals(2, Collections.frequency(fizzBuzzBetweenTwoNumbers.fizzBuzz2(1, 10), "Buzz")),
                    () -> assertEquals(1, Collections.frequency(fizzBuzzBetweenTwoNumbers.fizzBuzz2(1, 5), "Buzz"))
            );
        }
    }

    @DisplayName("When numbers between a and b are divisible by 3 and 5")
    @Nested
    class NumberDivisibleByThreeAndFiveShouldAddFizzBuzzToResult {

        @Test
        @DisplayName("Then it should add FizzBuzz to the result")
        void testNumbersDivisibleByThreeAndFiveShouldAddFizzToArrayResult() {
            assertAll("Verify all conditions for divisible by three and five(FizzBuzz)",
                    () -> assertEquals(4, Collections.frequency(fizzBuzzBetweenTwoNumbers.fizzBuzz2(1, 60), "FizzBuzz")),
                    () -> assertEquals(3, Collections.frequency(fizzBuzzBetweenTwoNumbers.fizzBuzz2(1, 45), "FizzBuzz")),
                    () -> assertEquals(2, Collections.frequency(fizzBuzzBetweenTwoNumbers.fizzBuzz2(1, 30), "FizzBuzz")),
                    () -> assertEquals(1, Collections.frequency(fizzBuzzBetweenTwoNumbers.fizzBuzz2(1, 15), "FizzBuzz"))
            );
        }
    }


}