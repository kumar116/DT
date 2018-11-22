package com.kumarsoumya.collections;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StackTest {

    private Character[] datas = {'A', 'B', 'C'};

    @Test
    public void testPeek() {
        Stack<Character> stack = new Stack<Character>();
        assertEquals("Empty Stack should return null on peek()", null, stack.peek());

        for (Character data: datas) {
            stack.push(data);
        }

        assertEquals(null, new Character('C'), stack.peek());
    }

    @Test
    public void testPop() {
        Stack<Character> stack = new Stack<Character>();
        assertEquals("Empty Stack should return null on pop()", null, stack.pop());

        for (Character data: datas) {
            stack.push(data);
        }

        assertEquals(null, new Character('C'), stack.pop());
    }

    @Test
    public void testPush() {
        Stack<Character> stack = new Stack<Character>();
        for (Character data: datas) {
            stack.push(data);
        }

        assertEquals(null, "[C,B,A]", stack.toString());
    }

}
