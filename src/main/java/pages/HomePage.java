package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends PageBase {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    String url = "https://automationexercise.com/";

    public By signOrLoginButton =  By.className("fa-lock");

    public void navigateToHomePage(){
        Utilites.navigateToUrl(driver, url);
    }

    public void clickRegButton(){
        Utilites.clickButton(driver, signOrLoginButton);
    }


}
