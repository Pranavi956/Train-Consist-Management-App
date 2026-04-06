import java.util.*;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC3 - Track Unique Bogie IDs");
        System.out.println("======================================\n");

        // Create a Set to store unique bogie IDs
        Set<String> bogies = new HashSet<>();

        // ---------------- ADD IDs (including duplicates) ----------------
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");

        // Adding duplicates intentionally
        bogies.add("BG101"); // duplicate
        bogies.add("BG102"); // duplicate

        // ---------------- DISPLAY UNIQUE IDs ----------------
        System.out.println("Unique Bogie IDs:");
        System.out.println(bogies);

        System.out.println("\nTotal unique bogies: " + bogies.size());

        System.out.println("\n(Note: Duplicate IDs are automatically ignored)");
    }
}