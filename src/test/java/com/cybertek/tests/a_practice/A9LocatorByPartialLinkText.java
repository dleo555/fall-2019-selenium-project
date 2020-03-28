package com.cybertek.tests.a_practice;

import utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class A9LocatorByPartialLinkText {
    public static void main(String[] args) throws Throwable {
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        String url = "http://practice.cybertekschool.com ";
        driver.get(url);

        WebElement partialLinkText = driver.findElement(By.partialLinkText("Drag"));
        System.out.println(partialLinkText);
        partialLinkText.click();

        Thread.sleep(3000);


        driver.close();
    }
}