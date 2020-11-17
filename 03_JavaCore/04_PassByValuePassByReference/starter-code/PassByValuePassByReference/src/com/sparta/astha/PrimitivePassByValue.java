package com.sparta.astha;

public class PrimitivePassByValue {
    //instance variable-state of the object
    private int number;
    public void passByValue(){
        int number=5;
        changeNumber(number);
        //5
        Printer.printNumber("passByValue", number);
    }

    private void changeNumber(int number3) {
        //local variable
        int number2=10;
        number3=10;
        Printer.printNumber("changeNumber", number);
    }
}
