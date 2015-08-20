package ui_tests.RozetkaFinal;

import AssetPageLaptop.AssertLaptopPage1;
import AssetPageLaptop.AssertRozetkaManufactures;
import core.TestBase;
import org.testng.annotations.Test;
import page.*;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Created by yanamiletskaya on 16.08.15.
 */
public class FinalTask extends TestBase {

    private String rozetkaPage = "http://rozetka.com.ua";

    @Test

    public void rozetkaTask() {
        RozetkaOpenPage onRozetkaPage = new RozetkaOpenPage(driver);
        RozetkaLaptops laptopTabs = new RozetkaLaptops(driver);
        AssertLaptopPage1 assertLaptop = new AssertLaptopPage1(driver);
        RozetkaManufactures manufactures = new RozetkaManufactures(driver);
        AssertRozetkaManufactures manuf = new AssertRozetkaManufactures(driver);
        RozetkaApplePage listDisplayed = new RozetkaApplePage(driver);
        RozetkaComparePage elementsExist = new RozetkaComparePage(driver);


        onRozetkaPage.open(rozetkaPage); //1
        assertEquals(driver.getCurrentUrl(), rozetkaPage, "http://rozetka.com.ua");//2

        laptopTabs.clickLaptops(); //3
        assertEquals(driver.getCurrentUrl(), "http://rozetka.com.ua/computers-notebooks/c80253/"); //4

        laptopTabs.getNotebooksComputersList(); // 5
        assertLaptop.assertNoteBoklist(laptopTabs);    //5
        laptopTabs.buttonClick();  //6


        manufactures.listOfManufactures();//7
        manuf.assetManufactures(manufactures); //7

        listDisplayed.apple(); //6

        listDisplayed.applePageIs(); //7

        listDisplayed.fromChipToExpClick(); //8

        listDisplayed.getAppleRetina13(); //9

        listDisplayed.addToCompare13(); //10  dodelat xpath
        listDisplayed.listContainsAppl13(); //11

        listDisplayed.getAppleRetina15();//12

        listDisplayed.addToCompare15(); //13 //dodelat xpath

        listDisplayed.listContainsApp15(); //14

        listDisplayed.getAppleRetinaInCompare(); //15 compareIcon

        elementsExist.pageContainsCompare(); //16

        elementsExist.pageContainsLaptops();//17
        elementsExist.pageContainsLaptops2();//17
    }
}
