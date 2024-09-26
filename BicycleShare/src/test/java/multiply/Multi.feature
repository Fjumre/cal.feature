Feature: Multiply numbers
  As a user
  I want to multiply numbers
  So that I can see the result

  Scenario: Multiply numbers
    Given I have the number 4 to multiply
    And I have the number 5 to multiply
    When I press multiply
    Then I want to see the multiply result 20 on my display
