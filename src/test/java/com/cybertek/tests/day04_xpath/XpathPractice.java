package com.cybertek.tests.day04_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class XpathPractice {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.get("http://practice.cybertekschool.com/login");

        driver.findElement(By.xpath("/html/body/div/div[2]/div/div/form/div/div/input")).sendKeys("Login");

        driver.findElement(By.xpath("//*[@id=\"login\"]/div[2]/div/input")).sendKeys("Password");


    }
}
