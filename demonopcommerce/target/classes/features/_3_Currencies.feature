@regression

  Feature: Logged User could switch between currencies US-Euro
    Scenario: user select or switch between currencies US-Euro
      When user select "Euro"
      Then Verify Euro is shown in four product displayed in the home page