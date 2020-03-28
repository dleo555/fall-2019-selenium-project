package com.cybertek.tests.day09_testing_intro;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAndAfterTest {

    @BeforeMethod
    public void beforeTest(){
        System.out.println("\tBefore Method");
    }

    @Test
    public void test1(){
        System.out.println("this is test one");
    }

}
