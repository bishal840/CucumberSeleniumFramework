package Pages;

import org.openqa.selenium.WebDriver;

public class PagesObjectFactory {

    WebDriver driver;

    public PagesObjectFactory(WebDriver driver) {
        this.driver = driver;
    }

    public LandingPage getLandingPage()
    {
        return new LandingPage(driver);
    }

    public OfferPage getOfferPage()
    {
        return new OfferPage(driver);
    }
}
