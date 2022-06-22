@regression

  Feature: user will be able to open sliders in home page
    Scenario: first slider are clickable in home page
      When user click on first slider
      Then relative product for first slider was displayed

    Scenario: second slider are clickable in home page
      When user click on second slider
      Then relative product for second slider was displayed
