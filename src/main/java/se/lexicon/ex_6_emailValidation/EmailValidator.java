package se.lexicon.ex_6_emailValidation;

import java.util.regex.Pattern;

public class EmailValidator {

    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");

    void main() {
        validateAndReport("isa@lexicon.se");
        validateAndReport("not-an-email");
    }

    void validateAndReport(String email) {
        try {
            validateEmail(email);
            IO.println(email + " is a valid email address.");
        } catch (IllegalArgumentException e) {
            IO.println(e.getMessage());
        }
    }

    void validateEmail(String email) {
        if (email == null || !EMAIL_PATTERN.matcher(email).matches()) {
            throw new IllegalArgumentException("Invalid email address: \"" + email + "\"");
        }
    }
}
