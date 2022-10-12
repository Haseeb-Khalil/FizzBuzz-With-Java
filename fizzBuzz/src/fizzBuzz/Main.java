package fizzBuzz;

public class Main {
    public static void main(String[] args) {
        fizzBuzz(5);

    }
    public static void fizzBuzz(int number){
        System.out.println("Running fizzBuzz Method");
        if (number > 0) {
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (number % 5 == 0) {
                System.out.println("Buzz");
            } else if (number % 3 == 0) {
                System.out.println("Fizz");
            } else {
                String stringNumber = Integer.toString(number); // Converting number into string
                System.out.println(stringNumber);
            }
        }else {
            System.out.println("Input must be greater than Zero.");
        }

    }
}