package MyPackage.ConstructorPkg;

public class Account {

    private String Type = "";
    private double deposit = 0;
    private int AcctNum = 0;
    private double amount = 0;
    private double Balance = 0;

    /**
     * 1. openAccount
     * Type (Savings, Checking)
     * starting deposit
     * user should get unique account number
     */

    public void Account(String eType,double edeposit,int eAcctNum ){
        Type = eType;
        deposit = edeposit;
        AcctNum = eAcctNum;
           }

    /**
     * 2. deposit
     * account number
     * amount
     */
    public void deposit(int iAcctNum, double iAmount) {
        AcctNum = iAcctNum;
        amount = iAmount;

    }

    /**
     * 3. withdraw
     * account number
     * amount
     */
    public void withdraw(int wAcctNum, double wAmount) {
        AcctNum = wAcctNum;
        amount = wAmount;

    }

    /**
     * 4. showBalance
     * account number
     * sout(balance)
     */
    public void showBalance() {
        Balance += Balance + amount;
        Balance -= Balance - amount;

        System.out.println("Account Number " + AcctNum +
                "\nBalance : $" + Balance);
    }
}



