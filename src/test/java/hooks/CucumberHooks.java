package hooks;

import context.TestContext;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class CucumberHooks {
    public WebDriver driver;
    private final TestContext context;

    public CucumberHooks(TestContext context) {
        this.context = context;
    }


    @Before
    public void openBrowser(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*", "--no-sandbox", "--disable-dev-shm-usage", "--incognito", "--start-maximized", "window-size=1920,1080");
        options.setHeadless(true);
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver(options);
        driver.get("https://www.ralali.com/");
        context.driver = driver;
        context.driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @After
    public void closeBrowser(){
        context.driver.quit();
    }
}
