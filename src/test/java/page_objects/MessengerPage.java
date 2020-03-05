package page_objects;

import org.openqa.selenium.By;

public class MessengerPage extends BasePage {

    //locators
    By messengerLoginButton = By.id("loginbutton");
    By messengerError = By.xpath("//div[contains(text(),'The email or phone number you')]");

    //methods
    public void messengerSignIn (){

        clickOn(messengerLoginButton);
    }

    public String messengerLoginError(){

        return getValueFromElement(messengerError);
    }
}
