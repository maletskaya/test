package page;

import core.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by yanamiletskaya on 16.08.15.
 */
public class RozetkaLaptops extends TestBase{
    private WebElement laptopsTabs;
    private WebElement buttonClick;

    public RozetkaLaptops(WebDriver driver){
        this.driver=driver;

    }

    public void clickLaptops() {
        laptopsTabs = driver.findElement(By.xpath(".//*[@id='m-main']/li[1]/a"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        laptopsTabs.click();

    }
    public List<WebElement> getNotebooksComputersList() {
        List<WebElement> notebooksComputerslist = driver.findElements(By.xpath(".//*[@class='m-cat-l']/li[1]/ul/li"));
        return notebooksComputerslist;
    }

    public void buttonClick() {
        buttonClick = driver.findElement(By.xpath(".//*[.='Все ноутбуки']/.."));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        buttonClick.click();
    }

}
