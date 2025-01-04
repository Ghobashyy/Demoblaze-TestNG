package placeordertest;

import basesteps.BaseSteps;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.PlaceOrderPage;

public class PlaceOrderTest extends BaseSteps {
    @Test
    public void placeorder() throws InterruptedException {
        CartPage cartPage = homepage.clickoncart();
        Thread.sleep(1000);
        PlaceOrderPage placeOrderPage = cartPage.clickonplaceorder();
        Thread.sleep(1000);
        placeOrderPage.entername("Mostafa Ghobashy");
        placeOrderPage.entercountry("Egypt");
        placeOrderPage.entercity("Cairo");
        placeOrderPage.entercreditcard("41115986322520");
        placeOrderPage.entermonth("12");
        placeOrderPage.enteryear("2024");
        placeOrderPage.clickonpurchasebutton();
        String actualresult = placeOrderPage.successpurchase();
        String expectedresult = "Thank you for your purchase!";
        Assert.assertTrue(actualresult.contains(expectedresult));
    }
}
