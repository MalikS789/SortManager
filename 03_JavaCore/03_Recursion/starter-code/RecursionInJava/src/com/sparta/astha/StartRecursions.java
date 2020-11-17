package com.sparta.astha;

public class StartRecursions {

    public static void start(){
        Recursions recursions=new Recursions();
        recursions.methodRecursion(5);

        int input=0;
        if(input<1){
            System.err.println("Please enter values greater than  0");
        }
        else {
            int factorialValue = Factorial.factorialRecursive(input);
            Printer.printFactorialValue(input, factorialValue);
        }


    }
}
