package utils;


import org.testng.Reporter;
import org.testng.log4testng.Logger;

/**
 * Created by yanamiletskaya on 05.08.15.
 */
public class Log4Test {

    private static final Logger LOGGER = Logger.getLogger(Log4Test.class);
    private static final String INFO_LOG = "INFO: \"%s\"";
    private static final String ERROR_LOG = "ERROR: \"%s\" !";

    private Log4Test() {

    }

    public static String error(String messsage) {
        LOGGER.error(String.format(ERROR_LOG, messsage));
        Reporter.log(String.format(ERROR_LOG, messsage));
        return String.format(ERROR_LOG, messsage);

    }

    public static String info(String messsage) {
        LOGGER.error(String.format(INFO_LOG, messsage));
        Reporter.log(String.format(INFO_LOG, messsage));
        return String.format(INFO_LOG, messsage);

    }
}
