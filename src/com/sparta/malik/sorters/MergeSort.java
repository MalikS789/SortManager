package com.sparta.malik.sorters;

import com.sparta.malik.display.Printer;

import java.util.Arrays;

public class MergeSort implements Sorter {

    static boolean debug = false;

    public int[] sortArray(int[] arrayToSort) {
        if (arrayToSort.length == 0) {
            Printer.printErrorMessage(new NullPointerException());
            return arrayToSort;
        }
        mergeSort(arrayToSort, arrayToSort.length - 1);
        return arrayToSort;
    }

    public static void mergeSort(int[] arrayToSort, int length) {
        if (debug) {
            Printer.printMessage(Arrays.toString(arrayToSort));
        }
        if (length < 2) {
            return;
        }
        int midpoint = length / 2;
        int[] leftArray = new int[midpoint];
        int[] rightArray = new int[length - midpoint];
        int k = 0;
        for (int i = 0; i < length; ++i) {
            if (i < midpoint) {
                leftArray[i] = arrayToSort[i];
            } else {
                rightArray[k] = arrayToSort[i];
                k = k + 1;
            }
        }
        mergeSort(leftArray, midpoint);
        mergeSort(rightArray, length - midpoint);
        MergeArrays.mergeSortedArray(leftArray, rightArray, arrayToSort, midpoint, length - midpoint);
    }


}
