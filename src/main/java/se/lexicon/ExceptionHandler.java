package se.lexicon;

import java.io.IOException;

public class ExceptionHandler {

    //handle the exception by printing the message to the console
    public static void handle(Exception e) {
        switch (e) {
            case Exception_DivideZero ex -> ex.handle();
            case IllegalArgumentException ex -> IO.println("Invalid argument: " + ex.getMessage());
            case NullPointerException ex -> IO.println("Null value encountered: " + ex.getMessage());
            case IndexOutOfBoundsException ex -> IO.println("Index out of range: " + ex.getMessage());
            case IOException ex -> IO.println("IO error: " + ex.getMessage());
            default -> IO.println("Unexpected error: " + e.getMessage());
        }
    }
}
