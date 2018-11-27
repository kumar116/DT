package com.kumarsoumya.collections;

import static org.junit.Assert.*;
import org.junit.Test;

public class InsertionSortTest  extends SortTest {

    private InsertionSort<Integer> sortClass = new InsertionSort<Integer>();

    @Test
    public void testSort() {
        sortClass.sort(input);
        assertArrayEquals("", input, expect);
    }

}
