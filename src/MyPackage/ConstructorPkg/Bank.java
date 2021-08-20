package MyPackage.ConstructorPkg;

public class Bank {

        public static void main(String[] args) {


            /**
             *
             * Due : Aug 22 2021
             *
             * Bank -> create Customer Object
             * customerObject we gonna run methods form Customer class
             * methods in Customer class will be using methods form Accounts class
             *
             */
            Customer s1 = new Customer();
                s1.proFile( "S1",222004000,678888889);
                s1.showProfile();

            Customer s2 = new Customer();
                s2.proFile("S2",6777777, 8888999,"GA");
                s2.showProfile();







        }


}
