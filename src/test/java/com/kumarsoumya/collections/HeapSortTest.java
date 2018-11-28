package com.kumarsoumya.collections;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class HeapSortTest extends SortTest{

    private HeapSort<Integer> sortClass = new HeapSort<Integer>();

    @Test
    public void testSort() {
        sortClass.sort(input);
        assertArrayEquals("", input, expect);
    }

    @Test
    public void testNMinimum() {
        sortClass.nMinimum(input, 2);
        assertArrayEquals("", new Integer[] {0, 1}, new Integer[] {input[input.length - 1], input[input.length - 2]});
    }

    @Test
    public void testNMaximum() {
        sortClass.nMaximum(input, 2);
        assertArrayEquals("", new Integer[] {9999, 9998}, new Integer[] {input[input.length - 1], input[input.length - 2]});
    }
}
