package pages.HomePage;

import context.TestContext;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePageAction extends HomePage {
    public HomePageAction(TestContext testContext) {
        super(testContext);
    }

    public void clickButtonVisitMarketplace(){
        getWait().until(ExpectedConditions.elementToBeClickable(buttonVisitMarketplace)).click();
    }

    public void clickButtonSignInOrSignUp(){
        getWait().until(ExpectedConditions.elementToBeClickable(buttonSignInOrSignUp)).click();
    }
}
