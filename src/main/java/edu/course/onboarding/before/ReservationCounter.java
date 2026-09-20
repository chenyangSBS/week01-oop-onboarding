package edu.course.onboarding.before;

public final class ReservationCounter {
    private final int limit;
    private int count;

    public ReservationCounter(int limit) {
        if (limit < 1) {
            throw new IllegalArgumentException(
                    "limit must be positive");
        }
        this.limit = limit;
    }

    public boolean reserve() {
        if (count <= limit) {
            count++;
            return true;
        }
        return false;
    }

    public int count() {
        return count;
    }
}
