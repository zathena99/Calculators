import java.util.*;

public class SavingsAccount {
    private double balance;
    public static double interestRate = 0;

    public SavingsAccount() {
        balance = 0;
    }

    public static void setInterestRate(double newRate) {
        interestRate = newRate;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void addInterest() {
        if (balance >= 1000) {
            double interest = balance * interestRate;
            balance += interest;
        }
    }

    public static void showBalance(SavingsAccount account) {
        System.out.println("Your balance is: " + account.getBalance());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SavingsAccount savings = new SavingsAccount();
        System.out.println("Enter interest rate: ");
        SavingsAccount.setInterestRate(sc.nextDouble());
        System.out.println("Enter deposit amount: ");
        savings.deposit(sc.nextDouble());
        System.out.println("Your Balance is " + savings.getBalance());
        sc.nextLine(); // Consume the newline character

        while (true) {
            System.out.println("Press D for another deposit");
            System.out.println("Press W to withdraw");
            System.out.println("Press X to end your session");
            String input = sc.nextLine().toUpperCase();

            if (input.equals("D")) {
                System.out.println("Input deposit amount: ");
                double depositAmount = sc.nextDouble();
                savings.deposit(depositAmount);
                savings.addInterest();
                System.out.println("Your balance is: " + savings.getBalance());
            } else if (input.equals("W")) {
                System.out.println("Enter withdraw amount: ");
                double withdrawAmount = sc.nextDouble();
                savings.withdraw(withdrawAmount);
                System.out.println("Your balance is: " + savings.getBalance());
            } else if (input.equals("X")) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid option");
            }

            sc.nextLine();
        }

        sc.close();
    }
}
