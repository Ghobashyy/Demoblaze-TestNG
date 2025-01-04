package addproduct;

import basesteps.BaseSteps;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.LapTopPage;
import pages.Product2Page;

public class AddProduct2 extends BaseSteps {
    @Test
    public void addproduct2tocart() throws InterruptedException {
       LapTopPage lapTopPage = homepage.clickonlaptops();
       Thread.sleep(1000);
       Product2Page product2Page = lapTopPage.clickonproduct2();
        Thread.sleep(1000);
       product2Page.addproduct2tocart();
        Thread.sleep(1000);
       String actualresult = product2Page.getprodduct2alerttext();
       String expectedresult = "Product added";
        Assert.assertTrue(actualresult.contains(expectedresult));
         product2Page.acceptproduct2alert();
        Thread.sleep(1000);
        CartPage cartPage = product2Page.clickoncart2();
        Thread.sleep(2000);
        String actualresultname = cartPage.getproduct2name();
        String expectedresultname = "Sony vaio i7";
        Assert.assertTrue(actualresultname.contains(expectedresultname));
        Thread.sleep(1000);
        String actualresultprice = cartPage.getproduct2price();
        String expectedresultprice = "790";
        Assert.assertTrue(actualresultprice.contains(expectedresultprice));
    }
}
