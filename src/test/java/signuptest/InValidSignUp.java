package signuptest;

import basesteps.BaseSteps;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignUpPage;

public class InValidSignUp extends BaseSteps {
    @Test
    public void testsignupwithinvalidcredential(){
       SignUpPage signUpPage = homepage.clickonsignup();
       signUpPage.enterinvalidsignupusername("MostafaGhobashy");
       signUpPage.enterinvalidsignuppassword("Ghobash11");
       signUpPage.clickonsignupbutton();
       String actualresult = signUpPage.getsignupalerttext();
       String expectedresult = "This user already exist.";
        Assert.assertTrue(actualresult.contains(expectedresult));
        System.out.println(actualresult);
       signUpPage.acceptalert();
    }
}
