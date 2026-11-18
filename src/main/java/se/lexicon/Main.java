package se.lexicon;


public class Main {
    int a = 10;
    int b = 0;

    void main() {

        // Exercise 1: Basic Exception Handling
       a = getUserInput();
       b = getUserInput();
        try {
            int c = a / b;
            IO.println("Result: " + c);
        } catch (ArithmeticException e) {
            ExceptionHandler.handle(e);
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
