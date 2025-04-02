package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int CAPACITY = 12;
    public static final int START_VALUE = -1;
    public static final int MAX = 11;
    private final int[] numbers = new int[CAPACITY];
    public static final int RETURN = -1;

    public int total = START_VALUE;

    public void countIn(final int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public final boolean callCheck() {
        return total == RETURN;
    }

    public final boolean isFull() {
        return total == MAX;
    }

    protected final int peekaboo() {
        if (callCheck())
            return START_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return START_VALUE;
        return numbers[total--];
    }
}
