package edu.kis.vh.nursery.list;

/**
 * IntLinkedList represents a linked list of integers and provides operations to manipulate elements on the list.
 */
public class IntLinkedList {
    private static final int EMPTY_VAL = -1;
    protected Node last;
    private int i; // TODO : Remove unused variable i

    /**
     * Pushes a new integer onto the top of the linked list.
     *
     * @param i the integer to be pushed onto the list.
     */
    public void push(int i) {
        // TODO : Optimize operation to the 'last' variable
        if (getLast() == null)
            setLast(new Node(i));
        else {
            getLast().next = new Node(i);
            getLast().next.setPrev(getLast());
            setLast(getLast().next);
        }
    }

    /**
     * Checks if the linked list is empty.
     *
     * @return true if the list is empty, false if is not empty.
     */
    public boolean isEmpty() {
        return getLast() == null;
    }

    /**
     * Checks if the linked list is full.
     * Always returns false.
     *
     * @return false
     */
    public boolean isFull() {
        return false;
    }

    /**
     * Returns the value at the top of the linked list without removing it.
     *
     * @return the value at the top, or EMPTY_VAL if the list is empty.
     */
    public int top() {
        if (isEmpty())
            return EMPTY_VAL;
        return getLast().getValue();
    }

    /**
     * Removes and returns the value at the top of the list.
     *
     * @return the value at the top of the list, or EMPTY_VAL if the list is empty.
     */
    public int pop() {
        if (isEmpty())
            return EMPTY_VAL;
        int ret = getLast().getValue();
        setLast(getLast().getPrev());
        return ret;
    }

    /**
     * Returns the last node.
     *
     * @return the last node in the list.
     */
    public Node getLast() {
        return last;
    }

    /**
     * Sets the last node in the linked list.
     *
     * @param last the node to be set as the last node.
     */
    public void setLast(Node last) {
        this.last = last;
    }

    /**
     * Retrieves the value of the integer i.
     *
     * @return the value of i.
     */
    // TODO : remove unused method
    private int getI() {
        return i;
    }

    /**
     * Node represents a single node in the linked list.
     */
     static class Node {

        private int value;
        private Node prev;
        public Node next;

        /**
         * Constructs a new node with the specified value.
         *
         * @param i the value to be stored in the node.
         */
        public Node(int i) {
            setValue(i);
        }

        /**
         * Retrieves the value stored in the node.
         *
         * @return the value stored in the node.
         */
        public int getValue() {
            return value;
        }

        /**
         * Sets the value of the node.
         *
         * @param value the value to be stored in the node.
         */
        public void setValue(int value) {
            this.value = value;
        }

        /**
         * Returns the previous node linked to this node.
         *
         * @return the previous node linked to this node.
         */
        public Node getPrev() {
            return prev;
        }

        /**
         * Sets the previous node linked to this node.
         *
         * @param prev the node to be set as the previous node.
         */
        public void setPrev(Node prev) {
            this.prev = prev;
        }
    }

}
