package com.sparta.astha;

public class Starter {

    public void start(){
        PrimitivePassByValue primitivePassByValue=new PrimitivePassByValue();
        primitivePassByValue.passByValue();

        ObjectReferencePassByValue objectReferencePassByValue=new ObjectReferencePassByValue();
        objectReferencePassByValue.passByValue();

    }
}
