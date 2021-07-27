package MyPackage;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Homework6 {
    public static void main(String[] args) {


        // Due: Sunday July 25


        /**
         * String sentence = "happy new year TO You DeaR"
         * // code - split / subString method
         * String threeWordSentence = "Happy New Year To You Dear"
         *
         * For hint refer: Loops_Concept , Line#34
         */
        String Sentence = "happy new year TO You DeaR";
        String[] splitWords = Sentence.split(" ");
        //System.out.println(Arrays.toString(splitWords));
        Sentence = " ";
        Sentence = Sentence.trim();
        for (int i=0; i<splitWords.length; i++) {
            Sentence = Sentence + splitWords[i].substring(0, 1).toUpperCase()+splitWords[i].substring(1).toLowerCase() + " ";
        }
        System.out.println(Sentence); // Happy New Year To You Dear

        /**
         * create the abbreviation  // HNY
         * code - UpperCase and charAt
         */
        String threeWordSentence_2 = "very gOOD MorNING to You dear";
        String[] splitWords_1 = threeWordSentence_2.split(" ");
        System.out.println(Arrays.toString(splitWords_1));

        String firstLetter = "V";
        String secondLetter = "G";
        String thirdLetter = "M";
        String forthLetter = "T";
        String fifthLetter = "Y";
        String SixthLetter = "D";
        //threeWordSentence_2 = " ";

        String abbr = firstLetter + secondLetter + thirdLetter + forthLetter + fifthLetter + SixthLetter;
        for (int i=0; i >splitWords_1[i].length(); i++){
            threeWordSentence_2 = threeWordSentence_2 + splitWords_1[i].substring(0, 1).toUpperCase();
        }

        System.out.println("Abbreviation for '" + threeWordSentence_2 + "' is : " + abbr);
        // Abbreviation for 'very gOOD MorNING to You dear' is : VGMTYD


        /**
         * Create variable to store studentScore and maxScore;
         * Based on the percentage, display grade to student:
         * Grade A: 91-100
         * Grade B: 81-90.99
         * Grade C: 71-80.99
         * Grade D: 61-70.99
         * Grade E: 51-60.99
         * Grade F: less than or equal to 50.99
         *
         * student got grade A, gets full scholarship for next year
         *
         * student got better than grade D (i.e. B or C), get half scholarship for next year
         *
         * otherwise no scholarship for next year
         *
         *
         * Sample output:
         *  Your percentage: XX.yy and your Grade is: Z
         *  Based on your grade(Z), you get XXXX scholarship for next year
         *
         */
        int studentScore = 120;
        int maxScore = 150;
        double percentage = studentScore * 100.0 / maxScore;
        char yourGrade = 'a';
        String scholershipAmt = "full half no invalid";
        String[] splitWords_2 = scholershipAmt.split(" ");
        if (studentScore > 0 && studentScore <= maxScore) {

            if (percentage >= 92) {
                yourGrade = 'A';
                scholershipAmt = "full";
            } else if (percentage >= 85) {
                yourGrade = 'B';
                scholershipAmt = "half";
            } else if (percentage >= 76) {
                yourGrade = 'C';
                scholershipAmt = "half";
            } else if (percentage >= 65) {
                yourGrade = 'D';
                scholershipAmt = "no";
            } else if (percentage >= 52) {
                yourGrade = 'E';
                scholershipAmt = "no";
            } else {
                yourGrade = 'F';
                scholershipAmt = "no";
            }
            System.out.println("Your percentage is: " + percentage + " and your Grade is: " + yourGrade);
            // Your percentage is: 80.0 and your Grade is: C

            switch (yourGrade) {
                case 'A':
                    scholershipAmt = "full";
                    break;
                case 'B':
                case 'C':
                    scholershipAmt = "half";
                    break;
                case 'D':
                case 'E':
                case 'F':
                    scholershipAmt = "no";
                    break;
                default:
                    scholershipAmt = "invalid";
            }
            System.out.println("Based on students grade (" + yourGrade + "), they will get " + scholershipAmt + " scholarship for next year");
            // Based on students grade (C), they will get half scholarship for next year
            } else {
                System.out.println("invald student score entered : " + scholershipAmt);
            }
         {
           /**
             * Create an array and store 5 int-values.
             * Print the average of numbers in array.
             *
             * sum of values / number of values
             *
             * {10, 20, 30, 40, 50}
             * (10+20+30+40+50)/5
             *
             */
           int[] numbers = {10, 20, 30, 40, 50};
           int sum = 0;
           for (int i=0; i <= numbers.length-1 ; i++) {
               sum = sum + numbers[i];
           }
           int average = sum / numbers.length;
           System.out.println(average);

            /**
             *
             * String[] names = {"john", "happy", "peACe", "jOy", "lui", "harry"}
             * String nameToSearch = "faith";
             *
             * if name found, Print "LUI is at position-5 in the array"
             * if name not found, print "king is not present in the array"
             *
             */
             String[] names = {"john", "happy", "faith", "peACe", "jOy", "lui", "harry"};
             String nameToSearch = "faith";

             for (int i=0; i <= names.length-1 ; i++) {
                 if (names[i] == nameToSearch) {
                     System.out.println("LUI is at position-5 in the array");
                 } else {
                     System.out.println("King is not present in the array");
                 }
             }

            /**
             *
             * String[] names = {"john", "happy", "peACe", "jOy", "LEarN", "Orange", "king kong", "iRON MAN"};
             * print the names from array if the name-length is >=5 and name contains 'o' or 'O'
             *
             */
             String[] names1 = {"john", "happy", "peACe", "jOy", "LEarN", "Orange", "king kong", "iRON MAN"};
             for (int i = 0; i <= names1.length-1; i++) {
                 if (names1[i].length() >= 5 && (names1[i].contains("o") || names1[i].contains("O"))) {
                     System.out.println(names1[i]);
                 }
             }

            /**
             * int[] numbers = {11, 22, 33, 44, 55, 98, 65};
             * String[] names = {"john", "happy", "peACe", "jOy", "LEarN", "joy", "laugh"};
             *
             * Limitation: both array must be of same length
             *
             * if the numbers-array has 33 in it,
             *      print the index at which 33 is present in numbers array
             *      And, print the name present at same index in names array.
             *
             */
             int[] num = {11, 22, 33, 44, 55, 98, 65};
             String[] names_2 = {"john", "happy", "peACe", "jOy", "LEarN", "joy", "laugh"};
             for (int i=0; i <=num.length-1; i++) {
                 if(num[i] == 33) {
                     int sameIndex = i;
                     System.out.println(sameIndex);
                     System.out.println(names_2[sameIndex]);
                 }
             }

        }
    }
    }
