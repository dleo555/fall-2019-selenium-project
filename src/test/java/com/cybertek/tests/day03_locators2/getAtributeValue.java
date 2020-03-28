package com.cybertek.tests.day03_locators2;
import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class getAtributeValue {
    public static void main(String[] args) {
        Faker fakeData = new Faker();

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/login");
        driver.manage().window().maximize();

        String  valueOfClass = driver.findElement(By.id("wooden_spoon")).getAttribute("class");
        System.out.println("valueOfClass = " + valueOfClass);
    }
}
