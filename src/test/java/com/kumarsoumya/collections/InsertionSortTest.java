package com.kumarsoumya.collections;

import static org.junit.Assert.*;

import org.junit.Test;

public class InsertionSortTest {

    private Integer[] datas = {9, 1, 8, 2, 3, 7, 4, 6, 5};

    @Test
    public void testSort() {
        new InsertionSort<Integer>().sort(datas);
        Integer[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals("", datas, expected);
    }

}
