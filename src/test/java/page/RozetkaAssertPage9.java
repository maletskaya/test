package page;

import core.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by yanamiletskaya on 17.08.15.
 */
public class RozetkaAssertPage9 extends TestBase {
    private WebDriver driver;
    private WebElement buttonClick9;

    public RozetkaAssertPage9(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getlistOf9() {

        List<WebElement> lisOf9laptops = driver.findElements(By.cssSelector(".content"));
        return lisOf9laptops;
    }

    public void buttonClick1() {
        buttonClick9 = driver.findElement(By.xpath(".//*[@id='head_banner_container']/div/div[2]/div[2]/div/div[1]/div[1]/ul[2]/li[2]/ul/li[2]/a"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        buttonClick9.click();
    }

    public void lowToHigh() {
        WebElement sortList = driver.findElement(By.xpath(".//*[@id='sort_view']/a"));
        sortList.click();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='sort_view']/div//ul/li[2]/a")));
        WebElement descendingSort = driver.findElement(By.xpath(".//*[@id='sort_view']/div//ul/li[2]/a"));
        descendingSort.click();
    }
}


