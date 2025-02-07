package signuptest;

import basesteps.BaseSteps;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignUpPage;

public class ValidSignUp extends BaseSteps {
    @Test
    public void testSignupWithValidCredential(){
     SignUpPage signUpPage = homepage.clickOnSignUp();
     signUpPage.enterSignupUsername();
     signUpPage.enterSignupPassword();
     signUpPage.clickOnSignupButton();
     String actualResult = signUpPage.getSignupAlertText();
     String expectedResult = "Sign up successful.";
        Assert.assertTrue(actualResult.contains(expectedResult));
        System.out.println(actualResult);
     signUpPage.acceptAlert();
    }
}
