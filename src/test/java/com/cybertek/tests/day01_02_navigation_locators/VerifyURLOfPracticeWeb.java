package com.cybertek.tests.day01_02_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURLOfPracticeWeb {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        String url = "http://practice.cybertekschool.com/";
        driver.get(url);

        String actualURL = driver.getCurrentUrl();

        if (url.equals(actualURL)) {
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("Expected "+url);
            System.out.println("Actual URL is "+ actualURL);
        }
        driver.close();



    }
}
