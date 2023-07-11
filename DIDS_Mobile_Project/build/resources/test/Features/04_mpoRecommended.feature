Feature: Recommended investment

  @recommended1
  Scenario: add product if needed

    Given user click in navigation menu for recommended
    When user enter click in transaction page
    And select investment initiation page
    And click search investments list and select reference no
    And click next button and add targeted products of SBU if needed
    Then successfully recommended for mpo

