package day04;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class textMethodOfXpath {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("Firefox");
        driver.get("http://practice.cybertekschool.com/context_menu");

        WebElement menu = driver.findElement(By.xpath("//h3[text()='Context Menu']"));

        System.out.println(menu.getText());

        String expected ="Context Menu";
        String actual = menu.getText();
        if(expected.equals(actual)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }

    }
}
