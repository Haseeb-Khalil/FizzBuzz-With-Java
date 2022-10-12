package org.fizzBuzz;

public class FizzBuzz2 {
    public void fizzBuzzExtension2(int x, int y) {
        int fizz = 0;
        int buzz = 0;
        int fizzBuzz = 0;

        int smlNum = Math.min(x, y);
        int bigNum = Math.max(x, y);
        if (x > 0 && y > 0) {
            for (int i = smlNum; i <= bigNum; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    fizzBuzz++;
                } else if (i % 5 == 0) {
                    buzz++;
                } else if (i % 3 == 0) {
                    fizz++;
                }
            }
            System.out.println("Fizz: " + fizz);
            System.out.println("Buzz: " + buzz);
            System.out.println("FizzBuzz: " + fizzBuzz);
        } else {
            System.out.println("Input must be greater than Zero.");
        }

    }
}
