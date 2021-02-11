package com.sparta.malik;

import com.sparta.malik.display.Printer;
import com.sparta.malik.sorters.*;

import java.util.Random;


public class Starter {

    private static SortFactory sf = new SortFactory();
    private static Sorter s;

    public static void start() {
        int[] array = generateRandomArray(16);

        Printer.printMessage("Array before sorting using bubble sort: ");
        Printer.printArray(array);
        s = sf.getSorter(SortersAvailable.BUBBLESORT);
        long start = System.nanoTime();
        s.sortArray(array);
        long end = System.nanoTime();
        Printer.printMessage("Array after sorting using bubble sort: (" + (float) (end - start) / 1000000 + " milliseconds)");
        Printer.printArray(array);

        array = generateRandomArray(16);

        Printer.printMessage("Array before sorting using merge sort: ");
        Printer.printArray(array);
        s = sf.getSorter(SortersAvailable.MERGESORT);
        start = System.nanoTime();
        s.sortArray(array);
        end = System.nanoTime();
        Printer.printMessage("Array after sorting using merge sort: (" + (float) (end - start) / 1000000 + " milliseconds)");
        Printer.printArray(array);

        array = generateRandomArray(16);

        Printer.printMessage("Array before sorting using binary tree sort: ");
        Printer.printArray(array);
        s = sf.getSorter(SortersAvailable.BINARYTREESORT);
        start = System.nanoTime();
        int[] sortedArray = s.sortArray(array);
        end = System.nanoTime();
        Printer.printMessage("Array after sorting using binary tree sort: (" + (float) (end - start) / 1000000 + " milliseconds)");
        Printer.printArray(sortedArray);
    }

    public static int[] generateRandomArray(int lengthOfArray) {
        Random rd = new Random(); // creating Random object
        int[] arr = new int[lengthOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100); // storing random integers in an array
        }
        return arr;
    }
}
