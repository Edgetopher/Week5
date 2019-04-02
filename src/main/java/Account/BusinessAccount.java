package Account;

public class BusinessAccount extends Account {
    private String businessName;

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public BusinessAccount(int accNumber, String accStatus, int accAmount, double accInt, String businessName) {
        super(accNumber, accStatus, accAmount, accInt);
        this.businessName = businessName;

    }

    public String intRate(int days) {
        double amount =  (days * (100 * getAccInt())) + getAccAmount();
        return  amount +" Your  Business account: "+ businessName + "will have this amount in " + days;
    }

    @Override
    public String toString() {
        return super.toString() + "Business Name: " + businessName + "\n";
    }
}
