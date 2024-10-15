package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class AddToCard extends PageBase{
    public AddToCard(WebDriver driver) {
        super(driver);
    }
    public By addToCard = By.xpath("/html/body/section[2]/div[1]/div/div[2]/div[1]/div[2]/div/div[1]/div[1]/a");
    public By viewCart = By.xpath("//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a");
    public By checkOut = By.className("check_out");
    public By placeOrder = By.xpath("//*[@id=\"cart_items\"]/div/div[7]/a");
    public By cardName = By.name("name_on_card");
    public By card_Number = By.name("card_number");
    public By cardCvc = By.className("card-cvc");
    public By expirationMonth = By.className("card-expiry-month");
    public By expirationYear = By.className("card-expiry-year");
    public By payOrderButton = By.className("btn-primary");
    public By downloadInvoice = By.xpath("//*[@id=\"form\"]/div/div/div/a");

    public void setAddToCard() throws InterruptedException {
        Utilites.clickButton(driver,addToCard);
         //Thread.sleep(Duration.ofSeconds(5));
        Utilites.clickButton(driver,viewCart);
        //Thread.sleep(Duration.ofSeconds(7));
        Utilites.clickButton(driver,checkOut);
       // Thread.sleep(Duration.ofSeconds(7));
        Utilites.clickButton(driver,placeOrder);
        //Thread.sleep(Duration.ofSeconds(7));

    }
    public void paymentOrder(String nameOnCard, String cardNumber, String cvcNumber , String expireMonth ,String expireYear)
    {
        Utilites.setText(driver,cardName, nameOnCard);
        Utilites.setText(driver,card_Number,cardNumber);
        Utilites.setText(driver,cardCvc,cvcNumber);
        Utilites.setText(driver,expirationMonth,expireMonth);
        Utilites.setText(driver,expirationYear,expireYear);
        Utilites.clickButton(driver, payOrderButton);
        Utilites.clickButton(driver,downloadInvoice);
    }

}
