Feature: Recommended investment

  @recommendedAllMpo
  Scenario Outline: add product if needed

    Given user in the page
    When user enter valid '<userid>' and '<password>'
    And click login button
    And successfully open home page
    And user click in navigation menu for recommended
    And user enter click in transaction page
    And select investment initiation page
    And click search investments list and select reference no
    And click next button and add targeted products of SBU if needed
    Then successfully recommended for mpo


    Examples:
      | userid | password |
      | 4971   | @Aa123   |
      | 10273  | @Aa123   |
      | 12423  | @Aa123   |
      | 13173  | @Aa123   |
      | 15349  | @Aa123   |