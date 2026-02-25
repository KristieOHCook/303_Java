// SBA PATTERN: Input Validation with Guard Clauses
// This exact pattern appears in the Sport interface SBA task.

public class Validation {
    
    // Guard clause pattern: validate FIRST, return early if invalid
    public static void retirePlayer(int[] playerIDs, int id) {
        
        // Guard 1: Is the ID in valid range?
        if (id < 1 || id > playerIDs.length) {
            System.out.println("Invalid player id: " + id);
            return;  // STOP HERE — don't continue
        }

        // Guard 2: Is the player already retired?
        if (playerIDs[id - 1] == -1) {
            System.out.println("Player " + id + " has already retired");
            return;  // STOP HERE
        }

        // If we get here, all validations passed
        playerIDs[id - 1] = -1;
        System.out.println("Player " + id + " has been retired");
    }

    public static void main(String[] args) {
        int[] players = {1, 1, 1, 1, 1};  // 5 active players

        retirePlayer(players, 3);   // ✅ valid
        retirePlayer(players, 3);   // ❌ already retired
        retirePlayer(players, 10);  // ❌ invalid id
        retirePlayer(players, 0);   // ❌ invalid id
    }
}
