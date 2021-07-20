package com.company.annotations;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class MainClass {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("MainClass - BeforeSuite");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("MainClass - BeforeClass");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("MainClass - BeforeMethod");
    }
}
