package testquantity;

import basesteps.BaseSteps;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.LapTopPage;
import pages.FirstProductPage;

public class TestProductQuantity extends BaseSteps {
    @Test
    public void testQuantity() throws InterruptedException {
        LapTopPage lapTopPage = homepage.clickOnLaptops();
        Thread.sleep(1000);
        FirstProductPage firstProductPage = lapTopPage.clickOnFirstProduct();
        Thread.sleep(1000);
        firstProductPage.addFirstProductToCart();
        Thread.sleep(1000);
        firstProductPage.acceptFirstProductAlert();
        Thread.sleep(1000);
        firstProductPage.addFirstProductToCart();
        Thread.sleep(1000);
        CartPage cartPage = firstProductPage.acceptFirstProductSecondAlert();
        Thread.sleep(1000);
        cartPage.clickOnCart();
        Thread.sleep(2000);
        int actualResult = cartPage.getQuantity();
        Assert.assertEquals(actualResult, 2);
    }
}