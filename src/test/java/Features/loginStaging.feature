
Feature: Login feature
  In order to perform successful login
  As a User
  I have to enter correct username and password


  Background:
    Given user navigates to Instagram website
    When user validates the homepage titles

  @staging
  Scenario: Login to Instagram as a user on Staging
    Then user enters "valid" username
    And user enter "valid" password
    And user validates captcha image
    And user clicks on signin button

    @staging
  Scenario: Login to Instagram as a user on Staging
    Then user enters "invalid" username
    And user enter "invalid" password
    And user validates captcha image
    And user clicks on signin button
