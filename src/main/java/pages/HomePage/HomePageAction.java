package pages.HomePage;

import context.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class HomePageAction extends HomePage {
    public HomePageAction(TestContext testContext) {
        super(testContext);
    }

    public void clickButtonKunjungiMarketplace(){
        getWait().until(ExpectedConditions.elementToBeClickable(buttonKunjungiMarketplace)).click();
    }

    public void clickButtonMasukAtauDaftar(){
        getWait().until(ExpectedConditions.elementToBeClickable(buttonMasukAtauDaftar)).click();
    }
}
