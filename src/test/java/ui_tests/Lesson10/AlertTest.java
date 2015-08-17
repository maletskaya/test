package ui_tests.Lesson10;

import core.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

/**
 * Created by yanamiletskaya on 16.08.15.
 */
public class AlertTest extends TestBase {

    private String url = "http://www.quackit.com/javascript/codes/javascript_prompt.cfm";

    @Test

    public void AlertTest1() {
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        WebElement iFrame = driver.findElement(By.xpath("html/body/div[1]/div/article/div[2]/div[2]/div[2]/iFrame"));
        driver.switchTo().frame(iFrame);
        WebElement clickButton = driver.findElement(By.xpath("html/body/input"));
        clickButton.click();
        Alert alert = driver.switchTo().alert();

        if (alert.getText().equals("Quackit.com")){
            alert.accept();
            assertTrue(true);
        } else fail("No, this is not you want");
    }

}
