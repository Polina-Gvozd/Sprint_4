package java1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.rules.ExternalResource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverRule extends ExternalResource {
    private WebDriver driver;

    public WebDriver getDriver(){
        return driver;
    }
     public void initDriver(){
        if ("firefox".equals(System.getProperty("browser"))){
            startFirefox();
        } else {
            startChrome();
        }
     }

    private void startChrome(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(EnvConfig.EXPLICITLY_WAIT));
    }

    private void startFirefox(){
         WebDriverManager.firefoxdriver().setup();
         driver = new FirefoxDriver();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(EnvConfig.EXPLICITLY_WAIT));
     }

    @Override
    protected void before() throws Throwable {
        initDriver();
    }

    @Override
    protected void after() {
        driver.quit();
    }
}
