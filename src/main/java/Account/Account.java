package Account;

public abstract class Account {
    private int accNumber;
    private String accStatus;
    private int accAmount;
    //accInt is a decimal, as Percentage.
    private double accInt;

    public int getAccAmount() {
        return accAmount;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public String getAccStatus() {
        return accStatus;
    }

    public double getAccInt() {
        return accInt;
    }

    public void setAccInt(double accInt) {
        this.accInt = accInt;
    }

    public void setAccAmount(int accAmount) {
        this.accAmount = accAmount;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public void setAccStatus(String accStatus) {
        this.accStatus = accStatus;
    }
    public String deposit(int amount){
        return amount + accAmount + " Is now your total amount! Thank you for banking with us!";
    }
    public String withdraw(int amount){
        String quote = "";
        if (accAmount > amount){
            quote = accAmount - amount + " You have withdrawn " + amount +"! Thank you for banking with us!";
        } else {
            quote = "You dont have enough money! Make sure you typed the right amount tou goofball!";
        } return quote;
    }

    public Account(int accNumber, String accStatus, int accAmount, double accInt) {
        this.accNumber = accNumber;
        this.accStatus = accStatus;
        this.accAmount = accAmount;
        this.accInt = accInt;
    }
    public abstract String intRate(int days);

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " Account Number: " + accNumber + "\n" +
                "Account Status: " + accStatus + "\n" +
                "Account Amount: " + accAmount + "\n" +
                "Account Interest rate: " + accInt + "\n";
    }
}
