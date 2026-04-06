import java.util.*;

class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }
}

public class TrainConsistApp {

    public static boolean isSafe(List<GoodsBogie> bogies) {
        return bogies.stream().allMatch(b ->
                !(b.type.equals("Cylindrical") && !b.cargo.equals("Petroleum"))
        );
    }

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC12 - Safety Compliance Check");
        System.out.println("======================================\n");

        List<GoodsBogie> bogies = Arrays.asList(
                new GoodsBogie("Cylindrical", "Petroleum"),
                new GoodsBogie("Rectangular", "Coal")
        );

        boolean safe = isSafe(bogies);

        System.out.println("Train Safety Status: " + safe);

        System.out.println("\nProgram continues...");
    }
}