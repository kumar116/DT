package com.kumarsoumya.collection;

/* @author Soumya Kumar
 * (mathbits.com/MathBits/Java/arrays/InsertionSort.htm)
 *
 * @summary
 * The insertion sort is fast and efficient with smaller arrays. It loses it's efficiency over large amounts of data.
 */
public class InsertionSort<T extends Comparable<T>> {

  public void sort(T[] element) {
    if (element == null || element.length == 0) {
      return;
    }
    int i, j;
    for (j = 1; j < element.length; j++) {
      T key = element[j];
      for (i = j - 1; (i >= 0) && (element[i].compareTo(key) > 0); i--) {
        element[i + 1] = element[i];
      }
      element[i + 1] = key;
    }
  }
}
