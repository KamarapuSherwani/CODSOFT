package task3;
import java.util.*;
public class BCmain{
	//---------------main method-------------------------
    public static void main(String[] args) {
        BankAcc b1 = new BankAcc(50000);
        Atm a1 = new Atm(b1);
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Choose any option.\n1.Withdraw\n2.Deposit\n3.Check Balance\n4.Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the amount to withdraw: ");
                    int wt = sc.nextInt();
                    new Thread() {
                        public void run() {
                            a1.withdraw(wt);
                        }
                    }.start();
                    break;

                case 2:
                    System.out.println("Enter the amount to deposit: ");
                    int de = sc.nextInt();
                    new Thread() {
                        public void run() {
                            a1.deposit(de);
                        }
                    }.start();
                    break;

                case 3:
                    a1.checkBalance();
                    break;

                case 4:
                    System.out.println("Exiting...!Thank You!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Enter a valid choice!");
                    break;
            }
        } while (choice != 4);
        sc.close();
    }
}