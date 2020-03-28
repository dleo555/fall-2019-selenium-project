package com.cybertek.tests.a_practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class A4LocatorById {
    public static void main(String[] args) throws Throwable {
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String url = "https://www.google.com";
        driver.get(url);

        //WebElement btn1 = driver.findElement(By.id("hplogo"));
        WebElement btn1 = driver.findElement(By.id("gbqfbb"));
        btn1.click();
        String expectedText = "I'm Feeling Lucky";
        String actualText = btn1.getAttribute("value");
        if (actualText.equals(expectedText)){
            System.out.println("passed");
        } else {
            System.out.println("failed");
        }
        Thread.sleep(3000);

        driver.close();
    }
}
