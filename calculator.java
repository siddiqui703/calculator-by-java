
//code starts
import java.util.*;

public class calculator { // Class name capitalized (convention)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Calculator made by Ayan Siddiqui");

        System.out.println("Press + for addition");
        System.out.println("Press - for subtraction");
        System.out.println("Press * for multiplication");
        System.out.println("Press / for division");
        System.out.println("Press % for remainder\n");

        System.out.print("Which operation do you want to perform: ");
        String operation = input.nextLine();

        System.out.print("Enter number 1: ");
        double num1 = input.nextDouble();

        System.out.print("Enter number 2: ");
        double num2 = input.nextDouble();

        float result;
        switch (operation) {
            case "+":
                result = (float) (num1 + num2);
                System.out.println("Result: " + result);
                break;
            case "-":
                result = (float) (num1 - num2);
                System.out.println("Result: " + result);
                break;
            case "*":
                result = (float) (num1 * num2);
                System.out.println("Result: " + result);
                break;
            case "/":
                if (num2 != 0) {
                    result = (float) (num1 / num2);
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case "%":
                if (num2 != 0) {
                    result = (float) (num1 % num2);
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operation. Please use +, -, *, /, or %.");
                break;
        }

        input.close();
    }
}
// codes ends