package com.kumarsoumya.collections;

import static org.junit.Assert.*;

import java.lang.Character;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {

    private Character[] datas = {'A', 'B', 'C'};

    @Test
    public void testAdd() {
        LinkedList<Character> list = new LinkedList<Character>();
        for (Character data: datas) {
            list.add(data);
        }
        assertEquals(null, "[C,B,A]", list.toString());
    }

    @Test
    public void testRemove() {
        LinkedList<Character> list = new LinkedList<Character>();
        for (Character data: datas) {
            list.add(data);
        }

        list.remove('B');
        assertEquals(null, 2, list.size());
        assertEquals("Middle element of the list should be removed", "[C,A]", list.toString());
        list.remove('A');
        assertEquals(null, 1, list.size());
        assertEquals("First element of the list should be removed", "[C]", list.toString());
        list.remove('C');
        assertEquals(null, 0, list.size());
        assertEquals("Last element of the list should be removed", "[]", list.toString());
    }

    @Test
    public void testContains() {
        LinkedList<Character> list = new LinkedList<Character>();
        for (Character data: datas) {
            list.add(data);
        }

        assertTrue("Should return true if list contains an element", list.contains('B'));
        assertFalse("Should return false if list doesn't contains an element", list.contains('D'));
    }

    @Test
    public void testSize() {
        LinkedList<Character> list = new LinkedList<Character>();
        for (Character data: datas) {
            list.add(data);
        }

        assertEquals(null, 3, list.size());
    }

    @Test
    public void testToString() {
        LinkedList<Character> list = new LinkedList<Character>();
        for (Character data: datas) {
            list.add(data);
        }

        assertEquals(null, "[C,B,A]", list.toString());
    }

}
