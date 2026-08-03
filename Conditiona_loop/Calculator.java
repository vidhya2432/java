import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {

            while (true) {

                System.out.print("Enter the operator (+, -, *, /, %, X to Exit): ");
                char op = in.next().trim().charAt(0);

                // Exit condition
                if (op == 'X' || op == 'x') {
                    System.out.println("Calculator Closed.");
                    break;
                }

                // Check for valid operator
                if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {

                    System.out.print("Enter two numbers: ");
                    int num1 = in.nextInt();
                    int num2 = in.nextInt();

                    int ans = 0;

                    if (op == '+') {
                        ans = num1 + num2;
                    } else if (op == '-') {
                        ans = num1 - num2;
                    } else if (op == '*') {
                        ans = num1 * num2;
                    } else if (op == '/') {
                        if (num2 != 0) {
                            ans = num1 / num2;
                        } else {
                            System.out.println("Cannot divide by zero.");
                            continue;
                        }
                    } else if (op == '%') {
                        if (num2 != 0) {
                            ans = num1 % num2;
                        } else {
                            System.out.println("Cannot find remainder with zero.");
                            continue;
                        }
                    }

                    System.out.println("Result = " + ans);

                } else {
                    System.out.println("Invalid operator.");
                }
            }
        }
    }
}