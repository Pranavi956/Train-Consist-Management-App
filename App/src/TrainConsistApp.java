class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.name = name;
        this.capacity = capacity;
    }
}

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC14 - Custom Exception Handling");
        System.out.println("======================================\n");

        try {
            Bogie b1 = new Bogie("Sleeper", 72);
            System.out.println("Bogie created: " + b1.name);

            Bogie b2 = new Bogie("AC Chair", -10); // invalid
        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nProgram continues...");
    }
}