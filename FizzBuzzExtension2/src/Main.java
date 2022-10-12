public class Main {
    public static void main(String[] args) {
        System.out.println("x = " + args[0] + "," + " y = " + args[1]);
        fizzBuzzExtension2(Integer.parseInt(args[0]), Integer.parseInt(args[1]));

    }
    public static void fizzBuzzExtension2(int x, int y) {
        System.out.println("Running fizzBuzz Extension 2");
//        int fizz = 0;
//        int buzz = 0;
//        int fizzBuzz = 0;
//        if (x <= y && x >= 0) {
//            for (int i = x; i <= y; i++) {
//                if (i % 3 == 0 && i % 5 == 0) {
//                    fizzBuzz++;
//                } else if (i % 5 == 0) {
//                    buzz++;
//                } else if (i % 3 == 0) {
//                    fizz++;
//                }
//            }
//            System.out.println("Fizz: " + fizz);
//            System.out.println("Buzz: " + buzz);
//            System.out.println("FizzBuzz: " + fizzBuzz);
//        } else if (y <= x && y >= 0) {
//            for (int i = y; i <= x; i++) {
//                if (i % 3 == 0 && i % 5 == 0) {
//                    fizzBuzz++;
//                } else if (i % 5 == 0) {
//                    buzz++;
//                } else if (i % 3 == 0) {
//                    fizz++;
//                }
//            }
//            System.out.println("Fizz: " + fizz);
//            System.out.println("Buzz: " + buzz);
//            System.out.println("FizzBuzz: " + fizzBuzz);
//        } else {
//            System.out.println("Input must be greater than Zero.");
//        }

        // Advance Solution

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