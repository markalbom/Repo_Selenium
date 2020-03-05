package test_scripts;

import org.testng.annotations.Test;
import page_objects.AmazonSearchResultPage;
import page_objects.LandingPage;

public class VerifyAmazonPrice extends DriverWrapper {

    @Test

    public void checkAmazonPrice() throws InterruptedException {
        LandingPage landingPage = new LandingPage();
        landingPage.enterAmazonProductForSearch("iphone");
        landingPage.clickAmazonSearch();
        Thread.sleep(2000);
        AmazonSearchResultPage amzResults = new AmazonSearchResultPage();



    }
}
