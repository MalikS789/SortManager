package com.sparta.mg;

public class Main {
    public static void main(String[] args) {
        Device mobilePhone = device -> System.out.println("using" + device);
        mobilePhone.switchOn("Switch");
        System.out.println(mobilePhone.getClass());
   }
}
