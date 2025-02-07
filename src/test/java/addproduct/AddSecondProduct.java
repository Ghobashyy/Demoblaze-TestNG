package addproduct;

import basesteps.BaseSteps;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.LapTopPage;
import pages.SecondProductPage;

public class AddSecondProduct extends BaseSteps {
    @Test
    public void addSecondProductToCart() throws InterruptedException {
       LapTopPage lapTopPage = homepage.clickOnLaptops();
       Thread.sleep(1000);
       SecondProductPage secondProductPage = lapTopPage.clickOnSecondProduct();
        Thread.sleep(1000);
       secondProductPage.addSecondProductToCart();
        Thread.sleep(1000);
       String actualResult = secondProductPage.getSecondProductAlertText();
       String expectedResult = "Product added";
        Assert.assertTrue(actualResult.contains(expectedResult));
         secondProductPage.acceptSecondProductAlert();
        Thread.sleep(1000);
        CartPage cartPage = secondProductPage.clickOnCartFromSecondProduct();
        Thread.sleep(2000);
        String actualResultName = cartPage.getSecondProductName();
        String expectedResultName = "Sony vaio i7";
        Assert.assertTrue(actualResultName.contains(expectedResultName));
        Thread.sleep(1000);
        String actualResultPrice = cartPage.getSecondProductPrice();
        String expectedResultPrice = "790";
        Assert.assertTrue(actualResultPrice.contains(expectedResultPrice));
    }
}
