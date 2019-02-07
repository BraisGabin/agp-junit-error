package com.braisgabin.testcommons;

import org.junit.Test;

abstract public class MyClass {

    @Test
    public void test() {
        concreteTest();
    }

    protected abstract void concreteTest();
}
