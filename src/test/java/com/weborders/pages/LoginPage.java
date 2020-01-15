package com.weborders.pages;


import com.weborders.utilities.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id="")
    public WebElement userNameInputElement ;

    @FindBy(id="")
    public WebElement passwordInputElement ;

    public void loin() {

        String userName = ConfigurationReader.getProperty("user_name");
        String password = ConfigurationReader.getProperty("password");

        userNameInputElement.sendKeys(userName);
        passwordInputElement.sendKeys(password, Keys.ENTER);
    }

    public void login (String userName, String password){
        userNameInputElement.sendKeys(userName);
        passwordInputElement.sendKeys(password, Keys.ENTER);
    }


}
