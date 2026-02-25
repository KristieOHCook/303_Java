import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// SOLUTION: CSV Grade Reader

public class ExerciseSolution {
    public static void main(String[] args) {

        int total = 0;
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");

                if (parts.length == 2) {
                    String name = parts[0].trim();
                    int score = Integer.parseInt(parts[1].trim());

                    System.out.println(name + ": " + score);

                    total += score;
                    count++;
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid score format: " + e.getMessage());
        }

        if (count > 0) {
            double average = (double) total / count;
            System.out.printf("Class average: %.1f%n", average);
        }
    }
}
