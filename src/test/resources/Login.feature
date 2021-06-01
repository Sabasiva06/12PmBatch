@F1
Feature: validating login functionality

  @reg
  Scenario: validating Fb home page
    Given user is on fb page
    When user need to enter username and password
    And user need to click login button
    Then user need to validate the page

  @smoke
  Scenario: validating Fb home page
    Given user is on fb page
    When user need to enter username and password
    And user need to click login button
    Then user need to validate the page

  @E2E
  Scenario: validating Fb home page
    Given user is on fb page
    When user need to enter username and password
    And user need to click login button
    Then user need to validate the page

  @Retest
  Scenario: validating Fb home page
    Given user is on fb page
    When user need to enter username and password
    And user need to click login button
    Then user need to validate the page

  @reg @smoke
  Scenario: validating Fb home page
    Given user is on fb page
    When user need to enter username and password
    And user need to click login button
    Then user need to validate the page
