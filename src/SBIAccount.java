import java.util.UUID;

public class SBIAccount implements BankInterface {

    //attributes
    private String name;
    private String accountNo;
    private int balance;
    private String password;
    private double rateOfInterest;


    //constructor
    public SBIAccount(String name, int balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;

        this.rateOfInterest = 6.6;
        this.accountNo = String.valueOf(UUID.randomUUID());
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    //methods
    @Override
    public int getBalance() {
        return this.balance;
    }

    @Override
    public String depositMoney(int amount) {
        this.balance += amount;
        return "You want to Deposit :"+amount;
    }

    @Override
    public String withdraw(int amount , String enterPassword) {
        if(enterPassword.equals(this.password))
        {
            if(amount>balance)
            {
                return "Insufficient Balance";
            }
            else
            {
                balance = balance - amount;
                return "Money Deducted";
            }
        }
        else
        {
            return "Your Password is Wrong";
        }
    }

    @Override
    public double calculateInterest(int time) {
        return (balance*time*rateOfInterest)/100.0;
    }
}
