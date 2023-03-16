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
import java.util.concurrent.TimeUnit;

public class CucumberHooks {
    public WebDriver driver;
    private final TestContext context;

    public CucumberHooks(TestContext context) {
        this.context = context;
    }


    @Before
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
//        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        driver.navigate().to("https://www.ralali.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.MILLISECONDS);

        context.driver = driver;
        context.driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @After
    public void closeBrowser(){
        context.driver.quit();
    }
}
