package logintest;

import basesteps.BaseSteps;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LogInPage;

public class ValidLogin extends BaseSteps {
    @Test
    public void testLoginWithValidCredential() throws InterruptedException {
       LogInPage logInPage = homepage.clickOnLogIn();
       logInPage.enterLoginUsername("MostafaGhobashy");
       logInPage.enterLoginPassword("Ghobash11");
       logInPage.clickOnLoginButton();
       String actualResult = logInPage.getLoginUserText();
       String expectedResult = "Welcome MostafaGhobashy";
        Assert.assertTrue(actualResult.contains(expectedResult));
        System.out.println(actualResult);
    }
}
