@dataload
Feature: Login feature
  In order to perform successful login
  As a User
  I have to enter correct username and password


  Scenario: Login to Instagram as a user form datatable feature

    Given user navigates to Instagram website
    When user validates the homepage titles
    Then user enters "positive" username
    And user enter "positive" password
    And user enters firstname and lastname
    |Fname|Lname|
    |cory|peltier|
    |cory|fantham|
    And user clicks on signin button




