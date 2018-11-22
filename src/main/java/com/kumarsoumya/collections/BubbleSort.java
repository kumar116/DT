package com.kumarsoumya.collections;

import java.util.Arrays;

public class BubbleSort<T extends Comparable<T>> {

    public void sort(T[] arr) {
        sort(arr, arr.length, true);
    }

    public void sort(T[] arr, int k, boolean asc) {
        int comp = 0;
        for (int i = 0; i < k - 1; i++) {
            for (int j = 0 ; j < arr.length - i - 1; j++) {
                comp++;
                if ((asc && arr[j].compareTo(arr[j + 1]) > 0) || (!asc && arr[j].compareTo(arr[j + 1]) < 0)) {
                    T temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
                if (Constant.DEBUG) {
                    System.out.println(Arrays.toString(arr));
                }
            }
        }
        if (Constant.DEBUG) {
            System.out.println("Comparisons: " + comp);
        }
    }

    public void nMinimum(T[] arr, int k) {
        sort(arr, k + 1, false);
    }

    public void nMaximum(T[] arr, int k) {
        sort(arr, k + 1, true);
    }

}