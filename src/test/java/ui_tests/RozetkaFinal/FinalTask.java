package ui_tests.RozetkaFinal;

import AssetPageLaptop.AssertLaptopPage1;
import AssetPageLaptop.AssertListOf9;
import core.TestBase;
import org.testng.annotations.Test;
import page.RozetkaAssertPage9;
import page.RozetkaLaptops;
import page.RozetkaOpenPage;

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
        RozetkaAssertPage9 listof9 = new RozetkaAssertPage9(driver);
        AssertListOf9 manufact = new AssertListOf9(driver);





        onRozetkaPage.open(rozetkaPage); //1
        assertEquals(driver.getCurrentUrl(), rozetkaPage, "http://rozetka.com.ua");//2

        laptopTabs.clickLaptops(); //3
        assertEquals(driver.getCurrentUrl(), "http://rozetka.com.ua/computers-notebooks/c80253/"); //4

        laptopTabs.getNotebooksComputersList(); // 5
        assertLaptop.assertNoteBoklist(laptopTabs);    //5
        laptopTabs.buttonClick();  //6

        listof9.getlistOf9();//7
        manufact.assertManufacturesDisplayed(listof9); //7
        listof9.buttonClick1();  //6

        //assertTrue(driver.getCurrentUrl().contains("notebooks/apple")); //7

         listof9.lowToHigh();



    }
}
