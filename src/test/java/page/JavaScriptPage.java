package page;

import core.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

/**
 * Created by yanamiletskaya on 10.08.15.
 */
public class JavaScriptPage extends TestBase {

    private WebElement searchField;

    public JavaScriptPage(WebDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void open(String url) {
        driver.get(url);

    }

    public void openJavaScript() {
        searchField = driver.findElement(By.cssSelector("#nav>li>a"));
        searchField.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
