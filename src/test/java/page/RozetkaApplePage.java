package page;

import core.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

/**
 * Created by yanamiletskaya on 19.08.15.
 */
public class RozetkaApplePage extends TestBase {
    private WebElement buttonApple;
    private WebElement sortButton;
    private WebElement sortButtonClick;
    private WebElement appleRetina13;


    public RozetkaApplePage(WebDriver driver) {
        this.driver = driver;
    }

    public void apple() {
        buttonApple = driver.findElement(By.xpath(".//*[.='Apple']"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        buttonApple.click();
    }

    public void applePageIs() {
        assertTrue(driver.getCurrentUrl().contains("http://rozetka.com.ua/notebooks/apple"));
    }

    public void fromChipToExpClick() {
        sortButton = driver.findElement(By.xpath(".//*[@id='sort_view']/a"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        sortButtonClick = driver.findElement(By.xpath(".//*[@id='sort_view']/div/ul/li[1]/a"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        sortButtonClick.click();
    }

    public void appleRetina13Select() {
        //appleRetina13 = driver.findElement(By.xpath(".//*[@id='block_with_goods']/div[1]/div"));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='catalog-comparison']/div/ul/li[2]/a[2]")));
        appleRetina13 = driver.findElement(By.xpath(".//*[id@='block_with_goods']/div[1]/div[8]/div[1]/div/div/div/div[6]/ul/li[2]/div/span/span"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // assertTrue(appleRetina13.getText().contains("Apple MacBook"));
        appleRetina13.click();


    }

}



