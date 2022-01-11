package wiki.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


public class HomePage extends BasePage {

    public static final String URL = "url";
    private static final Logger log = LoggerFactory.getLogger(HomePage.class);
    

    @FindBy(xpath = "//*[@id=\"p-lang\"]/div/ul/li")
    private List<WebElement> allLanguage;

    @FindBy(xpath = "//*[@id=\"searchInput\"]")
    private WebElement searchInWikipediaInput;

    @FindBy(id = "searchButton" )
    private WebElement searchButton;

    @FindBy(xpath = "//*[@id=\'mw-content-text\']/div[1]/table[1]/tbody/tr[8]/td/div/ul/li")
    private List<WebElement> spouseList;

    @FindBy(xpath = "(//td[contains(@class,'infobox-data')])[1]")
    private WebElement dateOfBirth;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void goToHomePage() {
        driver.get(System.getProperty(URL));
    }


    public void scrollDownAndFindLanguage() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,100)", "");
    }

    public void storeFirstFewLanguage() {
        int counter = 0;
        for(int index = 0; index< allLanguage.size(); index++){
            WebElement language = allLanguage.get(index);
            if(counter == 10) break;
            scrollDownAndFindLanguage();
            log.info(language.getText());
            language.findElement(By.xpath("//*[@id=\'p-lang\']/div/ul/li["+ ++counter+"]/a/span")).click();
            driver.navigate().back();
        }

    }

    public void searchCelebrityName(String celebrityName) {
        searchInWikipediaInput.sendKeys(celebrityName);
        log.info("******** Celebrity Name ************");
        log.info("Name of Celebrity:: "+celebrityName);
        searchButton.click();
    }

    public void logBirthdatesAndSpouseDetails() {
        log.info("Birthday :: "+dateOfBirth.getText());
        for(WebElement spouse : spouseList){
            log.info("Spouse :: "+spouse.getText());
        }
    }
}
