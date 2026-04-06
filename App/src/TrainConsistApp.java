import java.util.*;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String toString() {
        return name + " -> " + capacity;
    }
}

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC7 - Sort Bogies by Capacity");
        System.out.println("======================================\n");

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 54));
        bogies.add(new Bogie("First Class", 24));

        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("Sorted Bogies by Capacity:\n");

        for (Bogie b : bogies) {
            System.out.println(b);
        }

        System.out.println("\nProgram continues...");
    }
}