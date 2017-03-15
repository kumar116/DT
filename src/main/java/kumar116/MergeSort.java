package kumar116;

public class MergeSort<T extends Comparable<T>> {

  public void sort(T[] data) {
    if (data == null || data.length == 0) {
      return;
    }
    mergesort(data, 0, data.length - 1);
  }

  private void mergesort(T[] data, int low, int high) {
    if (low < high) {
      int middle = low + (high - low) / 2;
      mergesort(data, low, middle);
      mergesort(data, middle + 1, high);
      merge(data, low, middle, high);
    }
  }

  private void merge(T[] data, int low, int middle, int high) {
    Object[] dataCopy = new Object[data.length];
    for (int i = low; i <= high; i++) {
      dataCopy[i] = data[i];
    }

    int i, k;
    i = k = low;
    int j = middle + 1;
    while (i <= middle && j <= high) {
      if (((T) dataCopy[i]).compareTo((T) dataCopy[j]) <= 0) {
        data[k] = (T) dataCopy[i];
        i++;
      } else {
        data[k] = (T) dataCopy[j];
        j++;
      }
      k++;
    }

    while (i <= middle) {
      data[k] = (T) dataCopy[i];
      k++;
      i++;
    }
  }
}
