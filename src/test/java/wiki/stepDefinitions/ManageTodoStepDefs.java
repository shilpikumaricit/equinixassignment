package wiki.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import wiki.pages.BasePage;
import wiki.pages.HomePage;

public class ManageTodoStepDefs extends BasePage {

    private HomePage homePage;

    public ManageTodoStepDefs() {
        this.homePage = new HomePage();
    }

    @Given("User navigates to the website")
    public void navigateToWebsite() {
        homePage.goToHomePage();
    }

    @Then("store first 10 language from menu")
    public void storeFirstFewLanguage() {
        homePage.storeFirstFewLanguage();
    }

    @Then("scroll down to find language section in left menu")
    public void scrollDownAndFindLanguage() {
        homePage.scrollDownAndFindLanguage();
    }

    @Then("Search celebrity name {string}")
    public void searchCelebrityName(String celebrityName) {
        homePage.searchCelebrityName(celebrityName);
    }

    @Then("log birthdates and spouse details")
    public void logBirthdatesAndSpouseDetails() {
        homePage.logBirthdatesAndSpouseDetails();
    }
}
