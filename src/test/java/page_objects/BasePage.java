package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import test_scripts.DriverWrapper;

import java.sql.Driver;
import java.util.*;

//all generic actions available to all page objects should live here on 'base page'
//wraps all of your common actions (click (clickOn()), input text (setValue()) and get text (getValueFrom()) into their own methods
//use those methods in your individual page-tests (page objects) -
//we can access them bc they are public methods and available to every file in the project

//since we are using these actions over and over again in our test-scripts, it doesn't make sense to hardcode in values of locator
//instead, we pass in 'locator' variable so that
public class BasePage {

    public void clickOn(By locator) {

        DriverWrapper.getDriver().findElement(locator).click();
    }

    public void setValue(By locator, String value) {

        DriverWrapper.getDriver().findElement(locator).sendKeys(value);
    }

    public String getValueFromElement(By locator) {

        return DriverWrapper.getDriver().findElement(locator).getText();
    }

    public boolean isElementDisplayed(By locator){
       boolean isDisplayed;     //declare isDisplayed var as boolean
        try {
           isDisplayed = DriverWrapper.getDriver().findElement(locator).isDisplayed();      //reassign val of isDisplayed var to see if element in question (locator) is displayed
       } catch (NoSuchElementException e){
           isDisplayed = false;
       }
        return isDisplayed;
    }

    public Map<String,Integer> isDropdownHasDuplicates(By locator) {
        WebElement dropDownElement = DriverWrapper.getDriver().findElement(locator);  //grab dropdown element via locator
        Select dropDown = new Select(dropDownElement);  //create new var dropDown, which is an obj of the 'select class
        List<WebElement> allOptionsElements = dropDown.getOptions();    //create new list 'allOptionsElements', which contains all of the dropDown options

        List<String> allValues = new ArrayList<>();         //create new list 'allValues' (is empty)
        for (WebElement option : allOptionsElements) {      //loop through the 'allOptionsElements' list
            allValues.add(option.getText());                //add the text of those dropDown options to the 'allValues' list
        }

        Map<String, Integer> duplicates = new HashMap<>();  //create new HashMap 'duplicates', will map a String and Integer
        for (int i=0 ; i < allValues.size()-1 ; i++) {      //loop through the 'allValues' list (now filled w text options)
            int count=1;                                    //create a count starting at 1
            String val = allValues.get(i);                  //isolate 'i' during the loop (stored into variable 'val')
            if (!duplicates.containsKey(val)) {             //if the duplicates list does NOT contain i (the text of the dropdown option)
                                                            // - this will be the case from the first iteration (Since duplicate list is empty at the beginning)
                                                            //if Jan is first element, and has already been checked (and there are dupes of Jan), it will not run again b/c Jan already appears in the duplicates list (will not meet if condition after first iteration)
                for (int j = i + 1; j <= allValues.size() - 1; j++) {   //create nested loop, loop through the 'allValues' list again
                    if (val.equalsIgnoreCase(allValues.get(j))) {       //if the val (i, the current dropdown element appears again int he allValues list (i is the same as j)
                        count++;                            //increase the count by one,
                    }
                }
                if (count > 1) {                            //if the count (of the val) is greater than one
                    duplicates.put(val, count);             //put both the val (dropdown element) and the count (times it appears in allValues list) into the 'duplicates' list
                }
            }
        }
        return duplicates;                                  //return the full duplicates list after the entire loop has run
    }
}
//try/catch tries to catch an exception
//an exception is something that is overlooked
    //checked exception - a type of exception that can be checked by the editor itself
    //unchecked exception -

//throwing an exception -
//the thing you are trying to do / achieve - goes into the try block.  if everything is fine, it will never reach the catch block
//if there is a problem in the try block, it will move to the catch block
//so if there is any exception expected, we will pass it into the arg in the catch block
//catch (NoSuchElementExists e) {
// isDisplayed = false;
// e/printStackTrace();

// = if the NoSuchElementException occurs, then run whatever is in the catch block
//set isDisplayed to false
//find the stack trace of the error


// double slash (//) is the relative x-path --> double slash looks throughout the whole DOM.  looks for the element throughout the entire DOM

//single slash (/) is the absolute xpath --> single slash looks item by item.  only looks for the next item (the next ele available)

//CUSTOM X-PATH
    //difference between ancestor and preceding
    //

//custom x-path example:
    //*[@id='reg']//descendant::input
    //input[@name='reg_email__']/parent
    //div[@class='mbm_1iy float_ohf']//preceding-sibling
                                     //following-sibling


    //select all of

//substring method --> from the chosen index to the end ("hello".substring(1) --> "ello"

//slack out hw solution + autocomplete example (san diego / hotels.com)

//bdd - behavior-driven development
    //bdd approach used by test-engineers; works best for test engineers / automation engineers
    //write the test requirements as 'user stories' --> in bdd steps
//cucumber is similar to selenium -- it is a library that allows you to integrate your test framework into BBD framework
//it is a test-management tool
//this is the standard for UI end to end testing (cucumber / jasmine)
//cucumber = a library that implements bbd framework into your tests
//testNG still needed to run assertions, but cucumber handles a lot of everything else
//gherkin supports for cucumber = contains the keywords for cucumber ("given", etc)
//allure supports for cucumber = presents your tests in a clean, html format; the cheapest and most-common
// .feature are our cucumber files


//main purpose of feature file is used to store your test cases that need to be automated
//a feature file = a repository for all tests that are related to that specific function (login / payment / etc);
//use gherkin keywords to organize the steps in a clearer way and is used to control our tests

//RegEx = a sequence of characters that you would like your string to be

//feature files map to your SD file via RegEx ("I am on home page")


//config + config reader
    //java file reads from the property file (the config.properties file)
    //config-reader reads file from the config.properties file (?)


//test runner
    //test runner file is where you run your tests from (were the test tages are defined)
    // glue code looks for your step-definition file, you just give the path name to it

//in terminal
//mvn clean test
