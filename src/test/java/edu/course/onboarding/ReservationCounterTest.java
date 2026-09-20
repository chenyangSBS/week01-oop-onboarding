package edu.course.onboarding;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ReservationCounterTest {
    @Test
    void reservesWhenBelowLimit() {
        var counter = new ReservationCounter(2);

        assertTrue(counter.reserve());
        assertEquals(1, counter.count());
    }

    @Test
    void rejectsWhenAtLimit() {
        var counter = new ReservationCounter(2);

        assertTrue(counter.reserve());
        assertTrue(counter.reserve());
        assertFalse(counter.reserve());
        assertEquals(2, counter.count());
    }
}
