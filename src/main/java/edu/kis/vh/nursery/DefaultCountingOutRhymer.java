package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    private static final int CAPACITY = 12;
    private static final int EMPTY = -1;
    private static final int FULL = 11;
    private final int[] numbers = new int[CAPACITY];
    
    private int total = EMPTY;
    //TODO : Consider using the CAPACITY value instead of total
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public int getTotal() {
        return total;
    }

    public boolean callCheck() {
        return total == EMPTY;
    }

    // TODO : Verify value with CAPACITY
    public boolean isFull() {
        return total == FULL;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY;
        return numbers[total--];
    }

}
