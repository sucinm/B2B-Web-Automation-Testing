package pages.RegisterPage;

import context.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

public class RegisterPage extends BasePage {

    @FindBy(xpath = "//div[.='BisnisBelanja untuk kebutuhan bisnis']")
    WebElement radioButtonBuyerBusiness;

    @FindBy(xpath = "//div[.='IndividuBelanja sebagai individu']")
    WebElement radioButtonBuyerIndividual;

    @FindBy(xpath = "//input[@id='fullname']")
    WebElement inputFullName;

    @FindBy(id = "username")
    WebElement inputEmailOrPhoneNumber;

    @FindBy(xpath = "//div[4]//input[@class='TextInput__Input-jfrtn4-5 cYBHub RegisterForm__StyledTextInput-sc-1ofjgrt-12 dfNdsJ']")
    WebElement inputPassword;

    @FindBy(xpath = "//div[5]//input[@class='TextInput__Input-jfrtn4-5 cYBHub RegisterForm__StyledTextInput-sc-1ofjgrt-12 dfNdsJ']")
    WebElement inputConfirmationPassword;

    @FindBy(xpath = "//button[@class='Button__StyledButton-sc-1l9x0nw-0 cTjxCF RegisterForm__ButtonNext-sc-1ofjgrt-10 gsIAKd']")
    WebElement buttonRegister;

    @FindBy(xpath = "//span[@class='RegisterForm__Checkbox-sc-1ofjgrt-5 mgNsT']/span[1]")
    WebElement checkBoxTermsAndCondition;

    @FindBy(xpath = "//div[@class='Flex__StyledFlex-sc-1gmkxa6-0 gMRDyd VerificationChannel__OtpChannelContainer-sc-1svsosm-0 jZFIsk']")
    WebElement modalVerificationChannel;

    public RegisterPage(TestContext context){
        super(context);
        PageFactory.initElements(context.driver, this);
    }
}
