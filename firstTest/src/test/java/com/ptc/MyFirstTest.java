package com.ptc;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyFirstTest {
    @Test (groups = { "smokeTest", "functionalTest" })
    public void MyFirstTest1() {
    }
 
    @BeforeTest
    public void beforeTest() {
    }
 
    @AfterTest
    public void afterTest() {
    }
}