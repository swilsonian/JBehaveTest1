Meta:

Narrative:
As a user
I want to perform a math op
So that I can get the result of an op for two numbers

Scenario: scenario Addition
Given a Calculator class with the operation sign as <sign>
When I give the first number as <number1>
And I give the second number as <number2>
Then I should get the result as <result>

Examples:
|sign | number1 | number2 | result |
| + | 3 | 9 | 12 |


Scenario: scenario Subtraction
Given a Calculator class with the operation sign as <sign>
When I give the first number as <number1>
And I give the second number as <number2>
Then I should get the result as <result>

Examples:
|sign | number1 | number2 | result |
| - | 12 | 3 | 9 |