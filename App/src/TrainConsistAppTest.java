import org.testng.annotations.Test;

import java.util.*;
import static org.testng.AssertJUnit.*;

public class TrainConsistAppTest {

    @Test
    public void testSafety_AllBogiesValid() {
        List<GoodsBogie> list = Arrays.asList(
                new GoodsBogie("Cylindrical", "Petroleum"),
                new GoodsBogie("Rectangular", "Coal")
        );

        assertTrue(TrainConsistApp.isSafe(list));
    }

    @Test
    public void testSafety_CylindricalWithInvalidCargo() {
        List<GoodsBogie> list = Arrays.asList(
                new GoodsBogie("Cylindrical", "Coal")
        );

        assertFalse(TrainConsistApp.isSafe(list));
    }

    @Test
    public void testSafety_NonCylindricalBogiesAllowed() {
        List<GoodsBogie> list = Arrays.asList(
                new GoodsBogie("Rectangular", "Coal"),
                new GoodsBogie("Rectangular", "Wood")
        );

        assertTrue(TrainConsistApp.isSafe(list));
    }

    @Test
    public void testSafety_MixedBogiesWithViolation() {
        List<GoodsBogie> list = Arrays.asList(
                new GoodsBogie("Cylindrical", "Petroleum"),
                new GoodsBogie("Cylindrical", "Coal")
        );

        assertFalse(TrainConsistApp.isSafe(list));
    }

    @Test
    public void testSafety_EmptyBogieList() {
        List<GoodsBogie> list = new ArrayList<>();

        assertTrue(TrainConsistApp.isSafe(list));
    }
}