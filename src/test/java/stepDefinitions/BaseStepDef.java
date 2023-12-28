package stepDefinitions;

import Pages.LandingPage;
import Pages.OfferPage;
import Utilities.TestDependencyInjection;

public class BaseStepDef {
    TestDependencyInjection testDependencyInjection;
    LandingPage landingPage;
    OfferPage offerPage ;


    public BaseStepDef(TestDependencyInjection testDependencyInjection) {
        this.testDependencyInjection = testDependencyInjection;
        landingPage = testDependencyInjection.pagesObjectFactory.getLandingPage();
        offerPage = testDependencyInjection.pagesObjectFactory.getOfferPage();

    }
}
