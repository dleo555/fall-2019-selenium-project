package com.cybertek.tests.day01_day02_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {
    public static void main(String[] args) throws Throwable{
        WebDriverManager.chromedriver().setup();

        //System.out.println("Hello Selenium");
        //in order to open web page, we need to create
        // WebDriver object  --> Interface

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        Thread.sleep(3000);

        driver.navigate().to("http://practice.cybertekschool.com/");
        Thread.sleep(3000);

        driver.navigate().back();
        Thread.sleep(3000);

        driver.navigate().forward();
    }
}
