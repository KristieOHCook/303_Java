public class arraydemothree {
    public static void main(String[] args) {
        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        int sum = 0;
        Double average;

        for (int number : numbers) {
            sum += number;
        }

        int arrayLength = numbers.length;
        // (double) is used to convert the math from integers to decimals
        average = ((double) sum / (double) arrayLength);

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}
