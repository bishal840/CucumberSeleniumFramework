@Tag1
Feature: Green kart scenarios

  Scenario: Suggestions of Items
    Given User on GreenKart page
    When User enters "tom" on search page
    And Navigate to Top Deals page
    Then User can see same item on offers page for search "tom"
#    Then Print on OfferPage