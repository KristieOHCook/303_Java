import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Java — Reading a file line-by-line

public class FileReadDemo {
    public static void main(String[] args) {

        // ============================================
        // try-with-resources: auto-closes the reader
        // This uses Lesson 12's exception handling!
        // ============================================
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("Line: " + line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        // NOTE: No .close() needed — try-with-resources handles it
        // In older Java you'd need:
        //   BufferedReader br = null;
        //   try { ... } finally { if (br != null) br.close(); }
    }
}
