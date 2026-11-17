package se.lexicon;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    int a = 10;
    int b = 0;

    void main(String[] args) {

        while (true) {

            b = Integer.parseInt(IO.readln("Enter a number to divide by zero: "));
            try {
                dividebyZero();
            } catch (Exception_DivideZero e) {
                e.handle();
            } finally {
                IO.println("Attempt finished.");
            }
        }
    }


    void dividebyZero() throws Exception_DivideZero {
        if (b == 0) {
            throw new Exception_DivideZero("Cannot divide by zero", a, b);
        }
        int c = a / b;
        IO.println("Result: " + c);
    }
}
