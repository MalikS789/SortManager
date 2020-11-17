package com.sparta.astha;

public class ObjectReferencePassByValue {

    public void passByValue(){
        Rectangle rectangle=new Rectangle();
        rectangle.setLength(50);
        rectangle.setBreadth(20);


        changeObject(rectangle);//rectangle is the object reference pointing to the object in the heap
         //50, 20
         Printer.printObject("passByValue",rectangle);
    }
//You are sending a copy of the object reference and not the object reference itself
    private void changeObject( Rectangle rectangle1) {
        //rectangle1=new Rectangle();
        rectangle1.setLength(100);
        rectangle1.setBreadth(60);
        //100,60
        Printer.printObject("changeObject",rectangle1);
    }
}
