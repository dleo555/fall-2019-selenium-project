package com.cybertek.tests.a_practice;

import utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class A10LocatorByAbsoluteXpath {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        String url = "http://practice.cybertekschool.com";
        driver.get(url);

        WebElement element = driver.findElement(By.xpath("/html/body/div/div[2]/div/ul/li[10]/a"));
        System.out.println(element.getText());

        driver.close();


    }
}
