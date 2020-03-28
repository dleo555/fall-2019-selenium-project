package com.cybertek.tests.a_practice;

import utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class A3CloseVsQuit {
    public static void main(String[] args) throws Throwable {
        //Close() will close only current window
        //quit() will close all windows

        //Example doesn't demonstrate close vs quit
        WebDriver driver = WebDriverFactory.getDriver("Opera");
        String url = "http://practice.cybertekschool.com/open_new_tab";

        driver.get(url);
        Thread.sleep(4000);

        driver.quit();

    }
}
