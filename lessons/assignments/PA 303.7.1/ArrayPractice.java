import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // --- Task 1: Basic 3-element array ---
        int[] task1Arr = new int[3];
        task1Arr[0] = 1;
        task1Arr[1] = 2;
        task1Arr[2] = 3;
        System.out.println("Task 1: " + Arrays.toString(task1Arr));

        // --- Task 2: Middle element ---
        int[] task2Arr = {13, 5, 7, 68, 2};
        int middleIndex = task2Arr.length / 2;
        System.out.println("Task 2 Middle Element: " + task2Arr[middleIndex]);

        // --- Task 3: Clone and String colors ---
        String[] colors = {"red", "green", "blue", "yellow"};
        System.out.println("Task 3 Length: " + colors.length);
        String[] colorsCopy = colors.clone();
        System.out.println("Task 3 Clone: " + Arrays.toString(colorsCopy));

        // --- Task 4: First, Last, and Exception testing ---
        int[] task4Arr = {10, 20, 30, 40, 50};
        System.out.println("Task 4 First: " + task4Arr[0]);
        System.out.println("Task 4 Last: " + task4Arr[task4Arr.length - 1]);
        // Note: arr[arr.length] would cause an ArrayIndexOutOfBoundsException


        // --- Task 5: Loop and index assignment ---
        int[] task5Arr = new int[5];
        for (int i = 0; i < task5Arr.length; i++) {
            task5Arr[i] = i;
        }
        System.out.println("Task 5: " + Arrays.toString(task5Arr));

        // --- Task 6: Loop and index * 2 assignment ---
        int[] task6Arr = new int[5];
        for (int i = 0; i < task6Arr.length; i++) {
            task6Arr[i] = i * 2;
        }
        System.out.println("Task 6: " + Arrays.toString(task6Arr));

        // --- Task 7: Print skipping middle (index 2) ---
        System.out.print("Task 7 (skipping index 2): ");
        for (int i = 0; i < 5; i++) {
            if (i == 2) continue;
            System.out.print(i + " ");
        }
        System.out.println();

        // --- Task 8: Swap first and middle ---
        String[] task8Arr = {"A", "B", "C", "D", "E"};
        String temp = task8Arr[0];
        task8Arr[0] = task8Arr[2];
        task8Arr[2] = temp;
        System.out.println("Task 8 Swapped: " + Arrays.toString(task8Arr));

        // --- Task 9: Sort, Smallest, and Largest ---
        int[] task9Arr = {4, 2, 9, 13, 1, 0};
        Arrays.sort(task9Arr);
        System.out.println("Task 9 Sorted: " + Arrays.toString(task9Arr));
        System.out.println("Smallest: " + task9Arr[0]);
        System.out.println("Largest: " + task9Arr[task9Arr.length - 1]);


        // --- Task 10: Mixed Types (Object Array) ---
        Object[] mixed = {7, "Java", "Python", "C++", 3.14};
        System.out.println("Task 10 Mixed: " + Arrays.toString(mixed));

        // --- Task 11: Favorite Things ---
        System.out.print("Task 11: How many favorite things do you have? ");
        int num = input.nextInt();
        input.nextLine(); // Consume the leftover newline

        String[] favorites = new String[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Enter your thing: ");
            favorites[i] = input.nextLine();
        }
        System.out.println("Your favorite things are: " + String.join(" ", favorites));

        input.close();
    }
}
