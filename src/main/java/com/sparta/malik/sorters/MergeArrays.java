package com.sparta.malik.sorters;

public class MergeArrays {

    public static void mergeSortedArray(int[] arrayToMerge, int lowestIndex, int midpoint, int highestIndex) {
        //Method assumes the arrays are already sorted & might be uneven in length
        int leftArray[] = new int[midpoint - lowestIndex + 1];
        int rightArray[] = new int[highestIndex - midpoint];

        for (int i = 0; i < leftArray.length; i++) {
            leftArray[i] = arrayToMerge[lowestIndex + i];
        }
        for (int i = 0; i < rightArray.length; i++) {
            rightArray[i] = arrayToMerge[midpoint + i + 1];
        }
        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = lowestIndex; i < highestIndex + 1; i++) {
            if (leftIndex < leftArray.length && rightIndex < rightArray.length) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    arrayToMerge[i] = leftArray[leftIndex];
                    leftIndex++;
                } else {
                    arrayToMerge[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            } else if (leftIndex < leftArray.length) {
                arrayToMerge[i] = leftArray[leftIndex];
                leftIndex++;
            } else if (rightIndex < rightArray.length) {
                arrayToMerge[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }

}
