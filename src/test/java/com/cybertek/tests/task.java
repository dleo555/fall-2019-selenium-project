package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        String Gtitle = driver.getTitle();
        driver.get("https://www.etsy.com");
        String Etitle = driver.getTitle();

        driver.navigate().back();

        if (Gtitle.equals(driver.getTitle())){
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        driver.navigate().forward();

        if (Etitle.equals(driver.getTitle())){
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        driver.close();
    }
}
