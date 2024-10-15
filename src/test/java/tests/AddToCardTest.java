package tests;

import org.testng.annotations.Test;
import pages.*;
import java.time.Duration;

import java.time.Duration;

public class AddToCardTest extends TestBase{
    HomePage homePage;
    Login loginPage;
    AddToCard addToCardPage;
    Utilites.JsonFileManager readLoginData = new Utilites.JsonFileManager("src/test/java/data/LoginTestData.json");
    Utilites.JsonFileManager readData = new Utilites.JsonFileManager("src/test/java/data/PaymentTestData.json");

    @Test(description = "Verify that user make payment order successfully")
    public void addToCardOrder() throws InterruptedException {
        //Creating an instance of the HomePage class and storing it in the homePage variable
        homePage = new HomePage(driver);
        //Navigate to home page
        homePage.navigateToHomePage();
        //Click on the Login button
        homePage.clickRegButton();
        //creating an instance of the LoginPage class and storing it in the loginPage variable
        loginPage = new Login(driver);
        //Enter the Login credentials
        loginPage.loginCredentials(readLoginData.getTestData("Email"),readLoginData.getTestData("Password"));
        //creating an instance of the add To Card Page class and storing it in the add To Card Page variable
        addToCardPage = new AddToCard(driver);
        addToCardPage.setAddToCard();
        addToCardPage.paymentOrder(readData.getTestData("nameOnCard"),readData.getTestData("cardNumber"),readData.getTestData("cvcNumber"),
              readData.getTestData("expireMonth"),readData.getTestData("expireYear"));


    }





}
