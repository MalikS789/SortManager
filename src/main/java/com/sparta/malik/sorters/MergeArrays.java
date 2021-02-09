package com.sparta.malik.sorters;

public class MergeArrays {

    public static void mergeSortedArray(int[] array1, int[] array2, int[] mergedArray, int leftIndex, int rightIndex) {
        //Method assumes the arrays are already sorted & might be uneven in length
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < leftIndex && j < rightIndex) {
            if (array1[i] < array2[j]) {
                mergedArray[k] = array1[i];
                i++;
            } else {
                mergedArray[k] = array2[j];
                j++;
            }
            k++;
        }
        while (i < leftIndex) {
            mergedArray[k] = array1[i];
            i++;
            k++;
        }
        while (j < rightIndex) {
            mergedArray[k] = array2[j];
            j++;
            k++;
        }
    }

}
