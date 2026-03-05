public class miRunner {
    public static void main(String[] args) {
        DemoClass dObj = new DemoClass();

        // The same method handles different types automatically!
        dObj.genericsMethod(25);           // T becomes Integer
        dObj.genericsMethod("Per Scholas"); // T becomes String
        dObj.genericsMethod(2563.5);       // T becomes Double
        dObj.genericsMethod('H');          // T becomes Character
    }
}