package com.cybertek.tests.day01_02_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
    public static void main(String[] args) throws Throwable{

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();

        String practiceWebURL = "http://practice.cybertekschool.com/";
        String ggURL = "http://www.google.com";

        driver.get(practiceWebURL); Thread.sleep(2000);
        driver.get(ggURL); Thread.sleep(2000);
        driver.navigate().back(); Thread.sleep(2000);
        driver.navigate().forward(); //Where is my 100k?
        driver.close();


    }
}
