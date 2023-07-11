Feature: Recommended by TM

  @recommendedRSM
  Scenario Outline: add product if needed

    Given user in the page
    When user enter valid '<userid>' and '<password>'
    And click login button
    And successfully open home page
    And rsm click in navigation menu for recommended
    And enter click in transaction button
    And enter click in investment approval
    And rsm click reference for select reference no
    And clicks next button and add targeted product of SBU if needed
    Then successfully approved by RSM


    Examples:
      | userid | password |
      | 2771   | @Aa123   |
      | 605    | @Aa123   |
      | 1102   | @Aa123   |
      | 1543   | @Aa123   |
      | 2180   | @Aa123   |
      | 987    | @Aa123   |

