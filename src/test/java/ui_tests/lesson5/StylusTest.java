package ui_tests.lesson5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

/**
 * Created by yanamaletskaya on 30.07.15.
 */
public class StylusTest {

    private FirefoxDriver driver;
    private WebElement searchField;
    private String searchText = "Sony Z2";
    private WebElement searchButton;
    private WebElement searchLink;


    @BeforeTest
    public void setUp(){

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://stylus.com.ua");

    }

    @Test
    public void seleniumSearchTest(){

        searchField = driver.findElement(By.xpath(".//*[@id='header']/div[2]/div[2]/form/input[1]"));
        searchField.sendKeys(searchText);
        searchField.submit();
        searchButton = driver.findElement(By.xpath(".//*[@id='header']/div[2]/div[2]/form/input[2]"));
        searchButton.click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        searchLink = driver.findElement(By.xpath(".//*[@id='search-list']/ul/li[3]/a/span"));

        assertTrue(searchButton.getText().contains("Sony"));

    }

    @AfterTest
    public void tearDown(){

        driver.quit();
    }

}
