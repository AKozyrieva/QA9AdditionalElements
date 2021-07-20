package com.company.annotations;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Child1 extends MainClass {
    @BeforeSuite
    public void chBeforeSuite() {
        System.out.println("Child1 - BeforeSuite ");
    }
    @BeforeClass
    public void chBeforeClass() {
        System.out.println("Child1 - BeforeClass ");
    }
    @BeforeMethod
    public void chBeforeMethod() {
        System.out.println("Child1 - BeforeMethod ");
    }
    @Test
    public void test11() {
        System.out.println("Child1 - test11");
    }
    @Test
    public void test12() {
        System.out.println("Child1 - test12");
    }
}
