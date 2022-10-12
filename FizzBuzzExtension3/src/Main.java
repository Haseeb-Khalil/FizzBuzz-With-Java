

public class Main {
    public static void main(String[] args) {
        fizzBuzzExtension3(3, 3);

    }

    public static void fizzBuzzExtension3(int x, int y) {
        System.out.println("Running fizzBuzz Extension 3");
        int fizz = 0;
        int buzz = 0;
        int fizzBuzz = 0;



        if (x <= y && x > 0) {
            for (int i = x; i <= y; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    fizzBuzz++;
                } else if (i % 5 == 0) {
                    buzz++;
                } else if (i % 3 == 0) {
                    fizz++;
                }
            }

            System.out.println("===============");

            System.out.println("Fizz: " + fizz);
            System.out.println("Buzz: " + buzz);
            System.out.println("FizzBuzz: " + fizzBuzz);
        } else if (y <= x && y > 0) {
            for (int i = y; i <= x; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    fizzBuzz++;
                } else if (i % 5 == 0) {
                    buzz++;
                } else if (i % 3 == 0) {
                    fizz++;
                }
            }

            System.out.println("===============");

            System.out.println("Fizz: " + fizz);
            System.out.println("Buzz: " + buzz);
            System.out.println("FizzBuzz: " + fizzBuzz);
        } else {
            System.out.println("Input must be greater than Zero.");
        }
    }
}