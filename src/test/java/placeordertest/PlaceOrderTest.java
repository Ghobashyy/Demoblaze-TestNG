package placeordertest;

import basesteps.BaseSteps;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.PlaceOrderPage;

public class PlaceOrderTest extends BaseSteps {
    @Test
    public void placeOrder() throws InterruptedException {
        CartPage cartPage = homepage.clickOnCart();
        Thread.sleep(1000);
        PlaceOrderPage placeOrderPage = cartPage.clickOnPlaceOrder();
        Thread.sleep(1000);
        placeOrderPage.enterName("Mostafa Ghobashy");
        placeOrderPage.enterCountry("Egypt");
        placeOrderPage.enterCity("Cairo");
        placeOrderPage.enterCreditCard("41115986322520");
        placeOrderPage.enterMonth("12");
        placeOrderPage.enterYear("2024");
        placeOrderPage.clickOnPurchaseButton();
        String actualResult = placeOrderPage.successPurchaseText();
        String expectedResult = "Thank you for your purchase!";
        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}
