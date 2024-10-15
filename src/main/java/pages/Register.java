package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Register extends PageBase {

    public Register(WebDriver driver) {
        super(driver);
    }
    Select select;
    //data for sing up page
    public By Name = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]");
    public By Email = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]");
    public By signUpButton = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button");

    //data for register
    public By Title = By.id("uniform-id_gender2");
    public By passWord = By.xpath("//*[@id=\"password\"]");
    public By birthDay = By.xpath("//*[@id=\"days\"]") ;
    public By birthMonth = By.xpath("//*[@id=\"months\"]");
    public By birthYear = By.xpath("//*[@id=\"years\"]");
    public By firstName = By.xpath("//*[@id=\"first_name\"]");
    public By lastName = By.xpath("//*[@id=\"last_name\"]");
    public By address = By.xpath("//*[@id=\"address1\"]");
    public By country = By.xpath("//*[@id=\"country\"]");
    public By state = By.xpath("//*[@id=\"state\"]");
    public By city = By.xpath("//*[@id=\"city\"]");
    public By zipCode = By.xpath("//*[@id=\"zipcode\"]");
    public By mobile_Number = By.xpath("//*[@id=\"mobile_number\"]");
    public By createAccountButton = By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button") ;
    public By continueButton = By.className("btn-primary");



    public void userSignUp(String name, String email)
    {

        Utilites.setText(driver, Name, name);
        Utilites.setText(driver, Email, email);
        Utilites.clickButton(driver, signUpButton);
    }


    public void userRegister(String title, String dayOfBirth, String monthOfBirth, String yearOfBirth, String password, String last_Name, String name, String Address, String Country, String State, String City, String zipcode, String mobileNumber)
    {
        Utilites.clickButton(driver,Title);
        Utilites.selectFromDropDown(driver,birthDay,dayOfBirth);
        Utilites.selectFromDropDown(driver,birthMonth,monthOfBirth);
        Utilites.selectFromDropDown(driver,birthYear,yearOfBirth);
        Utilites.setText(driver, passWord, password);
        Utilites.setText(driver,firstName, name);
        Utilites.setText(driver,lastName,last_Name);
        Utilites.setText(driver,address,Address);
        Utilites.setText(driver,country,Country);
        Utilites.setText(driver,state, State);
        Utilites.setText(driver,city,City);
        Utilites.setText(driver,zipCode,zipcode);
        Utilites.setText(driver,mobile_Number,mobileNumber);
        Utilites.clickButton(driver, createAccountButton);
        Utilites.clickButton(driver, continueButton);
    }
}
