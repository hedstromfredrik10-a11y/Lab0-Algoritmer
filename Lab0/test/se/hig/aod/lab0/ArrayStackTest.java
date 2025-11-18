package se.hig.aod.lab0;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ArrayStackTest<T> {
    ArrayStack<T> stack = new ArrayStack<T>(5) {
    };

    @Test
    public void testPushAndPop() {
        stack.push((T) "Hej");
        stack.push((T) "på");
        stack.push((T) "dig");
        assertEquals(stack.peek(), "dig");
        stack.pop();
        assertEquals(stack.peek(), "på");
        stack.pop();
        assertEquals(stack.peek(), "Hej");
    }

    @Test
    public void testClear() {
        stack.push((T) "Hej");
        stack.push((T) "på");
        stack.push((T) "dig");
        stack.clear();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testIsFull() {
        stack.push((T) "Hej");
        stack.push((T) "på");
        stack.push((T) "dig");
        stack.push((T) "min");
        stack.push((T) "vän");
        assertTrue(stack.isFull());
    }

}
