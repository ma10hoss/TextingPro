package CoreClasses;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected static WebDriver driver;

    @BeforeTest
    public void openBrowser() {

        PropertyConfigurator.configure("log4j.properties");

        System.setProperty("webdriver.gecko.driver","/Users/armanhossain/IdeaProjects/geckodriver");

        driver = new FirefoxDriver();

        driver.manage().window().fullscreen();

        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        OpenWebsiteURL();

    }
    public void OpenWebsiteURL(){
        //driver.get("https://test.textingpro.com/");
        driver.get("http://www.way2automation.com/");
    }

    @AfterTest
    public void CloseBrowser(){

        driver.quit();
    }
}
