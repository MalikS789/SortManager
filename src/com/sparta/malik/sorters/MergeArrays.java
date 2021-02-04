package com.sparta.malik.sorters;

public class MergeArrays {

    public static int[] merge(int[] array1, int[] array2) {

        //make an array to size of both arrays combined.
        int[] newArray = new int[array1.length + array2.length];

        //put values from both arrays into the new big one
        for (int i = 0; i < newArray.length; i++) {
            if (i < array1.length) {
                newArray[i] = array1[i];
            } else {
                newArray[i] = array2[i - array1.length];
            }
        }

        //sort the array!
        BubbleSort bs = new BubbleSort();
        bs.sortArray(newArray);

        return newArray;
    }

}
