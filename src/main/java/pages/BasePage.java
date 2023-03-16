package pages;

import context.TestContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public final WebDriverWait wait;
    public final WebDriver driver;

    public BasePage(TestContext context) {
        wait = context.driverWait;
        driver = context.driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }
}