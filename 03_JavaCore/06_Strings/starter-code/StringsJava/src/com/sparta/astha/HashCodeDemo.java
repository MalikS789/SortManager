package com.sparta.astha;

public class HashCodeDemo {


    public void hashCodeMethod(){
        var string1 = "Hello World";
        String string2 = "Hello World";
        String string3 = new String("Hello World");
        String string4 = "Hello World";
        String string5 = new String("Hello World");



        // We can add an existing string to the pool using the intern method
        String string6 = string5.intern();
        if (string2.equals(string3)) {
            System.out.println("TRUE");
        }


        //Hash code is overriden - should return the same value for each string
        System.out.println(string1.hashCode());
        System.out.println(string2.hashCode());
        System.out.println(string3.hashCode());
        System.out.println(string4.hashCode());
        System.out.println(string5.hashCode());

        Object object1=new Object();
        Object object2=new Object();

        Integer integer1=1;
        Integer integer2=1;



        System.out.println(object1.equals(object2));
        System.out.println(object1.hashCode());
        System.out.println(object2.hashCode());
        System.out.println(integer1.equals(integer2));
        System.out.println(integer1.hashCode());
        System.out.println(integer2.hashCode());

        //returns the original, not overridden, hashcode - shows different values for new strings
        System.out.println("");
        System.out.println(System.identityHashCode(string1));
        System.out.println(System.identityHashCode(string2));
        System.out.println(System.identityHashCode(string3));
        System.out.println(System.identityHashCode(string4));
        System.out.println(System.identityHashCode(string5));
        System.out.println(System.identityHashCode(string6));

        System.out.println("");
        System.out.println(System.identityHashCode("Hello World"));
        System.out.println(System.identityHashCode(new String("Hello World")));
    }
}

