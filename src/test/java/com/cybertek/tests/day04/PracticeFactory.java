package com.cybertek.tests.day04;

import utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class PracticeFactory {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.get("http://google.com");
    }
}
