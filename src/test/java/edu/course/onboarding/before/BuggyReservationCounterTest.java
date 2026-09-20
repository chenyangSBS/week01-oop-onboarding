package edu.course.onboarding.before;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class BuggyReservationCounterTest {
    @Test
    @Disabled("教学演示：修复前的 <= 会让第 3 次预约错误地成功")
    void rejectsWhenAtLimit() {
        var counter = new ReservationCounter(2);

        assertTrue(counter.reserve());
        assertTrue(counter.reserve());
        assertFalse(counter.reserve());
    }
}
