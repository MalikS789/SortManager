package com.sparta.astha;

public class Printer {

    public static void printNumber(String methodName,int number){

        System.out.println("The number in the method "+methodName+" is:"+number);
    }

    public static void printObject(String methodName, Rectangle rectangle){
        System.out.println("The length and breadth of the rectangle in method "+methodName+ " is"+rectangle.getLength()+" "+ rectangle.getBreadth()+ " respectively");
    }
}
