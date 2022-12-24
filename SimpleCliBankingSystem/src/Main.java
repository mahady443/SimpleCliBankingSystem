import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name  And Customer ID To Access The Bank Account: ");
        int customerID= Integer.parseInt(scanner.nextLine());

        String customerName = scanner.nextLine();
        BankAccount bankAccount1 = new BankAccount(customerID,customerName);
        bankAccount1.menu();
    }
}