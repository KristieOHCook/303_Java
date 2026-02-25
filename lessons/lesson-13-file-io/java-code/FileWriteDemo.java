import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// Java — Writing to a file

public class FileWriteDemo {
    public static void main(String[] args) {

        // Same try-with-resources pattern, just with Writer
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {

            bw.write("Hello from Java!");
            bw.newLine();
            bw.write("Line 2");
            bw.newLine();
            bw.write("Line 3");

            System.out.println("File written successfully!");

        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
