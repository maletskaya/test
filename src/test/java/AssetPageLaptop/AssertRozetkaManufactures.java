package AssetPageLaptop;

import core.TestBase;
import org.openqa.selenium.WebDriver;
import page.RozetkaManufactures;

import static org.testng.Assert.assertEquals;

/**
 * Created by yanamiletskaya on 19.08.15.
 */
public class AssertRozetkaManufactures extends TestBase {
    public AssertRozetkaManufactures(WebDriver driver) {
        this.driver = driver;
    }

    public void assetManufactures(RozetkaManufactures listOf9){
        assertEquals(listOf9.listOfManufactures().size()-1,8);

    }
}

