package Utilities;

import Pages.PagesObjectFactory;
import org.openqa.selenium.WebDriver;
import stepDefinitions.LandingPageStepDefs;

public class TestDependencyInjection {
    public WebDriver driver ;
    public String landingPageDisplayedName;

    public PagesObjectFactory pagesObjectFactory;

    public WebDriverUtilities webDriverUtilities;

    public TestDependencyInjection() {
        TestBase testBase = new TestBase();
        this.driver=new TestBase().driverManager();
        this.pagesObjectFactory = new PagesObjectFactory(driver);
        webDriverUtilities = new WebDriverUtilities(driver);
    }
}
