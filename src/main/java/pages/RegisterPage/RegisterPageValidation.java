package pages.RegisterPage;

import context.TestContext;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.LoginPage.LoginPage;

public class RegisterPageValidation extends RegisterPage {
    public RegisterPageValidation(TestContext testContext) {
        super(testContext);
    }

    public boolean isOnPage() {
        return getWait().until(ExpectedConditions.visibilityOf(buttonRegister)).isDisplayed();
    }
    public boolean isModalVerificationChannelShow(){
        return getWait().until(ExpectedConditions.visibilityOf(modalVerificationChannel)).isDisplayed();
    }
}
