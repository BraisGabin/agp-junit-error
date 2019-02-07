package com.braisgabin.gradle_junit;

import com.braisgabin.testcommons.MyClass;

public class MyTest extends MyClass {
    @Override
    protected void concreteTest() {
        System.out.println("all right!");
    }
}
