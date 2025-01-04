package logintest;

import basesteps.BaseSteps;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LogInPage;

public class ValidLogin extends BaseSteps {
    @Test
    public void testloginwithvalidcredential() throws InterruptedException {
       LogInPage logInPage = homepage.clickonlogin();
       logInPage.enterloginusername("MostafaGhobashy");
       logInPage.enterloginpassword("Ghobash11");
       logInPage.clickonloginbutton();
       Thread.sleep(2000);
       String actualresult = logInPage.getloginusertext();
       String expectedresult = "Welcome MostafaGhobashy";
        Assert.assertTrue(actualresult.contains(expectedresult));
        System.out.println(actualresult);
    }
}
