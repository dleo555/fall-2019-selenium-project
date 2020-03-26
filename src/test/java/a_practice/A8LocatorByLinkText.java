package a_practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class A8LocatorByLinkText {
    public static void main(String[] args) throws Throwable {
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        String url = "http://practice.cybertekschool.com ";
        driver.get(url);

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println(allLinks.size());
        WebElement linktext = driver.findElement(By.linkText("A/B Testing"));
        System.out.println(linktext);



        Thread.sleep(3000);
        driver.close();



    }
}

