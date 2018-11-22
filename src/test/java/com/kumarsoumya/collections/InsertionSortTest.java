package com.kumarsoumya.collections;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class InsertionSortTest {

    private Integer[] input;
    private Integer[] expect;

    private InsertionSort<Integer> sortClass = new InsertionSort<Integer>();

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

}
