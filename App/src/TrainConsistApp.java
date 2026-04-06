class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type) {
        this.type = type;
    }

    public void assignCargo(String cargo) {
        try {
            if (type.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException("Unsafe cargo assignment");
            }
            this.cargo = cargo;
        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());
            this.cargo = null;
        } finally {
            System.out.println("Assignment attempt completed");
        }
    }
}

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC15 - Safe Cargo Assignment");
        System.out.println("======================================\n");

        GoodsBogie b = new GoodsBogie("Rectangular");
        b.assignCargo("Petroleum"); // unsafe

        System.out.println("\nProgram continues...");
    }
}