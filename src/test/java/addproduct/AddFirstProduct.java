package addproduct;

import basesteps.BaseSteps;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.LapTopPage;
import pages.FirstProductPage;

public class AddFirstProduct extends BaseSteps {
    @Test
    public void addFirstProductToCart() throws InterruptedException {
        LapTopPage lapTopPage = homepage.clickOnLaptops();
        Thread.sleep(1000);
        FirstProductPage firstProductPage = lapTopPage.clickOnFirstProduct();
        Thread.sleep(2000);
        firstProductPage.addFirstProductToCart();
        Thread.sleep(1000);
        String actualResult = firstProductPage.getFirstProductAlertText();
        String expectedResult = "Product added";
        Assert.assertTrue(actualResult.contains(expectedResult));
        firstProductPage.acceptFirstProductAlert();
        Thread.sleep(1000);
        CartPage cartPage = firstProductPage.clickOnCart();
        Thread.sleep(2000);
        String actualResultName = cartPage.getFirstProductName();
        String expectedResultName = "Sony vaio i5";
        Assert.assertTrue(actualResultName.contains(expectedResultName));
        Thread.sleep(1000);
        String actualResultPrice = cartPage.getFirstProductPrice();
        String expectedResultPrice = "790";
        Assert.assertTrue(actualResultPrice.contains(expectedResultPrice));
    }
}