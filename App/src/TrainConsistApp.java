import java.util.*;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC4 - Maintain Ordered Bogie Consist");
        System.out.println("======================================\n");

        // Create LinkedList for train consist
        List<String> trainConsist = new LinkedList<>();

        // ---------------- ADD BOGIES ----------------
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist);

        // ---------------- INSERT AT POSITION ----------------
        trainConsist.add(2, "Pantry Car");

        System.out.println("\nAfter inserting Pantry Car at position 2:");
        System.out.println(trainConsist);

        // ---------------- REMOVE FIRST & LAST ----------------
        ((LinkedList<String>) trainConsist).removeFirst();
        ((LinkedList<String>) trainConsist).removeLast();

        System.out.println("\nAfter removing first and last bogies:");
        System.out.println(trainConsist);

        // ---------------- FINAL STATE ----------------
        System.out.println("\nFinal Ordered Train Consist:");
        System.out.println(trainConsist);

        System.out.println("\nProgram continues...");
    }
}