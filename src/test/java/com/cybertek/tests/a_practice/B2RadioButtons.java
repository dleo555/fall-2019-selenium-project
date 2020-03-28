package com.cybertek.tests.a_practice;

import utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class B2RadioButtons {
    public static void main(String[] args) throws Throwable {
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//label[text()='Yellow']/preceding-sibling::input")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.xpath
                ("//label[contains(text(),'Green')]/preceding-sibling::input")).isEnabled());
        driver.findElement(By.xpath("//label[contains(text(),'Green')]/preceding-sibling::input")).click();
        Thread.sleep(2000);

        List<WebElement> radioButtons = driver.findElements(By.cssSelector("input[type='radio']"));
        for (WebElement radio : radioButtons){
            Thread.sleep(2000);
            System.out.println(radio.getAttribute("name")+ "-" + radio.isEnabled());
        }




        driver.quit();
    }
}
