package stepDefinitions;

import Pages.OfferPage;
import Utilities.TestDependencyInjection;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.Set;

public class OfferPageStepDefs extends BaseStepDef{

    public OfferPageStepDefs(TestDependencyInjection testDependencyInjection) {
        super(testDependencyInjection);

    }

    @Then("User can see same item on offers page for search {string}")
    public void user_can_see_same_item_on_offers_page_for_search(String itemName) throws InterruptedException {
        offerPage.searchItem(itemName);
        Thread.sleep(5000L);

        String displayedNameOnOffers = offerPage.getProductName();
        System.out.println("displayedNameOnOffers:"+displayedNameOnOffers);
        Assert.assertEquals(displayedNameOnOffers,testDependencyInjection.landingPageDisplayedName);
        System.out.println("TITLE:"+testDependencyInjection.driver.getTitle());
    }


    @Then("Print on OfferPage")
    public void printOnOfferPage() {
        String displayedNameOnOffers = offerPage.getProductName();
        System.out.println("displayedNameOnOffers:"+displayedNameOnOffers);
    }
}
