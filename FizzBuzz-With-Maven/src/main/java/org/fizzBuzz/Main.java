package org.fizzBuzz;

public class Main {
    public static void main(String[] args) {

        System.out.println("Running fizzBuzz Method");
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.fizzBuzz(5);
        System.out.println("Running fizzBuzz Extension 2");
        FizzBuzz2 fizzBuzz2 = new FizzBuzz2();
        fizzBuzz2.fizzBuzzExtension2(5, 15);

        // Getting arguments from terminal
        System.out.println("Running fizzBuzz Extension 3");
        if (args.length > 0) {
            System.out.println("Arguments are: " + args[0] + " " + args[1]);
//            int x = Integer.parseInt(args[0]);
//            int y = Integer.parseInt(args[1]);
//            Validate input is greater than zero and is an integer

            if(args[0].matches("[0-9]+") && args[1].matches("[0-9]+")) {
                int x = Integer.parseInt(args[0]);
                int y = Integer.parseInt(args[1]);
                FizzBuzz2 fizzBuzz3 = new FizzBuzz2();
                fizzBuzz3.fizzBuzzExtension2(x, y);
            } else {
                throw new IllegalArgumentException("Input must be an integer");
            }


//            try {
//                x = Integer.parseInt(args[0]);
//                y = Integer.parseInt(args[1]);
//            } catch (NumberFormatException e) {
//                //If number is not integer,you wil get exception and exception message will be printed
//                System.out.println(e + " Input must be a positive integer.");
//            }
//            FizzBuzz2 fizzBuzz3 = new FizzBuzz2();
//            fizzBuzz3.fizzBuzzExtension2(x, y);

        } else {
            System.out.println("No arguments provided.");
        }

    }
}