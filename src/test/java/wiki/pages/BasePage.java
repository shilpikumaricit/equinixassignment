package wiki.pages;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import wiki.infrastructure.Setup;
import wiki.infrastructure.Wait;

public class BasePage {
    public static WebDriver driver;
    public  static Wait wait;
    private static final Logger logger = LoggerFactory.getLogger(BasePage.class);

    public BasePage() {
        logger.info("Setting driver");
        this.driver = Setup.driver;
        this.wait = new Wait(this.driver);
    }
}
