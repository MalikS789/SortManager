package com.sparta.astha;

public class Starter {

    public void startMethod() {


       Immutability immutability =new Immutability();
       //immutability.setS("Sparta");
       System.out.println(immutability.getS());
       immutability.concat();

        StringPool stringPool = new StringPool();
        stringPool.methodStringPool();

        HashCodeDemo hashCodeDemo = new HashCodeDemo();
        hashCodeDemo.hashCodeMethod();

        StringImmutability stringImmutability = new StringImmutability();
        stringImmutability.showStringImmutability();

        StringMethods stringMethods = new StringMethods();
        stringMethods.stringMethods("ProgrammingWithJava");

        StringConcatenation stringConcatenation = new StringConcatenation();
        stringConcatenation.methodStringConcatenation();

         StringBuilderInJava stringBuilderInJava=new StringBuilderInJava();
         stringBuilderInJava.methodStringBuilder();


    }
}
