package b_hw_practice.locatorsHW;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.*;

public class EtsySearchtest {
    public static void main(String[] args)throws Throwable {
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.get("https://www.ebay.com");
        driver.findElement(By.cssSelector("input[size='50']")).sendKeys("wooden spoon");
        driver.findElement(By.id("gh-btn")).click();

       String searchResults = driver.findElement
               (By.xpath("html/body/div[4]/div[4]/div/div/div[2]/div/div/h1/span")).getText();
       driver.findElement
               (By.xpath("html/body/div[4]/div[3]/ul/li/ul/li/div[2]/ul/li/a/span")).click();
       String searchResults2 = driver.findElement
                (By.xpath("html/body/div[4]/div[4]/div/div/div[2]/div/div/h1/span")).getText();
        System.out.println("Result 1" +searchResults);
        System.out.println("Result 2" +searchResults2 + " should be bigger");

       driver.navigate().back();
       String varifyWoodenSpoon = driver.findElement
               (By.cssSelector("input[size='50']")).getAttribute("value");
        System.out.println(varifyWoodenSpoon);

       driver.navigate().back();
        System.out.println(driver.findElement
                (By.cssSelector("input[size='50']")).getAttribute("value").isEmpty());

        driver.close();
    }
}
