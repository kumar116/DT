package kumar116;

/* @author Soumya Kumar
 * (mathbits.com/MathBits/Java/arrays/InsertionSort.htm)
 *
 * @summary
 * The insertion sort is fast and efficient with smaller arrays. It loses it's efficiency over large amounts of data.
 */
public class InsertionSort<T extends Comparable<T>> {

  public void sort(T[] element) {
    int i, j;
    for (j = 1; j < element.length; j++) {
      T key = element[j];
      for (i = j - 1; (i >= 0) && (element[i].compareTo(key) > 0); i--) {
        element[i + 1] = element[i];
      }
      element[i + 1] = key;
    }
  }

  public static void main(String[] args) {
    Integer[] element = {9, 5, 3, 2, 7, 8, 1, 6, 4, 0};
    InsertionSort insertionSort = new InsertionSort();
    insertionSort.sort(element);

    for (int i = 0; i < element.length; i++) {
      System.out.print(element[i].toString() + "\t");
    }
    System.out.println();
  }
}
