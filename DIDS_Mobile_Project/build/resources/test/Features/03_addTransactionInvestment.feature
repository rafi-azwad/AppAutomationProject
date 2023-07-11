Feature: Add Transaction

  @initialInvestment
  Scenario Outline: add transaction with valid data

    Given user in the page
    When user enter valid '<userid>' and '<password>'
    And click login button
    And successfully open home page
    And user click in navigation menu
    And user enter click in transaction
    And select investment initiation
    And fill up information with valid data
    Then successfully investment initiation

    Examples:
      | userid | password |
      | 6387   | @Aa123   |

