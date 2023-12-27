package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.Set;

public class GreenkartStepDefs {
    WebDriver driver;
    String displayedNameOnSearch="";
    @Given("User on GreenKart page")
    public void user_on_green_kart_page() {
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
    }
    @When("User enters {string} on search page")
    public void user_enters_on_search_page(String string) throws InterruptedException {
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys(string);
        Thread.sleep(5000L);

        displayedNameOnSearch = driver.findElement(By.xpath("//h4[@class='product-name']")).getText().split("-")[0].trim();
        System.out.println("displayedNameOnSearch:"+displayedNameOnSearch);
    }
    @When("Navigate to Top Deals page")
    public void navigateToTopDealsPage() throws InterruptedException {
        String windHand1 = driver.getWindowHandle();

        driver.findElement(By.xpath("//a[text()='Top Deals']")).click();
        Thread.sleep(5000L);

        Set<String> windHandles = driver.getWindowHandles();
        for(String windHand: windHandles)
        {
            if(!windHand.equals(windHand1)) {
                driver.switchTo().window(windHand);
                break;
            }
        }
    }
    @Then("User can see same item on offers page for search {string}")
    public void user_can_see_same_item_on_offers_page_for_search(String string) throws InterruptedException {
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys(string);
        Thread.sleep(5000L);

        String displayedNameOnOffers = driver.findElement(By.xpath("//table//td[1]")).getText().trim();
        System.out.println("displayedNameOnOffers:"+displayedNameOnOffers);
        Assert.assertEquals(displayedNameOnOffers,displayedNameOnSearch);
    }


}
