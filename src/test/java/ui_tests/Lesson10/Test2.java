package ui_tests.Lesson10;

import core.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * Created by yanamiletskaya on 16.08.15.
 */
public class Test2 extends TestBase{

    @Test

    public void Test2(){
        driver.get("http://www.quackit.com/html/templates/frames/frames_example_1.html");

   driver.switchTo().frame(0);
        WebElement whitePage = driver.findElement(By.xpath("html/body/p/a"));
        assertTrue(whitePage.getText().contains("White Page"), " fail name WhiteBox");
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        WebElement contentName = driver.findElement(By.xpath("html/body/h1"));
        assertTrue(contentName.getText().contains("Content"));
    }

}
