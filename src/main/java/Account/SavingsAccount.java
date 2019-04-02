package Account;

public class SavingsAccount extends Account{
    public SavingsAccount(int accNumber, String accStatus, int accAmount, double accInt) {
        super(accNumber, accStatus, accAmount, accInt);
    }
    public String intRate(int days){
        double amount =  (days * (100 * getAccInt())) + getAccAmount();
        return  amount +" Your Savings account will have this amount in " + days;
    }
}
