package edu.kis.vh.nursery.list;

public class IntLinkedList {
    private static final int EMPTY_VAL = -1;
    protected Node last;
    private int i;

    public void push(int i) {
        if (getLast() == null)
            setLast(new Node(i));
        else {
            getLast().next = new Node(i);
            getLast().next.setPrev(getLast());
            setLast(getLast().next);
        }
    }

    public boolean isEmpty() {
        return getLast() == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return EMPTY_VAL;
        return getLast().getValue();
    }

    public int pop() {
        if (isEmpty())
            return EMPTY_VAL;
        int ret = getLast().getValue();
        setLast(getLast().getPrev());
        return ret;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    private int getI() {
        return i;
    }

     static class Node {

        private int value;
        private Node prev;
        public Node next;

        public Node(int i) {
            setValue(i);
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }
    }

}
