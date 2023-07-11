Feature: Add Transaction

  @marketGroup
  Scenario: add transaction with valid data

    Given user click in navigations menu
    When user enter click in transactions
    And select market group
    And fill up informations with valid data
    Then successfully created market group
