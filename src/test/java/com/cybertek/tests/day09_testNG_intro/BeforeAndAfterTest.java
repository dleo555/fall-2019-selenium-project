package com.cybertek.tests.day09_testNG_intro;

import org.testng.annotations.*;

public class BeforeAndAfterTest {
    @BeforeClass
    public void beforeClass(){
        System.out.println("\tBefore CLASS");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("\tAfter CLASS");
    }
    @BeforeMethod
    public void beforeTest(){
        System.out.println("\tBefore Method");
    }

    @Test
    public void test1(){
        System.out.println("this is test one");
    }

    @AfterMethod
    public void afterTest(){
        System.out.println("\tAfter Method");
    }

}
