Feature: Login feature
  In order to perform successful login
  As a User
  I have to enter correct username and password

  Scenario Outline: Login to Instagram as a user
    Given user navigates to Instagram website
    When user validates the homepage titles
    Then user enters "<username>" username
    And user enter "<password>" password
    And user selects age
    |category|country|
    |below 18| Canada|
    |above 18| India|
    And user clicks on signin button

    Examples:
      | username | password |
      | valid    | valid    |
      | invalid  | invalid  |
      | valid    | invalid  |
      | invalid  | valid    |

