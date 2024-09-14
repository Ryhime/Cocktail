package Cocktail;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class SystemCallTest {
    @Test
    public void ExitSystemCall() {
        assertTrue(SystemCall.EXIT.getSystemCallNumber() == 1);
    }

    @Test
    public void WriteSystemCall() {
        assertTrue(SystemCall.WRITE.getSystemCallNumber() == 4);
    }
}
