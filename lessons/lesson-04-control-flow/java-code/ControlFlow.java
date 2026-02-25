// Java — Control Flow (almost identical to JS!)

public class ControlFlow {
    public static void main(String[] args) {

        int score = 85;

        // if / else if / else — literally the same as JS
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

        // Ternary — same as JS
        String result = score >= 60 ? "Pass" : "Fail";
        System.out.println(result);

        // Switch — same concept, Java supports String since Java 7
        String day = "Monday";
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Weekday");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
