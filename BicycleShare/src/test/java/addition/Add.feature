Feature: Add numbers
  as a user
  I want to add numbers
  so that I can see the result

    Scenario: Add two numbers
      Given I have the number 5
      And I have the number 10
      When I press add
      Then I want to see the result 5 in my display