@regression
Feature: User add products to wishlist

  Scenario: guest user could add products to wishlist
    When User choose a random product and click on add to wishlist icon
    Then message appears says The product has been added to your wishlist

  Scenario: user add product to wishlist
    When User choose a random product and click on add to wishlist icon
    And Click on wishlist tab
    Then Check QTY Number
