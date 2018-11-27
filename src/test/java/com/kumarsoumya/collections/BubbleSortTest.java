package com.kumarsoumya.collections;

import static org.junit.Assert.*;
import org.junit.Test;

public class BubbleSortTest  extends SortTest {

    private BubbleSort<Integer> sortClass = new BubbleSort<Integer>();

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