import java.util.ArrayList;

// Java — ArrayList (the dynamic array you've been missing!)

public class ArrayListDemo {
    public static void main(String[] args) {

        // Create an ArrayList — must specify type in angle brackets
        // Note: use Integer, not int (wrapper class required for generics)
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements (like JS push)
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // Access (like JS arr[i], but use .get())
        System.out.println("First: " + list.get(0));     // 10
        System.out.println("Size: " + list.size());       // 4 (not .length!)

        // Update (like JS arr[i] = x, but use .set())
        list.set(1, 25);  // change index 1 from 20 to 25

        // Remove (like JS splice)
        list.remove(2);   // remove element at index 2

        // Check if contains (like JS includes)
        System.out.println("Contains 10? " + list.contains(10));  // true

        // Iterate — enhanced for works!
        System.out.println("All elements:");
        for (int num : list) {
            System.out.println("  " + num);
        }

        // Print the whole list (works directly — unlike arrays!)
        System.out.println("List: " + list);  // [10, 25, 40]

        // ArrayList with Strings
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        System.out.println("Names: " + names);
    }
}
