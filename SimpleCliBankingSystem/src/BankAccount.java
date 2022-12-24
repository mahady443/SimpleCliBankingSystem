import java.awt.*;
import java.util.Scanner;

public class BankAccount {
    double balance;
    double previousBalance;
    String customerName;
    int customerID;

    public BankAccount(int customerID , String customerName){
        this.customerID= customerID;
        this.customerName = customerName;

    }

    void deposit(double amount){
        if (amount !=0){
            balance+= amount;
            previousBalance= amount;
        }
    }

    void withdraws(double amount){
        if (amount!= 0&& balance>= amount ){
            balance-= amount;
            previousBalance = -amount;
        } else if (balance<amount) {
            System.out.println("You Don't Have Sufficient Balance ");
        }
    }
    void getPreviousBalance(){
        if (previousBalance>0){
            System.out.println("Deposited : "+ previousBalance);
        } else if (previousBalance<0) {
            System.out.println("Withdrawn :"+ Math.abs(previousBalance));

        }
        else {
            System.out.println("No Transaction Occur");
        }
    }


    void menu(){
        char menuOptionNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Bank Of ABC !!");
        System.out.println("Your Name"+ customerName);
        System.out.println("User ID : " + customerID);
        System.out.println(" ");
        System.out.println("(a) Check Balance ");
        System.out.println("(b) Deposit Amount");
        System.out.println("(c) Withdraw Amount");
        System.out.println("(d) Previous Transaction");
        System.out.println("(e) Exit ");


        do {
            System.out.println("********************************************");
            System.out.println("Choose an option");
            menuOptionNumber=scanner.next().charAt(0);
            System.out.println("\n");
            switch (menuOptionNumber){
                case 'a':
                    System.out.println("......................");
                    System.out.println("Balance ="+balance);
                    System.out.println("......................");
                    System.out.println("\n");
                    break;
                case 'b':
                    System.out.println("......................");
                    System.out.println("Enter a amount to deposit :");
                    System.out.println("......................");
                    double amount=scanner.nextDouble();
                    deposit(amount);
                    System.out.println("\n");
                    break;
                case 'c':
                    System.out.println("......................");
                    System.out.println("Enter a amount to Withdraw :");
                    System.out.println("......................");
                    double amountWithdraw=scanner.nextDouble();
                    withdraws(amountWithdraw);
                    System.out.println("\n");
                    break;
                case 'd':
                    System.out.println("......................");
                    System.out.println("Previous Transaction:");
                    getPreviousBalance();
                    System.out.println("......................");
                    System.out.println("\n");
                    break;

                case 'e':
                    System.out.println("......................");
                    break;
                default:
                    System.out.println("Choose a correct option to proceed");
                    break;
            }

        }while(menuOptionNumber!='e');

        System.out.println("Thank you for using our banking services");
    }

}




