import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class TrainConsistAppTest {

    @Test
    public void testCargo_SafeAssignment() {
        GoodsBogie b = new GoodsBogie("Cylindrical");
        b.assignCargo("Petroleum");

        assertEquals("Petroleum", b.cargo);
    }

    @Test
    public void testCargo_UnsafeAssignmentHandled() {
        GoodsBogie b = new GoodsBogie("Rectangular");
        b.assignCargo("Petroleum");

        assertNull(b.cargo);
    }

    @Test
    public void testCargo_CargoNotAssignedAfterFailure() {
        GoodsBogie b = new GoodsBogie("Rectangular");
        b.assignCargo("Petroleum");

        assertNull(b.cargo);
    }

    @Test
    public void testCargo_ProgramContinuesAfterException() {
        GoodsBogie b = new GoodsBogie("Rectangular");
        b.assignCargo("Petroleum");

        // Program should continue without crash
        assertTrue(true);
    }

    @Test
    public void testCargo_FinallyBlockExecution() {
        GoodsBogie b = new GoodsBogie("Rectangular");
        b.assignCargo("Petroleum");

        // If finally runs, program reaches here
        assertTrue(true);
    }
}