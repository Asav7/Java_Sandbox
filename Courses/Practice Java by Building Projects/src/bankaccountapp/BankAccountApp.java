package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Albert on 03.02.2018.
 */
public class BankAccountApp {
    public static void main(String[] args) {

        List<Account> accounts = new LinkedList<Account>();

        // Read a CSV File then create ne accounts based on that data
        String file = "NewBankAccounts.csv";
        List<String[]> newAccountHolders = utilities.CSV.read(file);
        for (String[] accountHolder : newAccountHolders) {
            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accontType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            if (accontType.equals("Savings")) {
                accounts.add(new Savings(name, sSN, initDeposit));
            }
            else if (accontType.equals("Checking")) {
                accounts.add(new Checking(name, sSN, initDeposit));
            }
            else {
                System.out.println("ERROR: ACCOUNT TYPE NOT RECOGNIZED");
            }
        }

        for (Account acc : accounts) {
            System.out.println("\n****************");
            acc.showInfo();
        }


    }
}
