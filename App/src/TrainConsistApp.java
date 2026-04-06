import java.util.regex.*;

public class TrainConsistApp {

    public static boolean isValidTrainID(String id) {
        return Pattern.matches("TRN-\\d{4}", id);
    }

    public static boolean isValidCargoCode(String code) {
        return Pattern.matches("PET-[A-Z]{2}", code);
    }

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC11 - Regex Validation");
        System.out.println("======================================\n");

        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        System.out.println("Train ID Valid: " + isValidTrainID(trainId));
        System.out.println("Cargo Code Valid: " + isValidCargoCode(cargoCode));

        System.out.println("\nProgram continues...");
    }
}