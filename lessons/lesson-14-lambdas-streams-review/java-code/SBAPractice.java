import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// ================================================================
// SBA PRACTICE — Mini assessment covering ALL key skills
//
// Scenario: "Gym" management system
// Similar structure to the SBA Sport/Cricket/Football task
// but with different domain: Gym → Yoga, CrossFit
// ================================================================

// ---------- STEP 1: Interface (Lesson 10) ----------
interface Gym {
    double calculateAvgMemberAge(int[] ages);
    String cancelMembership(String memberName, ArrayList<String> members);
    String transferMember(String memberName, String fromGym, String toGym);
}

// ---------- STEP 2: Class implements interface (Lesson 10) ----------
class Yoga implements Gym {

    // Required methods from the interface
    @Override
    public double calculateAvgMemberAge(int[] ages) {
        // Uses: arrays (L6), loops (L5), type casting (L2)
        if (ages == null || ages.length == 0) return 0;

        int sum = 0;
        for (int age : ages) {
            sum += age;
        }
        return (double) sum / ages.length;
    }

    @Override
    public String cancelMembership(String memberName, ArrayList<String> members) {
        // Uses: ArrayList (L11), validation (L4)
        if (members.contains(memberName)) {
            members.remove(memberName);
            return memberName + " membership cancelled.";
        }
        return memberName + " not found in roster.";
    }

    @Override
    public String transferMember(String memberName, String fromGym, String toGym) {
        // Uses: String concatenation (L3)
        return memberName + " transferred from " + fromGym + " to " + toGym;
    }

    // Yoga-specific method (not in interface)
    public String getFlexibilityLevel(int monthsOfPractice) {
        if (monthsOfPractice < 3) return "Beginner";
        if (monthsOfPractice < 12) return "Intermediate";
        return "Advanced";
    }
}

// ---------- STEP 3: Another implementation ----------
class CrossFit implements Gym {

    @Override
    public double calculateAvgMemberAge(int[] ages) {
        if (ages == null || ages.length == 0) return 0;

        int sum = 0;
        for (int age : ages) {
            sum += age;
        }
        return (double) sum / ages.length;
    }

    @Override
    public String cancelMembership(String memberName, ArrayList<String> members) {
        if (members.contains(memberName)) {
            members.remove(memberName);
            return memberName + " membership cancelled.";
        }
        return memberName + " not found in roster.";
    }

    @Override
    public String transferMember(String memberName, String fromGym, String toGym) {
        return memberName + " transferred from " + fromGym + " to " + toGym;
    }

    // CrossFit-specific method
    public int calculateMaxLift(int bodyWeight, double multiplier) {
        return (int) (bodyWeight * multiplier);
    }
}

// ---------- STEP 4: Main with demo ----------
public class SBAPractice {
    public static void main(String[] args) {

        // --- Yoga demo ---
        Yoga yoga = new Yoga();

        int[] yogaAges = {25, 30, 35, 28, 42};
        System.out.println("Yoga avg age: " + yoga.calculateAvgMemberAge(yogaAges));

        ArrayList<String> yogaMembers = new ArrayList<>(
            Arrays.asList("Alice", "Bob", "Charlie", "Diana")
        );
        System.out.println(yoga.cancelMembership("Bob", yogaMembers));
        System.out.println("Remaining: " + yogaMembers);

        System.out.println(yoga.transferMember("Alice", "Downtown Yoga", "Uptown Yoga"));
        System.out.println("Flexibility: " + yoga.getFlexibilityLevel(8));

        System.out.println();

        // --- CrossFit demo ---
        CrossFit cf = new CrossFit();

        int[] cfAges = {22, 27, 31, 24};
        System.out.println("CrossFit avg age: " + cf.calculateAvgMemberAge(cfAges));
        System.out.println("Max deadlift (180lb person, 2.5x): " + cf.calculateMaxLift(180, 2.5));


        // --- BONUS: while + modulus pattern (Lesson 5 SBA skill) ---
        System.out.println("\n--- Digit Sum (SBA pattern) ---");
        int number = 9876;
        int digitSum = 0;
        int temp = number;
        while (temp > 0) {
            digitSum += temp % 10;
            temp /= 10;
        }
        System.out.println("Sum of digits of " + number + " = " + digitSum);


        // --- BONUS: Array to List conversion (Lesson 11 SBA skill) ---
        System.out.println("\n--- Array <-> List Conversion ---");
        int[] scores = {88, 72, 95, 60, 45, 83};

        // Array → ArrayList
        ArrayList<Integer> scoreList = new ArrayList<>();
        for (int s : scores) {
            scoreList.add(s);
        }
        System.out.println("As list: " + scoreList);

        // Remove failing scores (below 60)
        scoreList.removeIf(s -> s < 60);
        System.out.println("After removing < 60: " + scoreList);

        // List → Array
        Integer[] backToArray = scoreList.toArray(new Integer[0]);
        System.out.println("Back to array: " + Arrays.toString(backToArray));
    }
}
