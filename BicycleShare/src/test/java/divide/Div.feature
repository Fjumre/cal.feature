Feature: Divide numbers
  As a user
  I want to divide numbers
  So that I can see the result

    Scenario: Divide numbers
      Given I have the number 100 to divide
      And I have the number 5 to divide
      When I press divide
      Then I want to see the divided result 200 on my display
