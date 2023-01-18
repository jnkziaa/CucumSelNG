@OurStory
Feature: Feature to login on ourstory website

  @ourstorytest
  Scenario Outline: Basically login on ourstory website
    Given Open browser and maximize the size
    When Find the login input and input <username> and <password>
    When Press login button and wait for a couple of seconds to check homepage
    Then Quit the browser because test is done
    Examples:
      | username | password     |
      | Brownie  | johnjake     |
      | fakename | fakepassword |
