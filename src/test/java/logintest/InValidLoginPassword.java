package logintest;

import basesteps.BaseSteps;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LogInPage;

public class InValidLoginPassword extends BaseSteps {
    @Test
    public void testloginwithinvalidusername() {
        LogInPage logInPage = homepage.clickonlogin();
        logInPage.enterloginusername("MostafaGhobashy");
        logInPage.enterloginpassword("223asd");
        logInPage.clickonloginbutton();
        String actualresult = logInPage.getloginalerttext();
        String expectedresult = "Wrong password.";
        Assert.assertTrue(actualresult.contains(expectedresult));
        logInPage.acceptloginalert();
    }
}

