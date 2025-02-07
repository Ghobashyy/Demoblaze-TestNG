package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    //locators
    private By signUp = By.id("signin2");
    private By logIn = By.id("login2");
    private By cart = By.id("cartur");
    private By laptopsCategories = By.xpath("//a[contains(text(),'Laptops')]");


    //actions
     public SignUpPage clickOnSignUp(){
        driver.findElement(signUp).click();
        return new SignUpPage(driver);
    }
    public LogInPage clickOnLogIn(){
         driver.findElement(logIn).click();
         return new LogInPage(driver);
    }
    public CartPage clickOnCart(){
         driver.findElement(cart).click();
         return new CartPage(driver);
    }
    public LapTopPage clickOnLaptops(){
         driver.findElement(laptopsCategories).click();
         return new LapTopPage(driver);
    }
}
