
import org.junit.Test;

import java.util.*;

import static org.testng.AssertJUnit.*;


public class TrainConsistAppTest {

    List<Bogie> createBogies() {
        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("AC Chair", 54));
        list.add(new Bogie("First Class", 24));
        list.add(new Bogie("Luxury", 70));
        return list;
    }

    @Test
    public void testFilter_CapacityGreaterThanThreshold() {
        List<Bogie> result = createBogies().stream()
                .filter(b -> b.capacity > 70)
                .toList();

        assertEquals(1, result.size());
        assertEquals("Sleeper", result.get(0).name);
    }

    @Test
    public void testFilter_CapacityEqualToThreshold() {
        List<Bogie> result = createBogies().stream()
                .filter(b -> b.capacity > 70)
                .toList();

        boolean contains70 = result.stream().anyMatch(b -> b.capacity == 70);
        assertFalse(contains70);
    }

    @Test
    public void testFilter_CapacityLessThanThreshold() {
        List<Bogie> result = createBogies().stream()
                .filter(b -> b.capacity > 70)
                .toList();

        boolean containsLow = result.stream().anyMatch(b -> b.capacity < 70);
        assertFalse(containsLow);
    }

    @Test
    public void testFilter_MultipleBogiesMatching() {
        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("A", 80));
        list.add(new Bogie("B", 90));

        List<Bogie> result = list.stream()
                .filter(b -> b.capacity > 70)
                .toList();

        assertEquals(2, result.size());
    }

    @Test
    public void testFilter_NoBogiesMatching() {
        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("A", 20));
        list.add(new Bogie("B", 30));

        List<Bogie> result = list.stream()
                .filter(b -> b.capacity > 70)
                .toList();

        assertTrue(result.isEmpty());
    }

    @Test
    public void testFilter_AllBogiesMatching() {
        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("A", 80));
        list.add(new Bogie("B", 90));

        List<Bogie> result = list.stream()
                .filter(b -> b.capacity > 70)
                .toList();

        assertEquals(list.size(), result.size());
    }

    @Test
    public void testFilter_EmptyBogieList() {
        List<Bogie> list = new ArrayList<>();

        List<Bogie> result = list.stream()
                .filter(b -> b.capacity > 70)
                .toList();

        assertTrue(result.isEmpty());
    }

    @Test
    public void testFilter_OriginalListUnchanged() {
        List<Bogie> original = createBogies();

        List<Bogie> result = original.stream()
                .filter(b -> b.capacity > 70)
                .toList();

        assertEquals(4, original.size());
    }
}