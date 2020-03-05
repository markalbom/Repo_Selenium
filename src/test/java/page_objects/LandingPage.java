package page_objects;

import org.openqa.selenium.By;

public class LandingPage extends BasePage {

    //Locators -- pointing to / grabbing all of the web elements that you may need access to that can be found on the landing page
        //locators for VerifyInvalidLogin test
        private By emailTextField = By.id("email");
        private By passTextField = By.id("pass");
        private By loginButton = By.id("loginbutton");

        //locators for VerifySignUp test
        private By firstName = By.name("firstname");
        private By lastName = By.name("lastname");
        private By signUpPhoneOrEmail = By.name("reg_email__");
        private By signUpPassword = By.name("reg_passwd__");
        private By signUpGender = By.xpath("//input[@id='u_0_6']");
        private By signUpButton = By.name("websubmit");
        private By genderError = By.xpath("//div[starts-with(text(), 'Please choose a gender')]");

        //locators for VerifyMessenger test
        private By messengerLink = By.xpath("//a[contains(text(),'Messenger')]");

        //locators for VerifyAboutPageLogin test
        private By aboutPageLink = By.xpath("//a[@href = '/facebook']");

        //locators for VerifyAmazonPrice test
        private By amazonSearchForProduct = By.id("twotabsearchtextbox");
        private By amazonSearchButton = By.xpath("//div[text()= 'Go']");

        //locators for YouTube test
        private By youTubeTrendingButton = By.linkText("Trending");



    //Methods -- the methods that use the field var web elements / locators --
    // (these methods will then be used in their specific test scripts) - their own class files
    public void enterEmail(String value){

        setValue(emailTextField, value);
    }

    public void enterPassword(String value) {

        setValue(passTextField, value);
    }

    public void clickLoginButton() {

        clickOn(loginButton);
    }

    public void enterFirstName(String value){

        setValue(firstName, value);
    }

    public void enterLastName(String value){

        setValue(lastName, value);
    }

    public void enterSignUpPhoneEmail (String value){

        setValue(signUpPhoneOrEmail, value);
    }

    public void enterSignUpPassword (String value){

        setValue(signUpPassword, value);
    }

    public void enterSignUpGender(){

        clickOn(signUpGender);
    }

    public void signUp(){

        clickOn(signUpButton);
    }

    public void clickMessenger(){

        clickOn(messengerLink);
    }

    public boolean isLoginButtonDisplayed(){

        return isElementDisplayed(loginButton);
    }

    public String getGenderErrorMessage(){

        return getValueFromElement(genderError);
    }

    public void clickAboutPageLink(){
        clickOn(aboutPageLink);
    }

    public void enterAmazonProductForSearch(String value){
        setValue(amazonSearchForProduct, value);
    }

    public void clickAmazonSearch(){
        clickOn(amazonSearchButton);
    }

    public void clickYouTubeTrendingButton(){clickOn(youTubeTrendingButton);}



}
