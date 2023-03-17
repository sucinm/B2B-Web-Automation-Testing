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

public class RegisterSteps {

    private final HomePageAction homePageAction;
    private final LoginPageAction loginPageAction;
    private final LoginPageValidation loginPageValidation;
    private final RegisterPageAction registerPageAction;
    private final RegisterPageValidation registerPageValidation;

    public RegisterSteps(TestContext context) {
        this.homePageAction = new HomePageAction(context);
        this.registerPageAction = new RegisterPageAction(context);
        this.registerPageValidation = new RegisterPageValidation(context);
        this.loginPageAction = new LoginPageAction(context);
        this.loginPageValidation = new LoginPageValidation(context);
    }
    @Given("User already in register page")
    public void userAlreadyInRegisterPage() {
        homePageAction.clickButtonVisitMarketplace();
        homePageAction.clickButtonSignInOrSignUp();
        loginPageAction.clickLinkRedirectToRegisterPage();
        registerPageValidation.isOnPage();
    }

    @And("User fill all the required fields")
    public void userFillAllTheRequiredFields() {
        registerPageAction.clickRadioButtonBuyerIndividual();
        registerPageAction.setInputFullName("Suci Nascaisar Maharani");
        registerPageAction.setInputEmailOrPhoneNumber("sucinascaisar@gmail.com");
        registerPageAction.setInputPassword("Suci!xx1");
        registerPageAction.setInputConfirmationPassword("Suci!xx1");
        registerPageAction.clickCheckBoxTermsAndCondition();
    }

    @When("User click register")
    public void userClickRegister() {
        registerPageAction.clickButtonRegister();
    }

    @Then("Modal verification email is appear")
    public void modalVerificationEmailIsAppear() {
        Assert.assertTrue(registerPageValidation.isModalVerificationChannelShow());
    }
}
