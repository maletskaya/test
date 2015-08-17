package ui_tests;

import core.BrowserTypes;
import utils.PropertyLoader;

/**
 * Created by yanamiletskaya on 03.08.15.
 */
public class TestData {
    public static final BrowserTypes BROWSER_NAME = BrowserTypes.valueOf(PropertyLoader.loadProperty("browser.name"));

}
