import java.util.*;

public class TrainConsistApp {

    public static void main(String[] args) {

        // Display welcome banner
        System.out.println("======================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("======================================\n");

        // Create dynamic list for train bogies
        List<String> trainConsist = new ArrayList<>();

        // Display initialization message
        System.out.println("Train initialized successfully...");

        // Display initial bogie count
        System.out.println("Current number of bogies: " + trainConsist.size());

        // Display current state
        System.out.println("Current Train Consist: " + trainConsist);

        System.out.println("\nProgram is ready for further operations...");
    }
}