package com.cybertek.tests.b_hw_practice;

import utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.Arrays;
import java.util.List;

public class GoogleResultsTitle {
    public static void main(String[] args) throws Throwable {
        List<String> searchStrs = Arrays.asList("Java", "cucumber bdd",
                "Selenium web browser automation");

        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.get("https://www.google.com");

        for (int i = 0; i < searchStrs.size(); i++) {
            driver.findElement(By.cssSelector("input[name='q']")).sendKeys(searchStrs.get(i));
            driver.findElement(By.cssSelector("input[value='Google Search']")).click();

            String fullURL = driver.findElement
                    (By.cssSelector("cite[class='iUh30 tjvcx']")).getText();

            driver.findElement(By.tagName("h3")).click();
            String actualURL = driver.getCurrentUrl();
            System.out.println(actualURL);
            System.out.println(fullURL);

            if (fullURL.contains(actualURL)) {
                System.out.println("passed");
            } else {
                System.out.println("failed");
            }

            driver.navigate().back();
            Thread.sleep(1000);
            driver.navigate().back();
        }
        driver.close();
    }
}
