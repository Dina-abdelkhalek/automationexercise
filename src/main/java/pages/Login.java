package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login extends PageBase{
    public Login(WebDriver driver) {
        super(driver);
    }

    public By emailAddress = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]");
    public By accPassword = By.name("password");
    public By loginButton = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button");

    public void  loginCredentials(String email, String password){
        Utilites.setText(driver,emailAddress,email);
        Utilites.setText(driver,accPassword,password);
        Utilites.clickButton(driver,loginButton);
    }

}
