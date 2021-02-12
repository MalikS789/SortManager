package com.sparta.malik.sorters;

import com.sparta.malik.display.Printer;

import java.util.Arrays;

public class BubbleSort implements Sorter {

    static boolean debug = false; //used if you want verbose output

    public int[] sortArray(int[] arrayToSort) {
        return sortArray(arrayToSort, "asc");
    }

    public static int[] sortArray(int[] arrayToSort, String ordering) {
        if ( arrayToSort == null || arrayToSort.length == 0 ) {
            Printer.printErrorMessage(new Exception("Cannot sort an empty array!"));
            return arrayToSort;
        }
        switch (ordering) {
            case "asc":
                return sortAsc(arrayToSort);
            case "desc":
                return sortDesc(arrayToSort);
            default:
                Printer.printErrorMessage(new Exception("Please write either 'acs' or 'desc' to dictate the ordering condition"));
                return arrayToSort;
        }
    }

    private static int[] sortAsc(int[] arrayToSort) {
        int LengthOfArray = arrayToSort.length;
        for (int j = 0; j < LengthOfArray; j++) {
            if (debug) {
                Printer.printMessage("Iteration " + j + ": " + Arrays.toString(arrayToSort));
            }
            boolean swapped = false;
            for (int i = 0; i < LengthOfArray - 1; i++) {
                if (arrayToSort[i] > arrayToSort[i + 1]) {
                    swapped = true;
                    int temp = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[i + 1];
                    arrayToSort[i + 1] = temp;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return arrayToSort;
    }

    private static int[] sortDesc(int[] arrayToSort) {
        int LengthOfArray = arrayToSort.length;
        for (int j = 0; j < LengthOfArray; j++) {
            if (debug) {
                Printer.printMessage("Iteration " + j + ": " + Arrays.toString(arrayToSort));
            }
            boolean swapped = false;
            for (int i = 0; i < LengthOfArray - 1; i++) {
                if (arrayToSort[i] < arrayToSort[i + 1]) {
                    swapped = true;
                    int temp = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[i + 1];
                    arrayToSort[i + 1] = temp;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return arrayToSort;
    }

}
