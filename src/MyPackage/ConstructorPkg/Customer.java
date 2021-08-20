package MyPackage.ConstructorPkg;

public class Customer {

    private String name="", cityname="";
    private int ssn=0, phone=0;
    private int BankAccount = 0;
    /**
     * Every Customer can have maximum 5 bank account with Bank.
     */


    /**
     * 1. createProfile
     *      name
     *      ssn
     *      phone
     *      cityName (optional)
     */
    public void proFile(String eName,int eSsn, int ePhone){
        name = eName;
        ssn = eSsn;
        phone = ePhone;
    }

    public void proFile(String eName,int eSsn, int ePhone,String eCityName) {
        name = eName;
        ssn = eSsn;
        phone = ePhone;
        cityname = eCityName;
    }

    /**
     * 2. updateProfile()
     *      customer should send fieldName and newValue
     */
    public void updateProfile(String newName, int newSsn, int newPhone, String newCityName) {
        name = newName;
        ssn = newSsn;
        phone = newPhone;
        cityname = newCityName;
    }


    /**
     * 3. showProfile
     *      Name:
     *      Phone number:
     *      (if provided) CityName:
     *      Total number of Accounts:
     */
    public void showProfile(){
        System.out.println("Name : " +  name);
        System.out.println("Phone Number : " +  phone);
        if(cityname.length()>0){
            System.out.println("City : " + cityname);
        }
    }

    /**
     * openAnAccount
     *      pls use openAccount method from Accounts class
     */
    public static void main(String[] args) {
        Account s1 = new Account();
        s1.Account("Checking", 100, 1234);

        Account s2 = new Account();
        s2.Account("Saving", 200, 5678);

        Account s3 = new Account();
        s3.Account("Checking", 200, 9012);

        Account s4 = new Account();
        s4.Account("Saving", 2000, 3456);

        Account s5 = new Account();
        s5.Account("Saving", 100, 1234);

        /**
         * makeDeposit
         *      pls use deposit method from Accounts class
         */
        s1.deposit(1234, 100);
        s2.deposit(5678, 200);
        s3.deposit(9012, 200);
        s4.deposit(3456, 2000);
        s5.deposit(1234, 100);


        /**
         * makeWithdraw
         *  pls use withdraw method from Accounts class
         */
        s1.withdraw(1234, 45);
        s2.withdraw(5678, 55);
        s3.withdraw(9012, 60);
        s4.withdraw(3456, 70);
        s5.withdraw(1234, 40);

        /**
         * getBankBalance
         *      with 1 argument
         *      pls use showBalance method from Accounts class
         *
         * Account Number: 1234
         * Balance $ 100.00
         *
         */
        s1.showBalance();
        s2.showBalance();
        s3.showBalance();
        s4.showBalance();
        s5.showBalance();

        /**
         * getBankBalance
         *      with no arguments
         *      pls use showBalance method to print balance of
         *      all Account with the Customer
         *
         * Total number of Accounts: 5
         *
         * Account Number: 1234
         * Balance $100.00
         *
         * Account Number: 5678
         * Balance $200.00
         *
         * Account Number: 9012
         * Balance $200.00
         *
         * Account Number: 3456
         * Balance $2000.00
         *
         */
        int AcctNum = 0;
        double Balance = 0;
        //System.out.println("Account Number :'" + AcctNum +
               // "\nBalance : $" + Balance);

    }

}

