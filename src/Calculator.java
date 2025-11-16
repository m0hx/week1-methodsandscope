public class Calculator {

    // Keeps track of how many calculations we did in total
    private static int totalCalculations = 0;

    // Stores the last result we calculated, can be used in this class or subclasses
    protected int lastResult = 0;

    // Name of our calculator, anyone can see or change it
    public String calculatorName = "MyCalculator";


    // Public method to add two numbers, updates lastResult and totalCalculations
    public int add(int a, int b) {
        int result = a + b;
        lastResult = result;
        totalCalculations++;
        return result;
    }

    // Protected method to subtract, works in this class and subclasses, also updates counters
    protected int subtract(int a, int b) {
        int result = a - b;
        lastResult = result;
        totalCalculations++;
        return result;
    }

    // Private method, only usable inside this class, resets last result to 0
    private void resetCalculator() {
        lastResult = 0;
    }

    // Public method to reset the calculator, calls the private reset method inside
    public void monthlyReset() {
        resetCalculator();
        System.out.println("Calculator has been reset for the month.");
    }

    // Static method, belongs to the class, prints total number of calculations
    public static void showTotalCalculations() {
        System.out.println("Total calculations done: " + totalCalculations);
    }

    // Shows the last result, and demonstrates local variable shadowing
    public void showLastResult() {
        int lastResult = -1; // local variable shadows the instance variable
        System.out.println("Local lastResult (shadowed): " + lastResult);
        System.out.println("Instance lastResult: " + this.lastResult);
    }



    public static void main(String[] args) {

        Calculator calc = new Calculator();

        // Print name of the calculator
        System.out.println("Calculator name: " + calc.calculatorName);

        // Test add method
        int sum = calc.add(10, 5);
        System.out.println("Add Result: " + sum);

        // Test subtract method
        int diff = calc.subtract(20, 8);
        System.out.println("Subtract Result: " + diff);

        // Show last result and see shadowing in action
        calc.showLastResult();

        // Reset calculator using public method (calls private method inside)
        calc.monthlyReset();

        // Show total calculations
        Calculator.showTotalCalculations();
    }
}