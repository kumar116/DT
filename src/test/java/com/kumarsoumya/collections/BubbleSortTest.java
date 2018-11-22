package com.kumarsoumya.collections;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class BubbleSortTest {

    private Integer[] input;
    private Integer[] expect;

    private BubbleSort sortClass = new BubbleSort();

    @Before
    public void setUp() {
        input = new Integer[] {9, 1, 8, 2, 3, 7, 4, 6, 5, 0};
        expect = new Integer[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    }

    @Test
    public void testSort() {
        sortClass.sort(input);
        assertArrayEquals("", input, expect);
    }

    @Test
    public void testNMinimum() {
        sortClass.nMinimum(input, 2);
        assertEquals("", new Integer(0), input[9]);
        assertEquals("", new Integer(1), input[8]);
    }

    @Test
    public void testNMaximum() {
        sortClass.nMaximum(input, 2);
        assertEquals("", new Integer(9), input[9]);
        assertEquals("", new Integer(8), input[8]);
    }

}