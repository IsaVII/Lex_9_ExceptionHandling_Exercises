package se.lexicon.ex_7_listOperations;

import se.lexicon.exceptions.DuplicateNameException;
import se.lexicon.exceptions.NameNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class NameManager {

    private final List<String> names = new ArrayList<>();

    void main() {
        try {
            addName("Isa");
            addName("Lea");
            addName("Isa");
        } catch (DuplicateNameException e) {
            IO.println(e.getMessage());
        }

        try {
            IO.println("Found: " + findName("Lea"));
            findName("Nisse");
        } catch (NameNotFoundException e) {
            IO.println(e.getMessage());
        }
    }

    void addName(String name) throws DuplicateNameException {
        if (names.contains(name)) {
            throw new DuplicateNameException("Name already exists: \"" + name + "\"");
        }
        names.add(name);
    }

    String findName(String name) throws NameNotFoundException {
        if (!names.contains(name)) {
            throw new NameNotFoundException("Name not found: \"" + name + "\"");
        }
        return name;
    }
}
