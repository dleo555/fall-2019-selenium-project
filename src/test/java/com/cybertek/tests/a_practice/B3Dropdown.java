package com.cybertek.tests.a_practice;

import utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class B3Dropdown {
    public static void main(String[] args) throws Exception{
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");


        Select select = new Select(driver.findElement(By.id("dropdown")));
        select.selectByVisibleText("Option 1");
        Thread.sleep(2000);

        //Select select1 = new Select(driver.findElement(By.id("state")));
        //select1.selectByValue("DC");
        //Thread.sleep(2000);

        Select select2 = new Select(driver.findElement(By.id("state")));
        System.out.println(select2.getFirstSelectedOption().getText());
        select2.selectByIndex(1);
        Thread.sleep(2000);

        Select select3 = new Select(driver.findElement(By.name("Languages")));
        List<WebElement> options = select3.getOptions();
        for(WebElement option : options){
            Thread.sleep(1000);
            select3.selectByVisibleText(option.getText());
        }
        select3.deselectAll();
        Thread.sleep(3000);
        driver.quit();
    }
}
