package page_objects.YouTube;

import org.openqa.selenium.By;
import page_objects.BasePage;

public class YouTubeTrendingPage extends BasePage {
    //locators
    private By secondTrendingVideo = By.xpath("//yt-formatted-string[contains(text(),'Lady Gaga - Stupid Love (Official Music Video)')]");

    public boolean isTargetVidDisplayed(){
        return isElementDisplayed(secondTrendingVideo);
    }



    }



}
