package com.sparta.astha;

public class StringBuilderInJava {

    public void methodStringBuilder(){
        //StringBuilder is mutable but not thread-safe
        //Before StringBuffer-quite obsolete. It is synchronized-thread-safe but quite slow.
        //StringBUilder is compatible with StringBUffer and useful for applications which is a single thread one
        Printer.printMessage("------STRING BUILDER START----");
        StringBuilder stringBuilder=new StringBuilder("hello");
        stringBuilder.append("hi");
        Printer.printMessage(stringBuilder);

        String value=stringBuilder.toString();

        //Many methods-length(), reverse(), replace(), insert()

        Printer.printMessage("------STRING BUILDER END----");

    }
}
