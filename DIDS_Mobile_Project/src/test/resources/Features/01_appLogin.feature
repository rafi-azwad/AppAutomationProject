Feature: Login Module

  @login
  Scenario Outline: user login with valid data
    Given user in the page
    When user enter valid '<userid>' and '<password>'
   # When user enter invalid '<userid>' and '<password>'
    And click login button
    Then successfully open home page

    Examples:
      | userid | password |
      | 4971   | @Aa123   |
      | 12423  | @Aa123   |
      | 3308   | @Aa123   |
      | 5913   | @Aa123   |
      | 987    | @Aa123   |
      | 2180   | @Aa123   |




