package page_objects.Hotels;

import org.openqa.selenium.By;
import page_objects.BasePage;

public class HotelsLandingPage extends BasePage {

    //locators for Hotels test
    private By hotelsCalender = By.xpath("//table[@class='widget-datepicker-contains-selected widget-datepicker-contains-highlight widget-datepicker-contains-range-end']");
    private By hotelCalenderSelect = By.className("query-localised-check-in");

    //methods for Hotels test
    public void clickHotelCalenderSelect(){clickOn(hotelCalenderSelect);}


}
