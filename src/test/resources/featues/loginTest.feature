Feature: As a user,I want to login into the application

  Scenario: Verify user can login with valid credentials
    Given user opens website
    Then verify user is on login page
    When user login with valid credentials
    Then verify user is on home page

  Scenario: Verify user can logout of the application
    Given user opens website
    Then verify user is on login page
    When user login with valid credentials
    Then verify user is on home page
    When user click on user icon
    And  click on logout link
    Then verify user is on login page

    @wip
  Scenario Outline: Verify error message for invalid login credentials
    Given user opens website
    Then verify user is on login page
    When user login with username "<username>" and password "<password>"
    When user login with valid credentials
    Then verify invalid login error message is displayed

    Examples:
      | username | password |
      | test     | test123  |
      | demo     | demo123  |
      | hello    | hello123 |