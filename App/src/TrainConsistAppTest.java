
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class TrainConsistAppTest {

    @Test
    public void testRegex_ValidTrainID() {
        assertTrue(TrainConsistApp.isValidTrainID("TRN-1234"));
    }

    @Test
    public void testRegex_InvalidTrainIDFormat() {
        assertFalse(TrainConsistApp.isValidTrainID("TRAIN12"));
    }

    @Test
    public void testRegex_ValidCargoCode() {
        assertTrue(TrainConsistApp.isValidCargoCode("PET-AB"));
    }

    @Test
    public void testRegex_InvalidCargoCodeFormat() {
        assertFalse(TrainConsistApp.isValidCargoCode("PET-abc"));
    }

    @Test
    public void testRegex_TrainIDDigitLengthValidation() {
        assertFalse(TrainConsistApp.isValidTrainID("TRN-123"));
    }

    @Test
    public void testRegex_CargoCodeUppercaseValidation() {
        assertFalse(TrainConsistApp.isValidCargoCode("PET-Ab"));
    }

    @Test
    public void testRegex_EmptyInputHandling() {
        assertFalse(TrainConsistApp.isValidTrainID(""));
        assertFalse(TrainConsistApp.isValidCargoCode(""));
    }

    @Test
    public void testRegex_ExactPatternMatch() {
        assertFalse(TrainConsistApp.isValidTrainID("TRN-12345"));
    }
}