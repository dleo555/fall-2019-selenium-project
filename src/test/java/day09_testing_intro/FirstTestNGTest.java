package day09_testing_intro;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class FirstTestNGTest {
    //@Ignore --- will ignore only this particular test
    @Test
    public void test1(){
        System.out.println("test one");
    }

    @Test
    public void test2(){
        System.out.println("test two");
    }

}
