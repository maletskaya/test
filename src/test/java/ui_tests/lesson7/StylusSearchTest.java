package ui_tests.lesson7;

import core.TestBase;
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
       // assertTrue(clickButtonOK.getText().contains("Apple iPhone 6 128GB Space Gray")); ?????
    }

}
