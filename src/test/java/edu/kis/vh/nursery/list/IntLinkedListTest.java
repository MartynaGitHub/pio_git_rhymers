package edu.kis.vh.nursery.list;
import org.junit.Assert;
import org.junit.Test;

public class IntLinkedListTest {
    // all test completed
    @Test
    public void testPush() {
        IntLinkedList list = new IntLinkedList();
        int testValue = 5;
        list.push(testValue);
        int result = list.top();
        Assert.assertEquals("Push should add the element to the list", testValue, result);
    }

    @Test
    public void testTop() {
        IntLinkedList list = new IntLinkedList();
        final int EMPTY_STACK_VALUE = -1;

        int result = list.top();
        Assert.assertEquals("Top should return EMPTY_STACK_VALUE for an empty list", EMPTY_STACK_VALUE, result);
        int testValue = 5;
        list.push(testValue);
        result = list.top();
        Assert.assertEquals("Top should return the last pushed value", testValue, result);
    }

    @Test
    public void testIsEmpty() {
        IntLinkedList list = new IntLinkedList();
        boolean result = list.isEmpty();
        Assert.assertTrue("New list should be empty", result);

        list.push(5);
        result = list.isEmpty();
        Assert.assertFalse("List should not be empty after adding an element", result);
    }

    @Test
    public void testIsFull() {
        IntLinkedList list = new IntLinkedList();
        boolean result = list.isFull();
        Assert.assertFalse("Linked list should not be full", result);
    }

    @Test
    public void testPop() {
        IntLinkedList list = new IntLinkedList();
        final int EMPTY_STACK_VALUE = -1;

        int result = list.pop();
        Assert.assertEquals("Pop should return EMPTY_STACK_VALUE for an empty list", EMPTY_STACK_VALUE, result);

        int testValue = 5;
        list.push(testValue);
        result = list.pop();
        Assert.assertEquals("Pop should return the last value", testValue, result);
        result = list.pop();
        Assert.assertEquals("Pop should return EMPTY_STACK_VALUE after the list is empty again", EMPTY_STACK_VALUE, result);
    }

    @Test
    public void testPopUntilEmpty() {
        IntLinkedList list = new IntLinkedList();
        list.push(15);
        list.push(25);
        list.pop();
        list.pop();
        int result = list.pop();
        final int EMPTY_STACK_VALUE = -1;
        Assert.assertEquals("Pop should return EMPTY_STACK_VALUE when called on an empty list after previous pops", EMPTY_STACK_VALUE, result);
    }
}
