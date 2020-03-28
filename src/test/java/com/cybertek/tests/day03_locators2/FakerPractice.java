package com.cybertek.tests.day03_locators2;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FakerPractice {
    public static void main(String[] args) {
        //create Faker object
        Faker fakeData = new Faker();

        //i need first name
        String name = fakeData.name().firstName();
        String password = fakeData.phoneNumber().cellPhone();
        //System.out.println(name);

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/login");
        driver.manage().window().maximize();

        driver.findElement(By.name("username")).sendKeys(name);
        driver.findElement(By.name("password")).sendKeys(password);

        driver.findElement(By.id("wooden_spoon")).click();
        //locating the welcome massage with tagname
        WebElement welcomeMassage = driver.findElement(By.tagName("h4"));
        //  Verify the welcome massage
        //expected vs actual
        String expectedMassage = "Welcome to the Secure Area. When you are done click logout below.";


        String actualWelcomeMassage = welcomeMassage.getText();
        if (expectedMassage.equalsIgnoreCase(actualWelcomeMassage)){
            System.out.println("PASSS");
        }else {
            System.out.println("Fail");
        }

        driver.close();
    }
}
