package com.sparta.mg;

import java.io.IOException;

public class App {
    public static void main( String[] args ) {
        try {
            CSVReader.getValues();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
