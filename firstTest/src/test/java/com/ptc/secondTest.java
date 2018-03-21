package com.ptc;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class secondTest {
    @Test (groups = {"functionalTest" })
    public void secondTest2() {
    }
 
    @BeforeTest
    public void beforeTest() {
    }
 
    @AfterTest
    public void afterTest() {
    }
}