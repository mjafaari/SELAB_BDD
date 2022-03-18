@tag
Feature: MyFunc
  Scenario Outline: divide and root
    Given Two input values, <first> and <second>
    When I divide and root them
    Then I expect the result <result>
    Examples:
      | first | second | result |
      | 4 | 1 | 2 |
      | 36 | 4 | 3 |
      | -1 | -1 | 1 |
      | 1 | 0 | -1 |
      | 10 | -2 | -2 |
      | -9 | 3 | -2 |