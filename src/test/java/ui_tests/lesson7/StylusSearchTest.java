package ui_tests.lesson7;

import core.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import page.StylusSearchPage;
import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

/**
 * Created by yana maletskaya on 02.08.15.
 */
public class StylusSearchTest extends TestBase {

    private String stylusWebSite = "http://stylus.com.ua";
    private String filterFrom ="20000";
    private String filterTo ="30000";
    private WebElement  finaltext;


    @Test

    public void seleniumSearchTest() {
        StylusSearchPage onStylusSearchPage = new StylusSearchPage(driver);
        onStylusSearchPage.open(stylusWebSite);
        assertEquals(driver.getCurrentUrl(), stylusWebSite, "http://stylus.com.ua");
        onStylusSearchPage.openAppStore();
        onStylusSearchPage.openEmptySpace();
        onStylusSearchPage.openIphone();
        onStylusSearchPage.openIphone6();
        onStylusSearchPage.setFilterFromfield(filterFrom);
        onStylusSearchPage.setFilterTofield(filterTo);
        onStylusSearchPage.clickButtonOK();
        finaltext = driver.findElement(By.xpath("//*[@id='product-block']/header/div[1]/h1"));
        assertTrue(finaltext.getText().contains("Apple iPhone 6 128GB Space Gray"), "Apple is not found" );
    }

}
