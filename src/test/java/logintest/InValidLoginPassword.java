package logintest;

import basesteps.BaseSteps;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LogInPage;

public class InValidLoginPassword extends BaseSteps {
    @Test
    public void testLoginWithInvalidUsername() {
        LogInPage logInPage = homepage.clickOnLogIn();
        logInPage.enterLoginUsername("MostafaGhobashy");
        logInPage.enterLoginPassword("223asd");
        logInPage.clickOnLoginButton();
        String actualResult = logInPage.getLoginAlertText();
        String expectedResult = "Wrong password.";
        Assert.assertTrue(actualResult.contains(expectedResult));
        logInPage.acceptLoginAlert();
    }
}

