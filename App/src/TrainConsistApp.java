import java.util.*;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC2 - Add Passenger Bogies to Train");
        System.out.println("======================================\n");

        // Create ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // ---------------- CREATE (Add bogies) ----------------
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("Bogies after addition:");
        System.out.println(passengerBogies);

        // ---------------- DELETE (Remove bogie) ----------------
        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter removing AC Chair:");
        System.out.println(passengerBogies);

        // ---------------- READ (Check existence) ----------------
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("\nSleeper bogie exists in the train.");
        } else {
            System.out.println("\nSleeper bogie not found.");
        }

        // ---------------- FINAL STATE ----------------
        System.out.println("\nFinal Train Consist:");
        System.out.println(passengerBogies);

        System.out.println("\nProgram continues...");
    }
}