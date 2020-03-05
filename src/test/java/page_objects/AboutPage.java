package page_objects;

import org.openqa.selenium.By;

public class AboutPage extends BasePage {
    //locators for AboutPage
    //By createPageButton = By.xpath("//a[starts-with(text(), 'Create a Page')]");
    By createPageButton = By.xpath("//button[text()='Create a Page']");
    By AboutPgLoginPrompt = By.xpath("//div[starts-with(text(),'Log In to continue')]");


    //methods for AboutPage
    public void aboutPageCreatePage() {
        clickOn(createPageButton);
    }

    public String aboutPageLoginPromptMsg (){
        return getValueFromElement(AboutPgLoginPrompt);
    }
}
