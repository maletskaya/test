package AssetPageLaptop;

import core.TestBase;
import org.openqa.selenium.WebDriver;
import page.RozetkaLaptops;

import static org.testng.Assert.assertEquals;

/**
 * Created by yanamiletskaya on 17.08.15.
 */
public class AssertLaptopPage1 extends TestBase {
        public AssertLaptopPage1 (WebDriver driver){
            this.driver = driver;

        }
        public void assertNoteBoklist(RozetkaLaptops laptopTabs){
            assertEquals(laptopTabs.getNotebooksComputersList().size()- 1, 6, "Size not 6");

        }

    }
