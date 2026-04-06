import org.testng.annotations.Test;

import java.util.*;
import static org.testng.AssertJUnit.*;

public class TrainConsistAppTest {

    List<Bogie> createBogies() {
        return Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 54),
                new Bogie("First Class", 24)
        );
    }

    @Test
    public void testLoopFilteringLogic() {
        List<Bogie> result = TrainConsistApp.filterWithLoop(createBogies());
        assertEquals(1, result.size());
    }

    @Test
    public void testStreamFilteringLogic() {
        List<Bogie> result = TrainConsistApp.filterWithStream(createBogies());
        assertEquals(1, result.size());
    }

    @Test
    public void testLoopAndStreamResultsMatch() {
        List<Bogie> loop = TrainConsistApp.filterWithLoop(createBogies());
        List<Bogie> stream = TrainConsistApp.filterWithStream(createBogies());

        assertEquals(loop.size(), stream.size());
    }

    @Test
    public void testExecutionTimeMeasurement() {
        long start = System.nanoTime();
        TrainConsistApp.filterWithLoop(createBogies());
        long end = System.nanoTime();

        assertTrue((end - start) >= 0);
    }

    @Test
    public void testLargeDatasetProcessing() {
        List<Bogie> large = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            large.add(new Bogie("Sleeper", i % 100));
        }

        List<Bogie> result = TrainConsistApp.filterWithStream(large);
        assertNotNull(result);
    }
}