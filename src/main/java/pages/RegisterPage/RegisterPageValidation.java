package pages.RegisterPage;

import context.TestContext;
import org.openqa.selenium.support.ui.ExpectedConditions;

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
