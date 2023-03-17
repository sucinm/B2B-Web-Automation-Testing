package pages.HomePage;

import context.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

public class HomePage extends BasePage {
    @FindBy(xpath = "//button[@class='Button__StyledButton-sc-1l9x0nw-0 bkqqJb']")
    WebElement buttonVisitMarketplace;

    @FindBy(xpath = "//button[@class='Button__StyledButton-sc-1l9x0nw-0 kCAJGO']")
    WebElement buttonSignInOrSignUp;

    public HomePage(TestContext context){
        super(context);
        PageFactory.initElements(context.driver, this);
    }

}
