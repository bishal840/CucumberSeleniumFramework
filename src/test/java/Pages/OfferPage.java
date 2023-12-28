package Pages;

import Utilities.TestDependencyInjection;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class OfferPage {

    public WebDriver driver;
    public OfferPage( WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
    }
    @FindBy(how = How.XPATH, using="//input[@type='search']")
    public WebElement searchBox;
    @FindBy(how = How.XPATH, using="//table//td[1]")
    public WebElement productName;

    public void searchItem(String name)
    {
        searchBox.sendKeys(name);
    }

    public String getProductName()
    {
        return  productName.getText().trim();
    }

}
