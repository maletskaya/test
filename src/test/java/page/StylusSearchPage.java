package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

/**
 * Created by yanamaletskaya on 02.08.15.
 */
public class StylusSearchPage {
    private WebElement searchAppStore;
    private WebElement searchLinkIphone;
    private WebElement searchLinkIphone6;
    private WebDriver driver;
    private WebElement emptySpace;
    private WebElement filterFromfield;
    private WebElement filterTofield;
    private WebElement buttonOK;

    public StylusSearchPage(WebDriver driver) {

        this.driver = driver;
    }

    public void open(String URL) {

        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    public void openAppStore() {
        emptySpace = driver.findElement(By.cssSelector("#wrapper"));
        emptySpace.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void openEmptySpace() {
        searchAppStore = driver.findElement(By.cssSelector("#nav>li>a"));
        searchAppStore.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    public void openIphone() {
        searchLinkIphone = driver.findElement(By.xpath(".//*[@id='nav']/li[1]/a/span"));
        searchLinkIphone.click();
    }

    public void openIphone6() {
        searchLinkIphone6 = driver.findElement(By.xpath(".//*[@id='tab-1-25']/ul/li[6]/div/a/span"));
        searchLinkIphone6.click();

    }

    public void setFilterFromfield(String filterFrom) {
        filterFromfield = driver.findElement(By.cssSelector("#min"));
        filterFromfield.sendKeys(Keys.COMMAND+"a");
        filterFromfield.sendKeys(filterFrom);

    }

    public void setFilterTofield(String filterTo) {
        filterTofield = driver.findElement(By.cssSelector("#max"));
        filterTofield.sendKeys(Keys.COMMAND+"a");
        filterTofield.sendKeys(filterTo);
    }
    public void clickButtonOK(){
        buttonOK = driver.findElement(By.cssSelector(".layout>input"));
        buttonOK.click();
    }
}
