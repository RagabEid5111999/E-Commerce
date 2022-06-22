@regression
  Feature: Logged user could select different Categories
    Scenario: user is haver and select category
      When user haver on computer category
      And after hovering, you need to select random one of the three sub categories like Desktops
      Then Assert that the sub-category title is (equal or contains) the one you get it while selecting random sub-category