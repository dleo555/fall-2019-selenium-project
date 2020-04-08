package com.cybertek.tests.b_hw_practice.HW2016_Olympics;

import com.cybertek.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class DefaultSortTest extends TestBase {

    @Test
    public void sortTest() {
        driver.get("https://en.wikipedia.org/wiki/2016_Summer_Olympics#Medal_table");
        int expected = 1;
        for (int i = 1; i < getRowCount() - 2; i++) {
            String xpath = getCellXpathByIndex(i, 1);
            WebElement cell = driver.findElement(By.xpath(xpath));
            String rank = cell.getText();
            int actual = Integer.valueOf(rank);
            Assert.assertEquals(expected, actual);
            expected++;
        }
    }

    @Test
    public void sortTest2() {
        driver.get("https://en.wikipedia.org/wiki/2016_Summer_Olympics#Medal_table");
        driver.findElement(By.xpath("//table[@class='wikitable sortable plainrowheaders jquery-tablesorter']//tr[1]/th[2]")).click();
        List<String> list = new ArrayList<>();
        //we need to eliminate row 8 because it cannot find an element. NO th for row 8
        for (int i = 1; i < 8; i++) {
            String xpath = getCellXpathByIndex2(i);
            WebElement cell = driver.findElement(By.xpath(xpath));
            String countyName = cell.getText();
            list.add(countyName);
        }
        for (int i = 9; i < getRowCount()-1; i++) {
            String xpath = getCellXpathByIndex2(i);
            WebElement cell = driver.findElement(By.xpath(xpath));
            String countyName = cell.getText();
            list.add(countyName);
        }
        //we got an list of countries, we need to verify if it has ascending order

    }

    //to loop through the table I need to know how many rows in it
        public int getRowCount () {
             return driver.findElements(By.xpath
                    ("//table[@class='wikitable sortable plainrowheaders jquery-tablesorter']//tr")).size();
        }
    //to loop through the table I need xpath (I cannot enter int directly)
        public String getCellXpathByIndex(int row, int column) {
            String xpath = "//table[@class='wikitable sortable plainrowheaders jquery-tablesorter']//tr[" + row + "]/td[" + column + "]";
            return xpath;
        }
        //to loop through the table without text
    public String getCellXpathByIndex2(int row) {
        String xpath = "//table[@class='wikitable sortable plainrowheaders jquery-tablesorter']//tbody/tr[" + row + "]/th";
        return xpath;
    }
}