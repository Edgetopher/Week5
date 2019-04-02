package Account;

public class main {
    public static void main(String[] args) {


        CheckingAccount chris = new CheckingAccount(356, "Trusted", 3000, .06);
        SavingsAccount chrissav = new SavingsAccount(400, "Inactive", 50, .1);
        BusinessAccount jpMorgan = new BusinessAccount(1, "Royalty", 65000, .05,"J.P Morgan Chase");

        System.out.println(chris.deposit(2000));
        System.out.println(chris.withdraw(1));
        System.out.println(chris.withdraw(6000));
        System.out.println(chris + "\n" + chrissav + "\n" +jpMorgan);
    }
}
