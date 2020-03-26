package b_hw_practice.locatorsHW;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WikipediaURL {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.get("https://www.wikipedia.org");
        driver.findElement(By.id("searchInput")).sendKeys("selenium webdriver");
        driver.findElement(By.cssSelector("i[class='sprite svg-search-icon']")).click();
        driver.findElement(By.cssSelector("a[title='Selenium (software)']")).click();
        if (driver.getCurrentUrl().endsWith("Selenium_(software)")){
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }

    }
}
