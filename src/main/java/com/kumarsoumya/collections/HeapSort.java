package com.kumarsoumya.collections;

public class HeapSort<T extends Comparable<T>> {

    public void sort(T[] arr) {
        sort(arr, arr.length, true);
    }
    public void sort(T[] arr, int k, boolean asc) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i, asc);
        }

        for (int i = n - 1; i >= n - k; i--) {
            T temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0, asc);
        }
    }

    public void heapify(T[] arr, int n, int i, boolean asc) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && ((asc && arr[l].compareTo(arr[largest]) > 0) || (!asc && arr[l].compareTo(arr[largest]) < 0))) {
            largest = l;
        }

        if (r < n && ((asc && arr[r].compareTo(arr[largest]) > 0) || (!asc && arr[r].compareTo(arr[largest]) < 0))) {
            largest = r;
        }

        if (largest != i) {
            T temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;
            heapify(arr, n, largest, asc);
        }
    }

    public void nMinimum(T[] arr, int k) {
        sort(arr, k + 1, false);
    }

    public void nMaximum(T[] arr, int k) {
        sort(arr, k + 1, true);
    }

}
