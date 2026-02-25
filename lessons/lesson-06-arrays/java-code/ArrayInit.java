// ⭐ SBA PATTERN: Array Initialization
// This is from the Sport task — initializing players as active.

public class ArrayInit {
    public static void main(String[] args) {

        // Pattern: create array + initialize all elements
        int[] playerIDs = new int[11];  // 11 players

        // Set all to 1 (meaning "active")
        for (int i = 0; i < playerIDs.length; i++) {
            playerIDs[i] = 1;
        }

        // Print to verify
        System.out.println("Team created with " + playerIDs.length + " players");
        for (int i = 0; i < playerIDs.length; i++) {
            System.out.println("  Player " + (i + 1) + ": " +
                    (playerIDs[i] == 1 ? "Active" : "Retired"));
        }

        // "Retire" player 3 (index 2)
        playerIDs[2] = -1;

        // Print again
        System.out.println("\nAfter retiring player 3:");
        for (int i = 0; i < playerIDs.length; i++) {
            System.out.println("  Player " + (i + 1) + ": " +
                    (playerIDs[i] == 1 ? "Active" : "Retired"));
        }
    }
}
