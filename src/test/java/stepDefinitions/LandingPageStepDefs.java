package stepDefinitions;

import Pages.LandingPage;
import Utilities.TestDependencyInjection;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class LandingPageStepDefs extends BaseStepDef {

    public LandingPageStepDefs(TestDependencyInjection testDependencyInjection) {
        super(testDependencyInjection);
    }

    @Given("User on GreenKart page")
    public void user_on_green_kart_page() {
        testDependencyInjection.webDriverUtilities.getURL("https://rahulshettyacademy.com/seleniumPractise/#/");
    }
    @When("User enters {string} on search page")
    public void user_enters_on_search_page(String itemName) throws InterruptedException {
//
        landingPage.searchItem(itemName);
        Thread.sleep(5000L);

        testDependencyInjection.landingPageDisplayedName = landingPage.getProductName();
        System.out.println("displayedNameOnSearch:"+testDependencyInjection.landingPageDisplayedName);
    }

    @When("Navigate to Top Deals page")
    public void navigateToTopDealsPage() throws InterruptedException {

        landingPage.clickTopDeals();
        Thread.sleep(5000L);

        testDependencyInjection.webDriverUtilities.switchToOtherWindow();
    }



}
