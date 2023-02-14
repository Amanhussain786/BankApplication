import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name , Balance and Password :");
        String name = sc.next();
        int balance = sc.nextInt();
        String password = sc.next();

        SBIAccount amanAcc = new SBIAccount(name,balance,password);
        System.out.println("Your Account has been Created with Account Number: "+amanAcc.getAccountNo());

        //get balance
        System.out.println("Your Current Balance is :"+ amanAcc.getBalance());

        //deposite
        System.out.println(amanAcc.depositMoney(1000));
        System.out.println("Current Balance is Now :"+amanAcc.getBalance());

        //withdraw
        System.out.println("Enter Amount to be Withdrawn :");
        int amnt = sc.nextInt();
        System.out.println("Enter Your Password :");
        String pword = sc.next();

        System.out.println(amanAcc.withdraw(amnt,pword));

        //Interest
        System.out.println("Enter the time for the Interest :");
        int t = sc.nextInt();

        System.out.println("Your Interest for "+t+" Years on current Balance :"+amanAcc.getBalance()+" is "+amanAcc.calculateInterest(t));
    }
}