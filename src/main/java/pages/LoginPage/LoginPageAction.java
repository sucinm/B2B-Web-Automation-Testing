package pages.LoginPage;

import context.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.HomePage.HomePage;

public class LoginPageAction extends LoginPage {
    public LoginPageAction(TestContext testContext) {
        super(testContext);
    }

    public void clickButtonLogin(){
        getWait().until(ExpectedConditions.elementToBeClickable(buttonLogin)).click();
    }

    public void clickLinkRedirectToResetPasswordPage(){
        getWait().until(ExpectedConditions.elementToBeClickable(linkRedirectToResetPasswordPage)).click();
    }

    public void clickLinkRedirectToRegisterPage(){

        getWait().until(ExpectedConditions.elementToBeClickable(linkRedirectToRegisterPage)).click();
    }

    public void setInputUserName(String userName){
        inputUserName.sendKeys(userName);
    }

    public void setInputPassword(String password){
        inputPassword.sendKeys(password);
    }
}
