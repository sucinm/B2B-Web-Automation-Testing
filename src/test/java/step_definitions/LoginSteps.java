package step_definitions;

import context.TestContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.HomePage.HomePageAction;
import pages.LoginPage.LoginPageAction;
import pages.LoginPage.LoginPageValidation;
import pages.RegisterPage.RegisterPageAction;
import pages.RegisterPage.RegisterPageValidation;

public class LoginSteps {
    private final HomePageAction homePageAction;
    private final LoginPageAction loginPageAction;
    private final LoginPageValidation loginPageValidation;
    private final RegisterPageAction registerPageAction;
    private final RegisterPageValidation registerPageValidation;


    public LoginSteps(TestContext context) {
        this.homePageAction = new HomePageAction(context);
        this.registerPageAction = new RegisterPageAction(context);
        this.registerPageValidation = new RegisterPageValidation(context);
        this.loginPageAction = new LoginPageAction(context);
        this.loginPageValidation = new LoginPageValidation(context);
    }

    @Given("User already in login page")
    public void userAlreadyInLoginPage() {
        homePageAction.clickButtonVisitMarketplace();
        homePageAction.clickButtonSignInOrSignUp();
        loginPageValidation.isOnPage();
    }

    @When("User input valid email and as password")
    public void userInputAsEmailAndInputAsPassword() {
        loginPageAction.setInputUserName("adjustmanual123@gmail.com");
        loginPageAction.setInputPassword("adjustmanual123");
    }

    @And("User clicked login button")
    public void userClickedLoginButton() {
        loginPageAction.clickButtonLogin();
    }

    @Then("User will see homepage")
    public void userWillSeeHomepage() {
        Assert.assertTrue(loginPageValidation.isProfileNameDisplay());
    }
}
