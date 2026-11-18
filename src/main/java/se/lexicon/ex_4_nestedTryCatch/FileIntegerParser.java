package se.lexicon.ex_4_nestedTryCatch;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.List;

public class FileIntegerParser {

    void main() {
        readIntegersFromFile("numbers.txt");
        readIntegersFromFile("missing.txt");
    }

    void readIntegersFromFile(String fileName) {
        try {
            List<String> lines = Files.readAllLines(Path.of(fileName));

            for (String line : lines) {
                try {
                    int value = Integer.parseInt(line.trim());
                    IO.println("Parsed value: " + value);
                } catch (NumberFormatException e) {
                    IO.println("Could not parse line as an integer: \"" + line + "\"");
                }
            }
        } catch (NoSuchFileException e) {
            IO.println("File not found: " + e.getFile());
        } catch (IOException e) {
            IO.println("Error reading file \"" + fileName + "\": " + e.getMessage());
        }
    }
}
