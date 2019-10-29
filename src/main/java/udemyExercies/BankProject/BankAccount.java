package udemyExercies.BankProject;

import java.util.Scanner;

public class BankAccount {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);

        String userName;
        String userEmail;
        double userDeposit;
        double userWithdrawal;
        double userBalance;
        int userAccountNumber;

        System.out.print("Please enter your full name: ");
        userName = a.nextLine();

        System.out.print("Please enter your email: ");
        userEmail = a.nextLine();

        System.out.print("Please enter your account number: ");
        userAccountNumber = a.nextInt();

        System.out.print("Please enter balance: ");
        userBalance = a.nextInt();


        Details firstAccount = new Details(userAccountNumber, userBalance, userName, userEmail);
        firstAccount.fullMessage();

        Details secondAccount = new Details(userAccountNumber, userBalance, userName, userEmail);
        secondAccount.fullMessage();

        System.out.print("Please enter the deposit amount: ");
        userDeposit =  a.nextInt();
        firstAccount.deposit(userDeposit);

        System.out.print("Please enter the withdrawal: ");
        userWithdrawal = a.nextInt();
        firstAccount.withdrawal(userWithdrawal);


    }

}


