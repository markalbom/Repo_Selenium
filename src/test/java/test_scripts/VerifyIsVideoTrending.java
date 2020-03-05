package test_scripts;

import org.testng.annotations.Test;
import page_objects.LandingPage;
import page_objects.YouTube.YouTubeTrendingPage;

@Test
public class VerifyIsVideoTrending extends DriverWrapper {
    public void verifyIsYTVideoTrending(){
        LandingPage landingPage = new LandingPage();
        landingPage.clickYouTubeTrendingButton();
        YouTubeTrendingPage YTLandingPage = new YouTubeTrendingPage();
        YTLandingPage.isTargetVidDisplayed();
    }




}
