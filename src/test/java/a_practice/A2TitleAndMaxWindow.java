package a_practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class A2TitleAndMaxWindow {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        String url = "http://practice.cybertekschool.com/multiple_buttons";
        driver.manage().window().fullscreen();

        driver.get(url);
        driver.getTitle();

        String title = driver.getTitle();
        driver.close();

        System.out.println(title);

    }
}
