package Account;

public class CheckingAccount extends Account {

    public CheckingAccount(int accNumber, String accStatus, int accAmount, double accInt) {
        super(accNumber, accStatus, accAmount, accInt);
    }

    @Override
    public String intRate(int days) {
         double amount =  (days * (100 * getAccInt())) + getAccAmount();
         return  amount +" Your Checking account will have this amount in " + days;
    }
}
