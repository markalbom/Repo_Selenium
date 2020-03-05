package test_scripts;

import org.testng.annotations.Test;
import page_objects.BasePage;
import page_objects.LandingPage;

import java.util.ArrayList;
import java.util.List;

public class VerifyInvalidPassword extends DriverWrapper {
    @Test

    public void verifyInvalidPW () {
        LandingPage landingPage = new LandingPage();
        landingPage.enterFirstName("john");
        landingPage.enterLastName("doe");
        landingPage.enterSignUpPhoneEmail("jd@abc.com");

        ArrayList <String> invalidEmail = new ArrayList<>();
        invalidEmail.add("plainaddress");
        invalidEmail.add("#@%^%#$@#$@#.com");
        invalidEmail.add("@example.com");
        invalidEmail.add("Joe Smith <email@example.com>");
        invalidEmail.add("email.example.com");
        invalidEmail.add(" email@example@example.com");
        invalidEmail.add(".email@example.com");
        invalidEmail.add("email.@example.com");
        invalidEmail.add("email..email@example.com");
        invalidEmail.add("あいうえお@example.com");
        invalidEmail.add("email@example.com (Joe Smith)");
        invalidEmail.add("email@example");
        invalidEmail.add("email@-example.com");
        invalidEmail.add("email@example.web");
        invalidEmail.add("email@111.222.333.44444");
        invalidEmail.add("email@example..com");


//        for (String password: invalidEmail){
//            if (landingPage.enterSignUpPhoneEmail("jd@abc.com").equals(password)){
//                System.out.println("invalid email entered.  Please choose another");
//            }
//        }

    }
}
