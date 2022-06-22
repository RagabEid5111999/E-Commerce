@regression

Feature: User could register with valid data
  Scenario: user enter valid data to register
    Given user click on register
    When user enter his data
    And user click submit
    Then Your registration completed message