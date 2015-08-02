package ui_tests.lesson7;

import core.TestBase;
import org.testng.annotations.Test;
import page.GoogleSearchPage;

import static org.testng.Assert.assertTrue;

/**
 * Created by yanamaletskaya on 30.07.15.
 */
public class GoogleSearchTest extends TestBase{
    private String googleWebSite = "https://www.google.com";
    private String searchText ="Selenium";

    @Test
    public void seleniumSearchTest(){
        GoogleSearchPage onGoogleSearchPage = new GoogleSearchPage(driver);
        onGoogleSearchPage.open(googleWebSite);
        onGoogleSearchPage.searchText(searchText);

        assertTrue(onGoogleSearchPage.findURL().getText().toLowerCase().contains(searchText.toLowerCase()));
    }

}
