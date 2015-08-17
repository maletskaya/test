package ui_tests.Lesson10;

import core.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * Created by yanamiletskaya on 16.08.15.
 */
public class Test3 extends TestBase{

    private String url = "http://www.quackit.com/html/codes/html_popup_window_code.cfm";
    @Test
    public void Test_3(){
        driver.get(url);
        WebElement openNewWindow = driver.findElement(By.xpath("html/body/div[1]/div/article/div[2]/div[2]/div[2]/div/h4/a"));
        openNewWindow.click();
        String firstWindow = driver.getWindowHandle();
        driver.switchTo().window("popUpWindow");
        assertTrue(driver.getTitle().contains("Popup Example"));
        driver.switchTo().window(firstWindow);
        assertTrue(driver.getTitle().contains("HTML"));
    }
}
