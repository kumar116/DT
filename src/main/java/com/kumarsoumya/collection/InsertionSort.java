package com.kumarsoumya.collection;

public class InsertionSort<T extends Comparable<T>> {

  public void sort(T[] datas) {
    if (null == datas) {
      return;
    }

    int len = datas.length;
    if (0 == len) {
      return;
    }

    int i, j;
    for (j = 1; j < len; j++) {
      T data = datas[j];
      for (i = (j - 1); (i >= 0) && (datas[i].compareTo(data) > 0); i--) {
        datas[i + 1] = datas[i];
      }
      datas[i + 1] = data;
    }
  }

}
