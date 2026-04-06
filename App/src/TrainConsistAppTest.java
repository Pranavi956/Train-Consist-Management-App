import org.testng.annotations.Test;

import java.util.*;
import static org.testng.AssertJUnit.*;

public class TrainConsistAppTest {

    @Test
    public void testException_ValidCapacityCreation() throws InvalidCapacityException {
        Bogie b = new Bogie("Sleeper", 72);
        assertEquals(72, b.capacity);
    }

    @Test
    public void testException_NegativeCapacityThrowsException() {
        try {
            new Bogie("Sleeper", -10);
            fail("Exception not thrown");
        } catch (InvalidCapacityException e) {
            assertTrue(true);
        }
    }

    @Test
    public void testException_ZeroCapacityThrowsException() {
        try {
            new Bogie("Sleeper", 0);
            fail("Exception not thrown");
        } catch (InvalidCapacityException e) {
            assertTrue(true);
        }
    }

    @Test
    public void testException_ExceptionMessageValidation() {
        try {
            new Bogie("Sleeper", -5);
            fail("Exception not thrown");
        } catch (InvalidCapacityException e) {
            assertEquals("Capacity must be greater than zero", e.getMessage());
        }
    }

    @Test
    public void testException_ObjectIntegrityAfterCreation() throws InvalidCapacityException {
        Bogie b = new Bogie("AC Chair", 54);
        assertEquals("AC Chair", b.name);
        assertEquals(54, b.capacity);
    }

    @Test
    public void testException_MultipleValidBogiesCreation() throws InvalidCapacityException {
        List<Bogie> list = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 54)
        );

        assertEquals(2, list.size());
    }
}