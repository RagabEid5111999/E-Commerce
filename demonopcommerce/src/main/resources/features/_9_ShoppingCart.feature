@regression
Feature: User add products to shopping cart

  Scenario: guest user could add products to shopping cart

    When User choose a random product and click on add to shopping cart button
    Then message appears says The product has been added to your shopping cart
