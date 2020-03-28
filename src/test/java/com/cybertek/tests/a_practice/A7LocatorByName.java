package com.cybertek.tests.a_practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class A7LocatorByName {
    public static void main(String[] args) throws Throwable {
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        String url = "http://practice.cybertekschool.com/multiple_buttons";
        driver.get(url);
        WebElement button2 = driver.findElement(By.name("button2"));
        button2.click();
        Thread.sleep(3000);
        driver.close();



    }
}
