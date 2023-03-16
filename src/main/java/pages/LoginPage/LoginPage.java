package pages.LoginPage;

import context.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

public class LoginPage extends BasePage {
    @FindBy(xpath = "//button[@class='Button__StyledButton-sc-1l9x0nw-0 cTjxCF LoginForm__StyledButton-sc-1xs7wb9-13 cVoEji']")
    WebElement buttonLogin;

    @FindBy(xpath = "//a[@href='/signup']")
    WebElement linkRedirectToRegisterPage;

    @FindBy(xpath = "//a[.='Lupa kata sandi?']")
    WebElement linkRedirectToResetPasswordPage;

    @FindBy(xpath = "//input[@id='username']")
    WebElement inputUserName;

    @FindBy(xpath = "//div[@class='LoginForm__BodySection-sc-1xs7wb9-8 ixsbwY']/div[2]//input[@class='TextInput__Input-jfrtn4-5 cYBHub LoginForm__StyledTextInput-sc-1xs7wb9-12 nydCr']")
    WebElement inputPassword;

    @FindBy(css = ".Header__ProfileName-ecyz7w-7")
    WebElement profileName;

    public LoginPage(TestContext context){
        super(context);
        PageFactory.initElements(context.driver, this);
    }
}
