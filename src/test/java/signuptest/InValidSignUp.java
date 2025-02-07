package signuptest;

import basesteps.BaseSteps;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignUpPage;

public class InValidSignUp extends BaseSteps {
    @Test
    public void testSignupWithInvalidCredential(){
       SignUpPage signUpPage = homepage.clickOnSignUp();
       signUpPage.enterInvalidSignupUsername("MostafaGhobashy");
       signUpPage.enterInvalidSignupPassword("Ghobash11");
       signUpPage.clickOnSignupButton();
       String actualResult = signUpPage.getSignupAlertText();
       String expectedResult = "This user already exist.";
        Assert.assertTrue(actualResult.contains(expectedResult));
        System.out.println(actualResult);
       signUpPage.acceptAlert();
    }
}
