package com.sparta.malik;

import com.sparta.malik.sorters.BubbleSort;
import com.sparta.malik.sorters.MergeArrays;
import com.sparta.malik.sorters.MergeSort;

public class Starter {

    public static void start() {

        int[] array = {4, -6, 3, 7, 5, 8, 6, -9, 8};

        BubbleSort bs = new BubbleSort();
        bs.sortArray(array);

        Printer.printArray(array);

        int[] array2 = {6, 67, 234, -5623, 3251, 123, 123, -432, 532};

        MergeSort ms = new MergeSort();
        ms.sortArray(array2);

        Printer.printArray(array2);

        int[] mergedArray = new int[array.length + array2.length];
        MergeArrays.mergeSortedArray(array, array2, mergedArray, array.length, array2.length);
        Printer.printArray(mergedArray);

    }
}
