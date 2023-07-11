Feature: Recommended by TM

  @recommendedTM
  Scenario Outline: add product if needed

    Given user in the page
    When user enter valid '<userid>' and '<password>'
    And click login button
    And successfully open home page
    And user clicks in navigation menu for recommended
    And user enter click in transaction button
    And user enter click in investment recommendation
    And click reference for select reference no
    And click next button and add targeted product of SBU if needed
    Then successfully recommended by TM


    Examples:
      | userid | password |
      | 2001   | @Aa123   |
      | 3308   | @Aa123   |
      | 3993   | @Aa123   |
      | 5913   | @Aa123   |
      | 7573   | @Aa123   |
      | 5409   | @Aa123   |
