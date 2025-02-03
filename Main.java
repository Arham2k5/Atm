import java.util.Scanner;
class Atm{
    double salary;
    int pin = 1270;

    public void checkPin(){
        System.out.println("Enter PIN: ");
        Scanner sc = new Scanner(System.in);
        int enteredPin = sc.nextInt();

        if (enteredPin==pin){
            menu();
        }
        else
            System.out.println("Enter the Valid PIN");
            checkPin();
    }

    public void menu(){
        System.out.println("Enter your choices");
        System.out.println("1. Deposit Money");
        System.out.println("2. Cash Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        if (choice == 1){
            depositMoney();
        } else if (choice == 2) {
            cashWithdraw();
        } else if (choice == 3) {
            checkBalance();
        }
        else if (choice == 4){
            System.out.println("Exiting.....");
            return;
        }
        else
            System.out.println("Enter the Valid Choices from (1 to 4)");

    }

    public void depositMoney(){
        System.out.println("Deposit Money");
        Scanner sc = new Scanner(System.in);
        double depositMoney = sc.nextDouble();
        System.out.println("Money Deposited!");
        salary = salary + depositMoney;
        menu();
    }

    public void cashWithdraw(){
        System.out.println("Enter the amount for Withdrawal");
        Scanner sc = new Scanner(System.in);
        int cashOut = sc.nextInt();
        if (cashOut>salary){
            System.out.println("Insufficient Balance");
        }
        else
            salary = salary - cashOut;
        System.out.println("Cash Withdrew");
        menu();
    }

    public void checkBalance(){
        System.out.println("Current Balance  = " +salary);
        menu();
    }

}

public class Main {
    public static void main(String[] args) {
    Atm obj = new Atm();
    obj.checkPin();
    }
}