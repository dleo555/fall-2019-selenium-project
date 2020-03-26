package day09_testing_intro;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testNGAssertionsTest {

    @Test
    public void test1() {
        String expected = "one";
        String actual = "one";

        Assert.assertEquals(actual, expected);
        System.out.println("Test 1 complete");
    }
    @Test
    public void test2() {
        String expected = "one";
        String actual = "two";
        System.out.println("STarting to compare");
        Assert.assertEquals(actual, expected);
        System.out.println("Test 2 complete");
    }
    @Test
    public void test3(){
        String expected = "one";
        String actual = "one";
        Assert.assertNotEquals(expected, actual);
        Assert.assertNotEquals(1,2);

        }

    @Test
    public void test4(){
        String expected = "one";
        String actual = "not one";
        Assert.assertTrue(expected.equals(actual));
    }

}

