
@recommendedAllMpoC
Feature: Recommended investment


  Scenario Outline: login

    Given user in the page
    When user enter valid '<userid>' and '<password>'
    And click login button
    Then successfully open home page

   Examples:
     | userid | password |
     | 4971   | @Aa123   |
     | 10273  | @Aa123   |


  Scenario: add transaction with valid data

    Given user click in navigation menu
    When user enter click in transaction
    And select investment initiation
    And fill up information with valid data
    Then successfully investment initiation


