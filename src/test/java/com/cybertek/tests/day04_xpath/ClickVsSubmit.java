package com.cybertek.tests.day04_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickVsSubmit {
    public static void main(String[] args) {
        String str = "http://practice.cybertekschool.com/forgot_password";

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(str);
        driver.manage().window().maximize();

        WebElement emailbox = driver.findElement(By.name("email"));
        emailbox.sendKeys("abc@gmail.com");
        WebElement submitBTN = driver.findElement(By.id("form_submit"));
        submitBTN.submit();



    }
}
