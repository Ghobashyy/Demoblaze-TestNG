package addproduct;

import basesteps.BaseSteps;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.LapTopPage;
import pages.Product1Page;

public class AddProduct1 extends BaseSteps {
    @Test
    public void addproduct1tocart() throws InterruptedException {
        LapTopPage lapTopPage = homepage.clickonlaptops();
        Thread.sleep(1000);
        Product1Page product1Page = lapTopPage.clickonproduct1();
        Thread.sleep(2000);
        product1Page.addproduct1tocart();
        Thread.sleep(1000);
        String actualresult = product1Page.getprodduct1alerttext();
        String expectedresult = "Product added";
        Assert.assertTrue(actualresult.contains(expectedresult));
        product1Page.acceptproduct1alert();
        Thread.sleep(1000);
        CartPage cartPage = product1Page.clickoncart();
        Thread.sleep(2000);
        String actualresultname = cartPage.getproduct1name();
        String expectedresultname = "Sony vaio i5";
        Assert.assertTrue(actualresultname.contains(expectedresultname));
        Thread.sleep(1000);
        String actualresultprice = cartPage.getproduct1price();
        String expectedresultprice = "790";
        Assert.assertTrue(actualresultprice.contains(expectedresultprice));
    }
}
