package test_scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.LandingPage;
import page_objects.MessengerPage;

public class VerifyMessenger extends DriverWrapper {

    @Test
    public void verifyMessenger (){
        LandingPage landingPage = new LandingPage();
        landingPage.clickMessenger();
        MessengerPage messengerPage = new MessengerPage();
        messengerPage.messengerSignIn();
        String expectedErrorMessage = "your login is incorrect";
        //assertion
        Assert.assertEquals(expectedErrorMessage, messengerPage.messengerLoginError(), "ERROR: messages are not the same");

    }
}
