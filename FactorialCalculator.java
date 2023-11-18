import java.util.Scanner;

public class FactorialCalculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, i;
    int fact = 1;

    System.out.print("Enter a number: ");
    n = sc.nextInt();

    if (n > 0) {
      System.out.print(n + "!" + " = ");

      for (i = 1; i <= n; i++) {
        System.out.print(i + " x ");

        fact = fact * i;
      }
    
      System.out.println("\nThe factorial of " + n + " is: " + fact);

    } else if (n < 0) {
      System.out.println("Invalid Input! Program Stopped!");
    } else {
      System.out.println("The number you entered is zero.");
    }
    
    sc.close();
  }
}
