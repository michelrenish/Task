package task_5;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int accNum = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String accHolder = sc.nextLine();

        Account account = new Account(accNum, accHolder);

        int choice;
        do {
            System.out.println("\n===== Bank Menu =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Show Balance");
            System.out.println("4. Transaction History");
            System.out.println("5. Account Details");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ₹");
                    double depositAmt = sc.nextDouble();
                    account.deposit(depositAmt);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdrawAmt = sc.nextDouble();
                    account.withdraw(withdrawAmt);
                    break;
                case 3:
                	account.showBalance();
                    break;
                case 4:
                    account.printTransactionHistory();
                    break;
                case 5:
                    account.printAccountDetails();
                    break;
                case 6:
                    System.out.println("Thank you for using our bank system.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}

