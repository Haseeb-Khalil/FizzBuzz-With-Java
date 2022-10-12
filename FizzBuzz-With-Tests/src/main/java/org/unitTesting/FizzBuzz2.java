package org.unitTesting;

import java.util.ArrayList;

public class FizzBuzz2 {
    public ArrayList<String> fizzBuzz2(int a, int b) {

        ArrayList<String> result = new ArrayList<>();

        int max = Math.max(a, b);
        int min = Math.min(a, b);
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Number must be greater than 0");
        }

        for (int i = min; i <= max; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else {
                result.add(String.valueOf(i));
            }
        }
        return result;
    }


//    public static void main(String[] args) {
//        FizzBuzz2 fizzBuzz2 = new FizzBuzz2();
//        System.out.println(fizzBuzz2.fizzBuzz2(1, 100));
//    }

}