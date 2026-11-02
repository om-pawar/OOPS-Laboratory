import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.print("\nEnter operator (+, -, *, /) or 'q' to quit: ");
            char op = sc.next().charAt(0);
            if (op == 'q' || op == 'Q') {
                break;
            }

            try {
                System.out.print("Enter two integers: ");
                int a = sc.nextInt();
                int b = sc.nextInt();

                switch (op) {
                    case '+':
                        System.out.println("Result: " + (a + b));
                        break;
                    case '-':
                        System.out.println("Result: " + (a - b));
                        break;
                    case '*':
                        System.out.println("Result: " + (a * b));
                        break;
                    case '/':
                        System.out.println("Result: " + (a / b));
                        break;
                    default:
                        System.out.println("Invalid operator! Please use +, -, *, or /.");
                }
            } catch (ArithmeticException e) {
                System.out.println("Error: Cannot divide by zero!");
            } catch (Exception e) {
                System.out.println("Error: Invalid numeric input!");
                sc.nextLine(); // Clear buffer
            }
        }
        System.out.println("Calculator closed.");
        sc.close();
    }
}
