
// Java Program to Display the ATM Interface
import java.util.*;

public class ATM {
    public static void displayBalance(int balance) {
        System.out.println("Current Balance in account : " + balance);
        System.out.println();
    }

    // Withdraw amount from ATM
    public static int amountWithdrawing(int balance, int withdrawAmount) {
        System.out.println("Withdrawn Operation:");
        System.out.println("Withdrawing Amount : " + withdrawAmount);
        // Condition for withdrawal
        if (balance >= withdrawAmount && withdrawAmount >= 500) {
            balance = balance - withdrawAmount;
            System.out.println("Please collect your money and collect the card");
            displayBalance(balance);
        } else {
            System.out.println(" Insufficient balance");
            System.out.println();
        }
        return balance;
    }

    // Deposit amount in ATM
    public static int amountDepositing(int balance, int depositAmount) {
        System.out.println("Deposit Operation:");
        System.out.println("Depositing Amount : " + depositAmount);
        balance = balance + depositAmount;
        System.out.println("Your Money has been successfully deposited");
        displayBalance(balance);
        return balance;
    }

    public static void main(String args[])// main method
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the balance amount:");
        int balance = sc.nextInt();
        System.out.println("Enter the Withdrawal amount:");
        int withdrawAmount = sc.nextInt();
        System.out.println("Enter the deposit amount:");
        int depositAmount = sc.nextInt();
        // calling display balance
        displayBalance(balance);
        // withdrawing amount
        balance = amountWithdrawing(balance, withdrawAmount);
        // depositing amount
        balance = amountDepositing(balance, depositAmount);
    }
}

// class for user bank account details
class userbankaccount {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int balance = sc.nextInt();
        int withdrawAmount = sc.nextInt();
        int depositAmount = sc.nextInt();
        ATM obj = new ATM();// creating object of amin class atm
        // calling display balance
        obj.displayBalance(balance);
        // withdrawing amount
        balance = obj.amountWithdrawing(balance, withdrawAmount);
        // depositing amount
        balance = obj.amountDepositing(balance, depositAmount);
    }
}