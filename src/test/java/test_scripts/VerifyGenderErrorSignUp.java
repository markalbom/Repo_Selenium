package test_scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.LandingPage;
import page_objects.LoginPage;

public class VerifyGenderErrorSignUp extends DriverWrapper {
    @Test
    public void verifyGenderError() throws InterruptedException {

        LandingPage landingPage = new LandingPage();
        LoginPage loginPage = new LoginPage();
        landingPage.enterFirstName("John");
        landingPage.enterLastName("Doe");
        landingPage.enterSignUpPhoneEmail("1-284-888-8888");
        landingPage.enterSignUpPassword("password1234");
        landingPage.signUp();
        Thread.sleep(2000);
        String genderErrorMessage = "please choose a gender. You can change who can see this later.";

        Assert.assertEquals(genderErrorMessage, landingPage.getGenderErrorMessage(), "ERROR: gender messages do not match");


    }
}
