package com.sparta.astha;

public class StringImmutability {

    public void showStringImmutability(){
        String string1="3";
        String string2=string1.concat("4");
        string2.concat("5");
        Printer.printMessage("-----String Immutability----");
        Printer.printMessage(string1);
        Printer.printMessage(string2);

        //What is happening
        //Immutable means a string object is immutable but reference can be reassigned as many times


    }
}
