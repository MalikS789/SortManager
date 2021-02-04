package com.sparta.malik;

import com.sparta.malik.sorters.BubbleSort;
import com.sparta.malik.sorters.MergeArrays;

public class Starter {

    public static void start() {

        int[] array = {4, -6, 3, 7, 5, 8, 6, -9, 8};
        int[] array2 = {6, 67, 234, -5623, 3251, 123, 123, -432, 532};

        BubbleSort bs = new BubbleSort();
        bs.sortArray(array);
        bs.sortArray(array2);
//
//        Printer.printArray(array);
//
        int[] mergedArray = MergeArrays.merge(array, array2);

        Printer.printArray(mergedArray);

    }
}
