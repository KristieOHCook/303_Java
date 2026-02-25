// ⭐ SBA PATTERN: Constructor with Array Initialization
// This mirrors the Cricket/Football classes from the SBA task.

public class TeamDemo {

    int[] playerIDs;    // stores 1 = active, -1 = retired

    // Constructor — initializes the team
    public TeamDemo() {
        this.playerIDs = new int[11];                        // 11 players
        for (int i = 0; i < this.playerIDs.length; i++) {
            this.playerIDs[i] = 1;                           // all active
        }
        System.out.println("A new team has been formed!");
    }

    // Method with validation (guard clause pattern from Lesson 4)
    public void retirePlayer(int id) {
        if (id < 1 || id > playerIDs.length) {
            System.out.println("Invalid player id: " + id);
            return;
        }
        if (playerIDs[id - 1] == -1) {
            System.out.println("Player " + id + " already retired");
            return;
        }
        playerIDs[id - 1] = -1;
        System.out.println("Player " + id + " has retired");
    }

    // Method using enhanced for loop to calculate average
    public void calculateAvgAge(int[] ages) {
        double sum = 0;
        for (int age : ages) {
            sum += age;
        }
        double avg = sum / ages.length;
        System.out.printf("Average age: %.2f%n", avg);
    }

    public static void main(String[] args) {
        TeamDemo team = new TeamDemo();

        int[] ages = {25, 27, 22, 30, 28, 26, 24, 31, 29, 23, 21};
        team.calculateAvgAge(ages);

        team.retirePlayer(3);    // valid
        team.retirePlayer(3);    // already retired
        team.retirePlayer(15);   // invalid id
    }
}
