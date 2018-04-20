package behavior.login;

import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.By;
import pages.LoginPage;

import static junit.framework.Assert.assertTrue;

public class LoginAssert extends LoginPage {

    public void checkThatHomePageOpened() {
        assertTrue($(By.linkText("Sign Out")).isDisplayed());
    }

    public void checkThatPageOpened() {
        assertTrue($(By.name("signIn")).isDisplayed());
    }
}
