package behavior.login;

import behavior.BaseBehavior;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginBehavior extends BaseBehavior {
    private LoginAssert loginAssert = new LoginAssert();

    @Given("^Admin wants to login$")
    public void adminWantsToLogin(){
        adminPerson.atLoginPage().open();
    }

    @When("^Admin login to system with username (.*) and password (.*)$")
    public void adminLoginToSystem(String username, String password){
        adminPerson.atLoginPage().fillForm(username,password);
        adminPerson.atLoginPage().clickSignInButton();
    }

    @Then("^Admin should see home page$")
    public void adminShouldSeeHomePage(){
        loginAssert.checkThatHomePageOpened();
    }

    @Then("^Admin should see login page$")
    public void adminShouldSeeLoginPage(){
        loginAssert.checkThatPageOpened();
    }
}
