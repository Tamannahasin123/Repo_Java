package MyPackage;

import com.sun.jdi.connect.Connector;

public class Homework3 {

    public static void main(String[] args) {

        // Question - 1
        String str = "hello dear, how are you?";
                int result_1 = 0;
                int strLength = str.length();
         System.out.println("\nLength of " + str + " is : " + strLength); // 24

        /**
         * Assign result_1 as 100 if the length of sentence_1 is 10 or greater
         * else assign result_1 as 15
         *
         * use: Ternary operator
         *
          */
        System.out.println("result_1 = " + result_1);

        //Question -2

        String sentence_2 = "We all ARe GOod ProgrAMer";
        System.out.println(sentence_2.toLowerCase().replace("r",  "F"));


        /**
         * replace all 'R/r' with 'F'
         */

          // "We all AFe GOod ProgFAMmeF";


         // Question - 3
        String sentence_3 = "ABC Networks";
        String result_3 = "";

        /**
         * 1. Display/print length of your sentence_3
         * 2.does sentence_3 starts with "a" (ignore cases)
         * 3. does sentence_3 ends with "K" (ignore cases)
         * 4.Assign result_3 as "Media" if sentence_3 starts with 'a' (ignore cases)
         *      else assign "Entertainment"
         *      Print the result_3 in console
         */

        int sentence_3Length = sentence_3.length();
        System.out.println("\nLength of " + sentence_3 + " is : " + sentence_3Length);

        boolean isStartsWith_a = sentence_3.startsWith("a");
        System.out.println("\nIs '" + sentence_3 + "' starts with 'a'? : "+ isStartsWith_a);

        boolean isendsWith_K = sentence_3.endsWith("K");
        System.out.println("\nIs '" + sentence_3 + "' ends with 'K'? : "+ isendsWith_K);

        if(sentence_3.startsWith("A")) {
            result_3 = "Media";
        } else {
            result_3 = "Entertainment";
        }
        System.out.println(result_3);
    }
}
