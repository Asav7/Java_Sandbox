package bankaccountapp;

/**
 * Created by Albert on 03.02.2018.
 */
public class Savings extends Account {
    // List properties specific to a Savings account
    private int safetyDepositBoxID;
    private int getSafetyDepositBoxKey;

    // Constructor to initialize Savings account properties
    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        this.accountNumber = "1" + this.accountNumber;
        setSafetyDepositBox();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() - 0.25;
    }

    // List any methods specific to the savings account
    private void setSafetyDepositBox() {
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        getSafetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }

    public void showInfo() {
        System.out.println("ACCOUNT TYPE: Savings");
        super.showInfo();
        System.out.println(
                "Your Savings Account Features: " +
                        "\n  Safety Deposit Box ID: " + safetyDepositBoxID +
                        "\n  Safety Deposit Box Key: " + getSafetyDepositBoxKey
        );
    }
}
