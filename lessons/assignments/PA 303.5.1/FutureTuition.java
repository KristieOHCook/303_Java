public class FutureTuition {
    public static void main(String[] args) {
        double tuition = 10000; // Initial tuition
        int year = 0;           // Year counter

        // Loop until tuition is doubled (20,000)
        while (tuition < 20000) {
            tuition = tuition * 1.07; // Increase by 7%
            year++;
        }

        System.out.println("Tuition will be doubled in " + year + " years");
        System.out.printf("Tuition will be $%.2f", tuition);
    }
}
