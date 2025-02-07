package logintest;

import basesteps.BaseSteps;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LogInPage;

public class InValidLoginUsername extends BaseSteps {
    @Test
    public void testLoginWithInvalidPassword(){
        LogInPage logInPage = homepage.clickOnLogIn();
        logInPage.enterLoginUsername("11mm22m");
        logInPage.enterLoginPassword("223asd");
        logInPage.clickOnLoginButton();
        String actualResult = logInPage.getLoginAlertText();
        String expectedResult = "User does not exist.";
        Assert.assertTrue(actualResult.contains(expectedResult));
        logInPage.acceptLoginAlert();
    }
}
