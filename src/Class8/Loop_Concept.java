package Class8;

public class Loop_Concept {

        public static void main(String[] args) {

            /**
             * Loops:
             *      we use loops when we need to execute some code multiple times.
             *
             * 1. for loop
             * 2. Enhanced for loop
             * 3. while loop
             * 4. do-while loop
             *
             */

            /**
             * Enhanced for-loop
             *
             *      Conditions in which you have option to use Enhanced for-loop
             *      1. need to traverse an array (or similar datatype)
             *      and
             *      2. need to traverse the array one-by-one from index-0 to last-index
             *
             */

            String[] names = {"Happy", "Peace", "Grow", "Learn"};
        /*
            print the values from array like below
            Happy
            Peace
            Grow
            Learn
         */

            /**
             * Syntax of Enhanced for-loop
             *
             * for (datatype var : arrName) {
             *      // code inside the for loop
             * }
             *
             * for 1st loop --> var = arrName[0]
             * for 2nd loop --> var = arrName[1]
             * for 3rd loop --> var = arrName[2]
             * ....
             * * ...
             *          */

             for (String name : names) {
                System.out.println(name);
            }
            /*
             *             name = Happy
             *             sout(name)
             *
             *             name = Peace
             *             sout(name)
             *
             *          */

            /**
             *          * Enhanced for-loop
             *          *
             *          *      Conditions in which you have option to use Enhanced for-loop
             *          *      1. need to traverse an array (or similar datatype)
             *          *      and
             *          *      2. need to traverse the array one-by-one from index-0 to last-index
             *          *
             *          */
             int[] ssnNumbers = {4422, 2222, 3332, 4444, 5555, 6666, 7777};
                    /*
             *             1111
             *             2222
             *             3333
             *             4444
             *             5555
             *             6666
             *             7777
             *          */

             for (int ssn : ssnNumbers) {
             System.out.println(ssn);
             }

             for (int i = 0; i <= ssnNumbers.length - 1; i++) {
            System.out.println(ssnNumbers[i]);
             }

            /*
              print only even numbers ssn values

             4422
             2222
             3332
             4444
             6666
             */

        /*
            if (ssnNumbers[0]%2 == 0)
                sout(ssnNumbers[0])

             if (ssnNumbers[1]%2 == 0)
                sout(ssnNumbers[1])

             if (ssnNumbers[2]%2 == 0)
                sout(ssnNumbers[2])
             ....
             ....
             if (ssnNumbers[lastIndex]%2 == 0)
                sout(ssnNumbers[lastIndex])

            if (ssnNumbers[i]%2 == 0)       // i=0,1,2,3..lastIndex (int i=0 ; i <= lastIndex ; i++)
                sout(ssnNumbers[i])

         */
            for (int i = 0; i <= ssnNumbers.length - 1; i++) {
                if (ssnNumbers[i] % 2 == 0) {
                    System.out.println(ssnNumbers[i]);
                }
            }

            for (int ssn : ssnNumbers) {
                if (ssn % 2 == 0) {
                    System.out.println(ssn);
                }
            }

            /**
             * while loop
             *
             * initialization
             * while (condition) {
             *      // until the condition is true
             *      // run the code inside while
             *      increment/decrement operation
             * }
             *
             *
             */
            System.out.println("\n---- while loop starts -----\n");

            String[] names1 = {"Happy", "Peace", "Grow", "Learn"};
            // print the values from array like below
        /*
            Happy   // sout(names[0])   initial value -> 0
            Peace   // sout(names[1])   rate of change -> +1
            Grow    // sout(names[2])
            Learn   // sout(names[3])   last value -> length-1
         */

            int namesLength = names1.length;
            int i = 0;
            while (i <= namesLength - 1) {
                System.out.println(names[i]);
                i++;
            }

//        Converting below for-loop in while-loop
            for (int j = 100; j <= ssnNumbers.length - 1; j++) {
                if (ssnNumbers[j] % 2 == 0) {
                    System.out.println(ssnNumbers[j]);
                }
            }

            int k = 100;
            while (k <= ssnNumbers.length - 1) {
                if (ssnNumbers[k] % 2 == 0) {
                    System.out.println(ssnNumbers[k]);
                }
                k++;
            }

            System.out.println("\n---- do-while loop starts -----\n");

            /**
             *
             * do-while syntax:
             *
             * initialization
             * do {
             *      // until the condition is true
             *      // run the code
             *      // increment/decrement operation
             * } while (condition)
             *
             */
            // int[] ssnNumbers = {4422, 2222, 3332, 4444, 5555, 6666, 7777};
            int m = 100;
            do {
                System.out.println("Hello");
                m++;
            } while (m <= ssnNumbers.length - 1);

            /**
             * code inside the do-while loop will always run atleast one time
             */


            char[] letters = {'a', 'b', 'c', 'd', 'e'}; // len=5  v=0,1,2,3,4

        /*
            Print the result like below:

            Letter at index-0 : a
            Letter at index-1 : b

         */
            // while loop
            // for loop
            // do-while loop

            for (int v = 0; v < letters.length; v++) {
                System.out.println(letters[v]);
            }
        }

        }
