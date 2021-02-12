package com.sparta.malik.sorters;

import com.sparta.malik.display.Printer;

public class MergeSort implements Sorter {

    static boolean debug = false; //used if you want verbose output

    public int[] sortArray(int[] arrayToSort) {
        if (arrayToSort == null || arrayToSort.length == 0) {
            Printer.printErrorMessage(new Exception("Cannot sort an empty array!"));
            return arrayToSort;
        }
        mergeSort(arrayToSort, 0, arrayToSort.length - 1);
        return arrayToSort;
    }

    public static void mergeSort(int[] array, int lowestIndex, int highestIndex) {
        if (highestIndex <= lowestIndex) {
            return;
        }
        int midpoint = (lowestIndex+highestIndex)/2;
        mergeSort(array, lowestIndex, midpoint);
        mergeSort(array, midpoint+1, highestIndex);
        MergeArrays.mergeSortedArray(array, lowestIndex, midpoint, highestIndex);
    }


}
