package pages.RegisterPage;

import context.TestContext;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegisterPageAction extends RegisterPage {
    public RegisterPageAction(TestContext testContext) {
        super(testContext);
    }

    public void clickRadioButtonBuyerBusiness(){
        getWait().until(ExpectedConditions.elementToBeClickable(radioButtonBuyerBusiness)).click();
    }

    public void clickRadioButtonBuyerIndividual(){
        getWait().until(ExpectedConditions.elementToBeClickable(radioButtonBuyerIndividual)).click();
    }

    public void setInputFullName(String fullName){
        inputFullName.sendKeys(fullName);
    }

    public void setInputEmailOrPhoneNumber(String emailOrPhoneNumber){
        inputEmailOrPhoneNumber.sendKeys(emailOrPhoneNumber);
    }

    public void setInputPassword(String password){
        inputPassword.sendKeys(password);
    }

    public void setInputConfirmationPassword(String password){
        inputConfirmationPassword.sendKeys(password);
    }

    public void clickButtonRegister(){
        getWait().until(ExpectedConditions.elementToBeClickable(buttonRegister)).click();
    }

    public void clickCheckBoxTermsAndCondition(){
        getWait().until(ExpectedConditions.elementToBeClickable(checkBoxTermsAndCondition)).click();
    }
}
