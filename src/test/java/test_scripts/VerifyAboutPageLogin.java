package test_scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.AboutPage;
import page_objects.BasePage;
import page_objects.LandingPage;

public class VerifyAboutPageLogin extends DriverWrapper {
    @Test
    public void verifyAboutPageLoginText() {
        LandingPage landingPage = new LandingPage();
        landingPage.clickAboutPageLink();
        AboutPage aboutPage = new AboutPage();
        aboutPage.aboutPageCreatePage();
        String expectedAboutPrompt = "Log In to Continue...";
        Assert.assertEquals(expectedAboutPrompt, aboutPage.aboutPageLoginPromptMsg(), "ERROR: the 2 values do not match");

    }


}
