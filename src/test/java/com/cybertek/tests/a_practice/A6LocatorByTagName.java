package com.cybertek.tests.a_practice;

import com.cybertek.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class A6LocatorByTagName {
    public static void main(String[] args) throws Throwable {
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        String url = "http://practice.cybertekschool.com";
        driver.get(url);

        WebElement h1 = driver.findElement(By.tagName("h1"));
        System.out.println(h1.getText());
        driver.close();







    }
}
