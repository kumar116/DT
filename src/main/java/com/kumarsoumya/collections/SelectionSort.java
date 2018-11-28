package com.kumarsoumya.collections;

public class SelectionSort<T extends Comparable<T>> {

    public void sort(T[] arr) {
        sort(arr, arr.length, true);
    }

    public void sort(T[] arr, int k, boolean asc) {
        int n = arr.length;
        for (int i = 0; i < k - 1; i++) {
            int index = i;
            for (int j = i + 1; j < n; j++) {
                if ((asc && arr[index].compareTo(arr[j]) > 0) || (!asc && arr[index].compareTo(arr[j]) < 0)) {
                    index = j;
                }
            }
            T temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }

    public void nMinimum(T[] arr, int k) {
        sort(arr, k + 1, true);
    }

    public void nMaximum(T[] arr, int k) {
        sort(arr, k + 1, false);
    }

}