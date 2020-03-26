package b_hw_practice.locatorsHW;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonTitle {
    public static void main(String[] args)throws Throwable{
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.get("https://www.amazon.com");

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("printer");
        driver.findElement(By.cssSelector("input[value='Go']")).click();

        if (driver.getTitle().contains("printer")){
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }

        Thread.sleep(5666);
        driver.close();
    }
}
