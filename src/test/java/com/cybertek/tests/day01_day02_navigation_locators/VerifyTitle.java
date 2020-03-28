package com.cybertek.tests.day01_day02_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {
    public static void main(String[] args) {
        //http://practice.cybertekschool.com got and find expected result
        //Verify tittle (expected result) :Practice

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.etsy.com");

        String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
            System.out.println("Expected: " + expectedTitle);
            System.out.println("Actual title: " + driver.getTitle());
        }
        driver.close();

    }
}
