package com.cybertek.tests.a_practice;

import utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class A5LocatorByClassName {
    public static void main(String[] args) throws Throwable{
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        String url = "http://practice.cybertekschool.com";
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(url);

        List<WebElement> listOfExamples = driver.findElements(By.className("list-group-item"));
        System.out.println("Size: " + listOfExamples.size());
        System.out.println(listOfExamples.toString());


        Thread.sleep(3000);
        driver.close();

    }
}
