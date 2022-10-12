package org.unitTesting;

public class FizzBuzz {
    public String fizzBuzz(int number) {

        if (number <= 0) {
            throw new IllegalArgumentException("Number must be greater than 0");
        } else if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }

    }
//    public static void main(String[] args){
//        FizzBuzz fizzBuzz = new FizzBuzz();
//        System.out.println(fizzBuzz.fizzBuzz(3));
//        System.out.println(fizzBuzz.fizzBuzz(10));
//        System.out.println(fizzBuzz.fizzBuzz(15));
//        System.out.println(fizzBuzz.fizzBuzz(0));
//
//    }

}
