package se.lexicon;


public class Main {
    int a = 10;
    int b = 0;

    void main() {
        Exercise_1();
    }


    void Exercise_2(){
        // Exercise 2: Exception Handling with User Input
        int min = 1;
        int max = 100;
        int userInput = getUserInputInRange(min, max);
        IO.println("You entered: " + userInput);
    }




    void Exercise_1(){
        // Exercise 1: Basic Exception Handling
        a = getUserInput();
        b = getUserInput();
        try {
            int c = a / b;
            IO.println("Result: " + c);
        } catch (ArithmeticException e) {
            ExceptionHandler.handle(e);
        }
        finally {
            IO.println("End of Exercise 1");
        }
    }
    
    


    int getUserInputInRange(int min, int max) {
        while (true) {
            String input = IO.readln("Enter a number between " + min + " and " + max + ": ");
            try {
                int number = Integer.parseInt(input);
                if (number < min || number > max) {
                    throw new IllegalArgumentException("Number out of range: " + number);
                }
                return number;
            } catch (NumberFormatException e) {
                ExceptionHandler.handle(e);
            } catch (IllegalArgumentException e) {
                ExceptionHandler.handle(e);
            }
        }
    }

    int getUserInput() {
        while (true) {
            String input = IO.readln("Enter a number: ");
            try {
                int number = Integer.parseInt(input);
                return number;
            } catch (NumberFormatException e) {
                ExceptionHandler.handle(e);
            }
        }
    }

}
