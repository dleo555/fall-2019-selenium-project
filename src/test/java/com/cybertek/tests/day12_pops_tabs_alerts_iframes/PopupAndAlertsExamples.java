package com.cybertek.tests.day12_pops_tabs_alerts_iframes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PopupAndAlertsExamples {
    WebDriver driver;
@BeforeMethod
        public void beforeMethod(){
    driver = WebDriverFactory.getDriver("Chrome");
}
@AfterMethod
public void afterMethod(){
    driver.quit();
}
@Test
        public void htmlPopup() {
    driver.get("https://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml");
    driver.findElement(By.xpath("//span[text()='Destroy the World']")).click();
    driver.findElement(By.id("j_idt720:j_idt723")).click();
 }


}
