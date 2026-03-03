public class arraydemoTwo {
    public static void main(String[] args) {
        int[] age = {12, 4, 5};

        System.out.println("Using for Loop:");
        // age.length tells the loop when to stop
        for (int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }
    }
}
