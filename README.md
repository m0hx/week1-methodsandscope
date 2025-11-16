# Calculator - Methods and Scope

## Objective
Practice using methods with different access modifiers and variable scopes in Java.

## Scenario
A simple calculator program performs basic operations on numbers and keeps track of internal state.

## Instructions Followed

### Variables
- A private static variable tracks the total number of calculations.  
- A protected variable stores the last result of a calculation.  
- A public variable stores the name of the calculator.  

### Methods
- Public `add` method returns the sum of two numbers and updates the last result and total calculations.  
- Protected `subtract` method returns the difference, updates the last result, and total calculations.  
- Private `resetCalculator` method resets the last result to zero.  
- Public `monthlyReset` method calls the private reset method.  
- Static `showTotalCalculations` method displays the total number of calculations.  
- `showLastResult` method shows the last result and demonstrates local variable shadowing.  

### Main Method
- Calls all public and protected methods to test the program.  
- Demonstrates the difference between local and instance variables.  
- Calls the private method only through a public method.
