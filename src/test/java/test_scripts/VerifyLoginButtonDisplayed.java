package test_scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.LandingPage;

public class VerifyLoginButtonDisplayed extends DriverWrapper {

    @Test
    public void testLoginButton() {
        LandingPage landingPage = new LandingPage();
        Assert.assertTrue(landingPage.isLoginButtonDisplayed());
    }
}
