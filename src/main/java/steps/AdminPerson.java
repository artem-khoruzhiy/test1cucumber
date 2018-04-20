package steps;

import pages.HomePage;
import pages.LoginPage;

public class AdminPerson {

    public LoginPage atLoginPage(){
        return new LoginPage();
    }

    public HomePage atHomePage(){
        return new HomePage();
    }

    public void login(){
        atLoginPage().open();
        atLoginPage().fillForm("admin", "admin");
        atLoginPage().clickSignInButton();
    }
}