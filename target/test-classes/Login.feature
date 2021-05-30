Feature: validating login functionality

  Scenario: validating Fb home page
    Given user is on fb page
    When user need to enter username and password
    And user need to click login button
    Then user need to validate the page
