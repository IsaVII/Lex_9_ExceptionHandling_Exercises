package se.lexicon.ex_8_tryWithResources;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

    void main() {
        writeToFile("output.txt", "Exercises are fun!");
    }

    void writeToFile(String fileName, String text) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(text);
            IO.println("Wrote to " + fileName);
        } catch (IOException e) {
            IO.println("Error writing to file: " + e.getMessage());
        }
    }
}
