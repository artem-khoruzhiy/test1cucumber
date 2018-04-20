package pages;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class LoginPage extends BasePage {

    public void open(){
        Selenide.open("http://cells.org.ua/scrum-selenium/index.php?signIn=1");
    }

    public void fillForm(String username, String password){
        $(By.name("username")).setValue(username);
        $(By.name("password")).setValue(password);
    }

    public void clickSignInButton(){
        $(By.name("signIn")).click();
    }
}
