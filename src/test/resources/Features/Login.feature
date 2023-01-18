@SmokeFeatures
Feature: Feature to test login functionality

  @smoketest
  Scenario Outline: Check login is successful with valid credentials
    Given User is on login page
    When User enters <username> and <password>
    When clicks on login button
    Then user is navigated to the home page
    Examples:
      | username | password     |
      | Brownie  | johnjake     |
      | fakename | fakepassword |

