package com.sparta.astha;

public class Spartan {
    //instance variables
    private String spartanName;
    private int age;
    private String gender;
    //static variable-class level
    private static int spartanCount;
    private static final int SPARTAN_ONSITE_COUNTVALUE=150;//compile time constant-constant variable
    private final int SpartanId;
    static {
        //spartanOnsiteCount=150;
        Printer.printMessage("Static block 1");
    }


    //Instance Intializer block-at the Object level
    {
        spartanCount++;
        Printer.printMessage("Initializer 1");
        final int IdGenerator=1000;
        SpartanId=IdGenerator+spartanCount+SPARTAN_ONSITE_COUNTVALUE;
        Printer.printMessage("Spartan Id is::"+SpartanId);
    }
    {
        Printer.printMessage("Initializer 2");
    }


    //default constructor
    public Spartan(){

    }

//Parametrized constructor
    public Spartan(String spartanName, int age, String gender) {
        this.spartanName = spartanName;
        this.age = age;
        this.gender = gender;

    }

    public String getSpartanName() {
        return spartanName;
    }

    public void setSpartanName(String spartanName) {
        this.spartanName = spartanName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSpartanCount() {
        return spartanCount;
    }

    public static int totalSpartanCount(){
        return spartanCount+SPARTAN_ONSITE_COUNTVALUE;
    }

    static{
        Printer.printMessage("Static block 2");
    }

    public final void aboutSpartan(){
        Printer.printMessage("The Spartan belongs to the London Academy");
    }
}
