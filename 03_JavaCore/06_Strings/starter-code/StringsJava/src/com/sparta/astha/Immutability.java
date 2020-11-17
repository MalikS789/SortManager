package com.sparta.astha;
//String class that's why would be final and will just have a getter and not a setter
// -Check it yourself
public final class Immutability {
    private String s="Astha";

    public String getS() {
        return s;
    }

    public void concat(){
        //Prove immutability

        Printer.printMessage(s.concat("Shaw"));
        Printer.printMessage(s);
    }

}
