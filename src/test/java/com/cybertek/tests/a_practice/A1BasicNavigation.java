package com.cybertek.tests.a_practice;

import com.cybertek.tests.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class A1BasicNavigation {
    public static void main(String[] args) throws Throwable{

        WebDriver driver = WebDriverFactory.getDriver("Chrome");

        String url = "https://www.google.com";
        String url2 = "https://www.amazon.com";

        driver.get(url);
        Thread.sleep(3000);

        driver.navigate().to(url2);
        Thread.sleep(3000);

        driver.navigate().back();
        Thread.sleep(3000);

        driver.navigate().forward();
        Thread.sleep(3000);

        driver.close();
    }
}
