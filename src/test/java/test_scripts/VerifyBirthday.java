package test_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class VerifyBirthday extends DriverWrapper {

    @Test
    public void verifyBirthday() throws InterruptedException {

        WebElement month = getDriver().findElement(By.id("month")); //storing locator into var 'month'
        Select monthDropdown = new Select(month);   //new obj of select class (calling in monthDropdown), passing in month
        //monthDropdown.selectByVisibleText("Jan");   //select the element with text "Jan"
        //Thread.sleep(3000);
        //monthDropdown.selectByIndex(4);  //select 4th element in dropdown
        //monthDropdown.selectByValue("3"); //select element with a value of "3"

        List<WebElement> monthOptions = monthDropdown.getOptions(); //gives you a list of all elements in month dropdown list

        boolean isFound = false;
        for (WebElement monthOption : monthOptions) {
            if (monthOption.getText().equals("Mar")) {
                isFound = true;
                break;
            }
        }

        Assert.assertTrue(isFound, "ERROR: value is not found");
    }
}

//use the 'Select' class to choose from a dropdown menu

//Scanner scan = new Scanner (); --> it will ask for something inside the constructor
                        //(System.in) --> what goes inside the constructor arg

//extend only your base objects
