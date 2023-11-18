import java.util.Scanner;

public class MathOperation {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the first number: ");
    double num1 = sc.nextDouble();

    System.out.print("Enter the second number: ");
    double num2 = sc.nextDouble();

    System.out.println("Select an operation:");
    System.out.println("1 : Addition");
    System.out.println("2 : Subtraction");
    System.out.println("3 : Multiplication");
    System.out.println("4 : Division");
    System.out.print("Enter your choice: ");
    int choice = sc.nextInt();

    double result = 0;

    switch (choice) {
      case 1:
        result = add(num1, num2);
        break;
      case 2:
        result = subtract(num1, num2);
        break;
      case 3:
        result = multiply(num1, num2);
        break;
      case 4:
        if (num2 != 0) {
          result = divide(num1, num2);
        } else {
          System.out.println("Division by zero is not allowed.");
          System.exit(0);
        }
        break;
      default:
        System.out.println("Invalid choice");
        System.exit(0);
    }

    System.out.println("Result: " + result);
    sc.close();
  }

  public static int add(int a, int b) {
    return a + b;
  }

  public static double add(double a, double b) {
    return a + b;
  }

  public static int subtract(int a, int b) {
    return a - b;
  }

  public static double subtract(double a, double b) {
    return a - b;
  }

  public static int multiply(int a, int b) {
    return a * b;
  }

  public static double multiply(double a, double b) {
    return a * b;
  }

  public static double divide(double a, double b) {
    return a / b;
  }
}
