package com.sparta.astha;

public class Factorial {

    public static int factorialRecursive(int number){

        //stopping condition
        if(number==1){
            return 1;
        }
        else{
            return number*factorialRecursive(number-1);
        }

    }
}
