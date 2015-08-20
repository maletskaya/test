package page;

import core.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

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
    private WebElement addtoCompare13;
    private WebElement compareIconClick;
    private WebElement compareIcon;
    private WebElement appleRetina15;
    private WebElement addtoCompare15;
    private WebElement apple13inList;
    private WebElement apple15inList;


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
        sortButton.click();
        sortButtonClick = driver.findElement(By.xpath(".//*[@id='sort_view']/div/ul/li[2]/a"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        sortButtonClick.click();
    }

    public WebElement getAppleRetina13() {
        appleRetina13 = driver.findElement(By.xpath(".//a[contains(text(), 'Z0QP000X6')]"));
        return appleRetina13;

    }

    public WebElement getAppleRetina15() {
        appleRetina15 = driver.findElement(By.xpath(".//a[contains(text(), 'MGXA2UA/A')]"));
        return appleRetina15;
    }

    public void addToCompare13() {
        addtoCompare13 = driver.findElement(By.xpath(".//*[@id='block_with_goods']/div[1]/div[3]/div[1]/div/div/div/div[6]/ul/li[2]/div/label/span/img"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        addtoCompare13.click();
    }

    public void addToCompare15() {
        addtoCompare15 = driver.findElement(By.xpath(".//*[@id='block_with_goods']/div[1]/div[23]/div[1]/div/div/div/div[7]/div[2]/label/span/img"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        addtoCompare15.click();
    }

    public void getAppleRetinaInCompare() {
        Actions pointToComparison = new Actions(driver);
        compareIcon = driver.findElement(By.xpath(".//*[@id='comparison']/a"));
        pointToComparison.moveToElement(compareIcon).perform();
        compareIconClick = driver.findElement(By.xpath(".//*[@id='comparison-popup']/div/ul/li/a"));
        compareIconClick.click();
    }

    public WebElement listContainsAppl13() {
       apple13inList = driver.findElement(By.xpath(".//a[2][contains(text(), 'Z0QP000X6')]"));
        return apple13inList;
    }
    public WebElement listContainsApp15(){
        apple15inList = driver.findElement(By.xpath(".//a[2][contains(text(), 'MGXA2UA/A')]"));
        return apple15inList;

    }

}







