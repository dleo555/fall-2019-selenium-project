package com.cybertek.tests.a_practice;

import utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class A11LocatorByRelativeXpath {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        String url = "http://practice.cybertekschool.com";
        driver.get(url);

        WebElement element = driver.findElement(By.xpath("//span[@class='h1y']"));
        System.out.println("h1 text: " + element.getText());


        driver.close();
    }
}
