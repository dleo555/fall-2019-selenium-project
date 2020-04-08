package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
    //page object classes needs constructor
    //we need to call page factory
        PageFactory.initElements(Driver.getDriver(), this);
        }
        @FindBy(id = "prependedInput")
    public WebElement username;
        @FindBy(id = "prependedInput2")
    public WebElement password;
        @FindBy(id = "_submit")
    public WebElement logIn;
        @FindBy(css = ".alert-error>div")
    public WebElement errorMessage;

        public void login(String username, String password){
            this.username.sendKeys(username);
            this.password.sendKeys(password);
            logIn.click();
        }
}
