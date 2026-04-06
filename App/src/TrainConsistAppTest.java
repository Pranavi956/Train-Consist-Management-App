import org.junit.Test;
import java.util.*;
import java.util.stream.*;
import static org.testng.AssertJUnit.*;

public class TrainConsistAppTest {

    List<Bogie> createBogies() {
        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("Sleeper", 70));
        list.add(new Bogie("AC Chair", 54));
        list.add(new Bogie("First Class", 24));
        return list;
    }

    @Test
    public void testGrouping_BogiesGroupedByType() {
        Map<String, List<Bogie>> grouped = createBogies().stream()
                .collect(Collectors.groupingBy(b -> b.name));

        assertTrue(grouped.containsKey("Sleeper"));
        assertEquals(2, grouped.get("Sleeper").size());
    }

    @Test
    public void testGrouping_MultipleBogiesInSameGroup() {
        Map<String, List<Bogie>> grouped = createBogies().stream()
                .collect(Collectors.groupingBy(b -> b.name));

        assertEquals(2, grouped.get("Sleeper").size());
    }

    @Test
    public void testGrouping_DifferentBogieTypes() {
        Map<String, List<Bogie>> grouped = createBogies().stream()
                .collect(Collectors.groupingBy(b -> b.name));

        assertTrue(grouped.containsKey("Sleeper"));
        assertTrue(grouped.containsKey("AC Chair"));
        assertTrue(grouped.containsKey("First Class"));
    }

    @Test
    public void testGrouping_EmptyBogieList() {
        List<Bogie> list = new ArrayList<>();

        Map<String, List<Bogie>> grouped = list.stream()
                .collect(Collectors.groupingBy(b -> b.name));

        assertTrue(grouped.isEmpty());
    }

    @Test
    public void testGrouping_SingleBogieCategory() {
        List<Bogie> list = Arrays.asList(
                new Bogie("Sleeper", 80),
                new Bogie("Sleeper", 90)
        );

        Map<String, List<Bogie>> grouped = list.stream()
                .collect(Collectors.groupingBy(b -> b.name));

        assertEquals(1, grouped.size());
    }

    @Test
    public void testGrouping_MapContainsCorrectKeys() {
        Map<String, List<Bogie>> grouped = createBogies().stream()
                .collect(Collectors.groupingBy(b -> b.name));

        assertTrue(grouped.containsKey("Sleeper"));
        assertTrue(grouped.containsKey("AC Chair"));
        assertTrue(grouped.containsKey("First Class"));
    }

    @Test
    public void testGrouping_GroupSizeValidation() {
        Map<String, List<Bogie>> grouped = createBogies().stream()
                .collect(Collectors.groupingBy(b -> b.name));

        assertEquals(2, grouped.get("Sleeper").size());
        assertEquals(1, grouped.get("AC Chair").size());
    }

    @Test
    public void testGrouping_OriginalListUnchanged() {
        List<Bogie> original = createBogies();

        original.stream()
                .collect(Collectors.groupingBy(b -> b.name));

        assertEquals(4, original.size());
    }
}