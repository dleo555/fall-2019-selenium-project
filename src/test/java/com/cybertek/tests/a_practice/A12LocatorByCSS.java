package com.cybertek.tests.a_practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class A12LocatorByCSS {
    public static void main(String[] args) throws Throwable{
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().fullscreen();
        String url = "http://practice.cybertekschool.com/registration_form";
        driver.get(url);

        driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("James");
        driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Bond");
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("JamesBond");
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("jbond@cb.com");

        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("qwerty12345");
        driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("202-202-2002");
        driver.findElement(By.cssSelector("input[value='male']")).click();

        //DOB
        driver.findElement(By.cssSelector("input[name='birthday']")).sendKeys("10/10/1999");
        //department

        Select select = new Select(driver.findElement(By.cssSelector("select[name='job_title']")));
        select.selectByVisibleText("SDET");

        //select language

        driver.findElement(By.id("wooden_spoon")).click();
        Thread.sleep(15000);
        driver.quit();
    }
}
