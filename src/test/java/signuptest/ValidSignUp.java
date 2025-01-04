package signuptest;

import basesteps.BaseSteps;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignUpPage;

public class ValidSignUp extends BaseSteps {
    @Test
    public void testsignupwithvalidcredential(){
     SignUpPage signUpPage = homepage.clickonsignup();
     signUpPage.entersignupusername();
     signUpPage.entersignuppassword();
     signUpPage.clickonsignupbutton();
     String actualresult = signUpPage.getsignupalerttext();
     String expectedresult = "Sign up successful.";
        Assert.assertTrue(actualresult.contains(expectedresult));
        System.out.println(actualresult);
     signUpPage.acceptalert();
    }
}
