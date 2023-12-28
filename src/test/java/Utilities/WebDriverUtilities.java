package Utilities;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class WebDriverUtilities {

    WebDriver driver;
    public WebDriverUtilities(WebDriver driver) {
        this.driver=driver;
    }

    public void getURL(String url)
    {
        driver.get(url);
    }
    public void switchToOtherWindow()
    {
        String windHand1 = driver.getWindowHandle();

        Set<String> windHandles = driver.getWindowHandles();
        for(String windHand: windHandles)
        {
            if(!windHand.equals(windHand1)) {
                driver.switchTo().window(windHand);
                break;
            }
        }
    }
}
