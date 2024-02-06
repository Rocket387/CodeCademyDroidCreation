package org.example;


import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class DroidTest {
    Droid droid = mock(Droid.class);

    @Test
    public void droidTest() {
        Droid firstDroid = new Droid("Bob");

        assertEquals("Bob", firstDroid.name);
    }

    @Test
    public void droidBatteryDecreasedTest() {
        Droid firstDroid = new Droid("Bob");
        firstDroid.workOnTask("cleaning");
        assertEquals(90, firstDroid.batteryLevel);
    }

}
