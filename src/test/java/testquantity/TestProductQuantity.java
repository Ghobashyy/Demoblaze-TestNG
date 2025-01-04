package testquantity;

import basesteps.BaseSteps;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.LapTopPage;
import pages.Product1Page;

public class TestProductQuantity extends BaseSteps {
    @Test
    public void tessst() throws InterruptedException {
        LapTopPage lapTopPage = homepage.clickonlaptops();
        Thread.sleep(1000);
        Product1Page product1Page = lapTopPage.clickonproduct1();
        Thread.sleep(1000);
        product1Page.addproduct1tocart();
        Thread.sleep(1000);
        product1Page.acceptproduct1alert();
        Thread.sleep(1000);
        product1Page.addproduct1tocart();
        Thread.sleep(1000);
        CartPage cartPage = product1Page.acceptproduct1alert2();
        Thread.sleep(1000);
        cartPage.clickoncart();
        Thread.sleep(2000);
        int actualresult = cartPage.getquantity();
        Assert.assertEquals(actualresult, 2);
        System.out.println(actualresult);
    }
}
