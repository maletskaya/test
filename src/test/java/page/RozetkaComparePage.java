package page;

import core.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by yanamiletskaya on 20.08.15.
 */
public class RozetkaComparePage extends TestBase {
    private WebElement compareLaptops;
    private WebElement pageContains;
    private WebElement pageContains2;


    public RozetkaComparePage(WebDriver driver){
        this.driver=driver;

    }
    public WebElement pageContainsCompare() {
        compareLaptops = driver.findElement(By.xpath(".//*[contains(text(), 'Сравниваем')]"));
        return compareLaptops;
    }

    public WebElement pageContainsLaptops() {
        pageContains = driver.findElement(By.xpath(".//*[1][contains(text(), 'Z0QP000X6')]"));
       return pageContains;
    }

    public WebElement pageContainsLaptops2() {
        pageContains2 = driver.findElement(By.xpath(".//*[contains(text(), 'MGXA2UA/A')]"));
        return pageContains2;
    }
}

