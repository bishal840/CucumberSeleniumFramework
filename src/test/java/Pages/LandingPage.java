package Pages;

import Utilities.TestDependencyInjection;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

    public WebDriver driver;
    public LandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
    }
    @FindBy(how = How.XPATH, using="//input[@type='search']")
    public WebElement searchBox;
    @FindBy(how = How.XPATH, using="//h4[@class='product-name']")
    public WebElement productName;

    @FindBy(how = How.XPATH, using="//a[text()='Top Deals']")
    public WebElement link_TopDeals;

    public void searchItem(String name)
    {
        searchBox.sendKeys(name);
    }

    public String getProductName()
    {
        return  productName.getText().split("-")[0].trim();
    }

    public void clickTopDeals()
    {
        link_TopDeals.click();
    }

}
