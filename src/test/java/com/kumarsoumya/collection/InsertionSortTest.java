package com.kumarsoumya.collection;

import static org.junit.Assert.*;

import org.junit.Test;

public class InsertionSortTest {

  @Test
  public void emptyArrayShouldNotBeSorted() {
    Integer[] element = {};
    InsertionSort<Integer> insertionSort = new InsertionSort<Integer>();
    insertionSort.sort(element);
    assertArrayEquals("", new Integer[0], element);
  }

  @Test
  public void nullValuesShouldReturnNullOnSorting() {
    Integer[] element = null;
    InsertionSort<Integer> insertionSort = new InsertionSort<Integer>();
    insertionSort.sort(element);
    assertArrayEquals("", null, element);
  }

  @Test
  public void unsortedArrayShouldBeSorted() {
    Integer[] element = {9, 1, 8, 2, 3, 7, 4, 6, 5};
    InsertionSort<Integer> insertionSort = new InsertionSort<Integer>();
    insertionSort.sort(element);
    Integer[] sortedElement = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    assertArrayEquals("", sortedElement, element);
  }

  @Test
  public void arrayOfDifferentDataTypeShouldBeSorted() {
    String[] element = {"F", "D", "A", "C", "B", "E"};
    InsertionSort<String> insertionSort = new InsertionSort<String>();
    insertionSort.sort(element);
    String[] sortedElement = {"A", "B", "C", "D", "E", "F"};
    assertArrayEquals("", sortedElement, element);
  }
}
