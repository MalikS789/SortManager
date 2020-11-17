package com.sparta.astha;

public class Printer {

    public static  void printSpartanCount(Spartan spartan){
        System.out.println("Spartan count::"+spartan.getSpartanCount() +" for Spartan "+spartan.getSpartanName());
    }

    public static void printTotalSpartanCount(){
        System.out.println("The total number of Spartans both training and onsite are::"+Spartan.totalSpartanCount());
    }

    public static void printMessage(String message){
        System.out.println(message);
    }
}
