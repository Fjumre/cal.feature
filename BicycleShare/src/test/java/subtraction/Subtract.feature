Feature: Subtract numbers
  as a user
  I want to subtract numbers
  so that I can see the result

    Scenario: Subtract two numbers
      Given I also have the number 10
      And I also have the number 8
      When I press subtract
      Then I also want to see the result 2 in my display
