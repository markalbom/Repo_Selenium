package test_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import page_objects.Hotels.HotelsLandingPage;
import page_objects.LandingPage;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class VerifyHotelsOneWeekCheckIn extends DriverWrapper {
    public String isOneWeekCheckIn(){
        HotelsLandingPage landingPage = new HotelsLandingPage();
        landingPage.clickHotelCalenderSelect();

        Calendar ourCal = Calendar.getInstance();
        ourCal.add(Calendar.DAY_OF_YEAR, 7);
        SimpleDateFormat sdf = new SimpleDateFormat("d");
        Date date = new Date();
        String today = sdf.format(date);
        String checkOutDate = today + 7;


        //put hotels.com calendar dates into list, iterate through list,
        List<WebElement> HotelsCheckInCalender = getDriver().findElements(By.xpath("//table[@class='widget-datepicker-contains-selected widget-datepicker-contains-highlight widget-datepicker-contains-range-end']"));
        for (WebElement day: HotelsCheckInCalender){
            if ((today + 7 == checkOutDate)){
                return ("checkout date is 7 days from check-in date");
                break;
            }
        }


}
}
