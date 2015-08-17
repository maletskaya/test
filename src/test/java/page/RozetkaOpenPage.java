package page;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by yanamiletskaya on 16.08.15.
 */
public class RozetkaOpenPage  {
    private WebDriver driver;


    public RozetkaOpenPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open(String URL) {

        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
}
