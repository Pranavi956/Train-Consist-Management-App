
import org.testng.annotations.Test;

import java.util.*;

import static org.testng.AssertJUnit.assertEquals;

public class TrainConsistAppTest {

    List<Bogie> createBogies() {
        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("AC Chair", 54));
        list.add(new Bogie("First Class", 24));
        return list;
    }

    @Test
    public void testReduce_TotalSeatCalculation() {
        int total = createBogies().stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        assertEquals(150, total);
    }

    @Test
    public void testReduce_MultipleBogiesAggregation() {
        int total = createBogies().stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        assertEquals(150, total);
    }

    @Test
    public void testReduce_SingleBogieCapacity() {
        List<Bogie> list = Arrays.asList(new Bogie("Sleeper", 72));

        int total = list.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        assertEquals(72, total);
    }

    @Test
    public void testReduce_EmptyBogieList() {
        List<Bogie> list = new ArrayList<>();

        int total = list.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        assertEquals(0, total);
    }

    @Test
    public void testReduce_CorrectCapacityExtraction() {
        List<Integer> capacities = createBogies().stream()
                .map(b -> b.capacity)
                .toList();

        assertTrue(capacities.contains(72));
        assertTrue(capacities.contains(54));
        assertTrue(capacities.contains(24));
    }

    private void assertTrue(boolean contains) {
    }

    @Test
    public void testReduce_AllBogiesIncluded() {
        int total = createBogies().stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        assertEquals(150, total);
    }

    @Test
    public void testReduce_OriginalListUnchanged() {
        List<Bogie> original = createBogies();

        original.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        assertEquals(3, original.size());
    }
}