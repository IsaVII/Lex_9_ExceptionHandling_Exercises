package se.lexicon;

public class Exception_DivideZero extends Exception{
       private final int dividend;
       private final int divisor;

       //create a constructor that takes a String message as an argument
       public Exception_DivideZero(String message, int dividend, int divisor) {
           //call the superclass constructor with the message
           super(message);
           this.dividend = dividend;
           this.divisor = divisor;
       }

       public int getDividend() {
           return dividend;
       }

       public int getDivisor() {
           return divisor;
       }

       //handle the exception by printing the message to the console
       public void handle() {
           System.out.println(getMessage() + " (" + dividend + " / " + divisor + ")");
       }

}
