package AssetPageLaptop;

import core.TestBase;
import org.openqa.selenium.WebDriver;
import page.RozetkaAssertPage9;

import static org.testng.Assert.assertNotEquals;

/**
 * Created by yanamiletskaya on 17.08.15.
 */
public class AssertListOf9 extends TestBase {
    public AssertListOf9(WebDriver driver) {
        this.driver = driver;
    }

    public void assertManufacturesDisplayed(RozetkaAssertPage9 manufacturesList) {

            assertNotEquals(manufacturesList.getlistOf9().size()-1,9);
        }
    }


