package page;

import core.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


/**
 * Created by yanamiletskaya on 19.08.15.
 */
public class RozetkaManufactures extends TestBase {

    //  private WebDriver driver;


    public RozetkaManufactures(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> listOfManufactures() {
        List<WebElement> listOfManufactures = driver.findElements(By.xpath(".//*[@name='menu_categories_left']/li[2]/ul/li"));
       // assertEquals(equals(manufactures.size()));
        return listOfManufactures;
    }

}
