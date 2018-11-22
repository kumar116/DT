package com.kumarsoumya.collections;

import java.util.Arrays;

public class InsertionSort<T extends Comparable<T>> {

    public void sort(T[] arr) {
        for (int j = 1; j < arr.length; j++) {
            T val = arr[j];
            int i = j - 1;
            while (i >= 0 && arr[i].compareTo(val) > 0) {
                arr[i + 1] = arr[i];
                if (Constant.DEBUG) {
                    System.out.println(Arrays.toString(arr));
                }
                i = i - 1;
            }
            arr[i + 1] = val;
        }
    }

}
