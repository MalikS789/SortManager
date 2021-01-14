package com.sparta.astha;

public class Starter {

    static{
        Printer.printMessage("Static Block 3");
    }

    public void start(){
        Spartan spartan1=new Spartan("Shahid", 20, "Male");

        Printer.printSpartanCount(spartan1);

        Spartan spartan2=new Spartan();
        spartan2.setSpartanName("Chris");
        spartan2.setAge(20);
        spartan2.setGender("Male");



        Printer.printSpartanCount(spartan2);

        Printer.printTotalSpartanCount();

    }

    static{
        Printer.printMessage("Static Block 4");
    }
}
