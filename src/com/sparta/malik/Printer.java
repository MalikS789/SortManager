package com.sparta.malik;

import java.util.Arrays;

public class Printer {

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void printErrorMessage(String message) {
        System.err.println(message);
    }
}
