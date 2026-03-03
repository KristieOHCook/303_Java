public class EnhancedForLoop {
    public static void main(String[] args) {
        String[] names = { "New York", "Dallas", "Las Vegas", "Florida" };

        // Read as: "For every String 'name' inside the array 'names'..."
        for (String name : names) {
            System.out.println(name);
        }
    }
}
