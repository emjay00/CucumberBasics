
Feature: Login feature
  In order to perform successful login to production
  As a User
  I have to enter correct username and password

  Scenario: Login to Instagram as a user on Production
    Given user navigates to Instagram website
    When user validates the homepage titles
    Then user enters "valid" username
    And user enter "valid" password
    And user validates captcha image
    And user "shouldbe" successfully logged in

  Scenario: Login to Instagram as a user on Production
    Given user navigates to Instagram website
    When user validates the homepage titles
    Then user enters "invalid" username
    And user enter "invalid" password
    And user validates captcha image
    And user "shouldnt" successfully logged in



