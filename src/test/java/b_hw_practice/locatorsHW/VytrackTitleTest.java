package b_hw_practice.locatorsHW;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VytrackTitleTest {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.get("https://app.vytrack.com/user/login");
        driver.findElement(By.xpath("//img[@alt='Bitnami']")).click();
        System.out.println(driver.getTitle().contains("Bitnami"));

        System.out.println(driver.getTitle());
        driver.close();
    }
}
