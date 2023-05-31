Feature: Land Page

  Scenario: Airline Logo display
    Given user goes to airline page
    Then validate airline logo is visible

  Scenario: Return Field Display
    Given A user selects direct flights option
    And User Clicks On One Way Button
    Then Return Field Disappears From Users View