package logintest;

import basesteps.BaseSteps;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LogInPage;

public class InValidLoginUsername extends BaseSteps {
    @Test
    public void testloginwithinvalidpassword(){
        LogInPage logInPage = homepage.clickonlogin();
        logInPage.enterloginusername("11mm22m");
        logInPage.enterloginpassword("223asd");
        logInPage.clickonloginbutton();
        String actualresult = logInPage.getloginalerttext();
        String expectedresult = "User does not exist.";
        Assert.assertTrue(actualresult.contains(expectedresult));
        logInPage.acceptloginalert();
    }
}
