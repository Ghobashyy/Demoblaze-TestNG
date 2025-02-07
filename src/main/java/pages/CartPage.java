package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;
    public CartPage(WebDriver driver){
        this.driver = driver;
    }
    //Locators
    private By homePage = By.xpath("//a[contains(text(),'Home')]");
    private By cart = By.xpath("//a[contains(text(),'Cart')]");
    private By productQuantity = By.className("success");
    private By firstProductName = By.xpath("//td[contains(text(),'Sony vaio i5')]");
    private By secondProductName = By.xpath("//td[contains(text(),'Sony vaio i7')]");
    private By firstProductPrice = By.xpath("//td[contains(text(),'790')]");
    private By secondProductPrice = By.xpath("//td[contains(text(),'790')][1]");
    private By totalPrice = By.id("totalp");
    private By placeOrder = By.xpath("//button[contains(text(),'Place')]");
    //Actions
    public void clickOnHome(){
        driver.findElement(homePage).click();
    }
    public void clickOnCart(){
        driver.findElement(cart).click();
    }
    public int getQuantity(){
        int numberOfElements =driver.findElements(productQuantity).size();
        return numberOfElements;
    }
    public String getFirstProductName(){
       return driver.findElement(firstProductName).getText();
    }
    public String getSecondProductName(){
        return driver.findElement(secondProductName).getText();
    }
    public String getFirstProductPrice() {
        return driver.findElement(firstProductPrice).getText();
    }
    public String getSecondProductPrice(){
        return driver.findElement(secondProductPrice).getText();
    }
    public String getTotalPrice(){
       return driver.findElement(totalPrice).getText();
    }
    public PlaceOrderPage clickOnPlaceOrder(){
        driver.findElement(placeOrder).click();
        return new PlaceOrderPage(driver);
    }
}
