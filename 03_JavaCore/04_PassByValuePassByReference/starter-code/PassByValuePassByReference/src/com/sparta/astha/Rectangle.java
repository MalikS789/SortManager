package com.sparta.astha;

public class Rectangle {
    //instance variable
    private int length;
    private int breadth;

    //default constructor
    public Rectangle(){

    }

    //Parameterized constructor
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
//A type of Method Overloading-When you have the same name but different parameters
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }



    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
}
