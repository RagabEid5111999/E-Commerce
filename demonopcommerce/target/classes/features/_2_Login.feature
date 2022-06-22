@regression

  Feature: User could log in with valid email and password
    Scenario: user enter valid email and password
      Given user click on login button
      When user Enter Email
      And user enter password
      And click enter key
      Then user login Successfully

#    Step 1 user go to login page
#    Step 2 user login with "valid" "test@example.com" and "P@ssw0rd"
#    Step 3 user press on login button
#    Step 4 user login to the system successfully
    Scenario: user could login with invalid email and password
      Given user click on login button
      When user login with "invalidtest@example.com" and "P@ssw0rd"
      And click enter key
      Then user could not login to the system