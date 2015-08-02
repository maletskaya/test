package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

// все для драйверу все для тесту

/**
 * Created by yanamiletskaya on 29.07.15.
 */
public class TestBase {

    protected WebDriver driver;
    protected WebDriverWait webDriverWait;

    @BeforeSuite

    public void setUp() {
        driver = new FirefoxDriver();
        webDriverWait = new WebDriverWait(driver, 10);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }
}


