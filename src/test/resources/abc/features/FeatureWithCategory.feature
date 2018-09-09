Feature: Product category page

  Scenario: Check product title on category page is correct
    Given I am on the main page
    When I go to the category page
    And I grab first product title on category page
    And I click on first product on category page
    Then product title is correct