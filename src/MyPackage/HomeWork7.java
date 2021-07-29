package MyPackage;

    public class HomeWork7 {
        public static void main(String[] args) {

            // Due date: July 28

            /**
             * Task 1:
             * Find out if the value stored in word variable is palindrome.
             * And, store the result in "isPalindrome" variable
             * --> palindrome: string which reads the same in reverse
             * eg:
             * level --> level          (palindrome)
             * eye  --> eye             (palindrome)
             * head --> daeh            (not palindrome)
             * racecar --> racecar      (palindrome)
             */
            String task1Word = "raceCar";
            String wordArray[] = task1Word.split(" ");
            String reverseWord = "";

            String wordBack = "raceCar";
            String[] word = task1Word.split("");
            String isPalindrome = "";

            for (int i = 0; i >= word.length - 1; i--) {
                isPalindrome = isPalindrome + word[i];
            }
            boolean isPelindrome = task1Word.equalsIgnoreCase(isPalindrome);
            System.out.println(task1Word + " is palindrome: " + isPalindrome); // raceCar is palindrome:

            /**
             * Task2:
             * Find if the value stored in num variable is a prime number or not.
             * And, store the final result in "isPrime" variable
             * --> prime number -> number which is ONLY divisible by 1 and itself.
             * eg:
             * 5 -> prime
             * 7 -> prime
             * 10 -> not a prime
             */

            boolean isPrime;
            int num = 5;
            for (int i = 1; i <= num; i++)

                if (num % i == 0 && num % i == 2) {
                    isPrime = true;
                    System.out.println(num + " is not a prime number!");
                    break;
                } else {
                    isPrime = false;
                    System.out.println(num + " is a prime number!"); // 5 is a prime number!
                }


            /**
             * Task3:
             * Write code to reverse a string
             *
             * "happy holidays"
             *
             * "syadiloh yppah"
             *
             */
            String task3String = "happy holidays";

            //convert string to charater array
            char[] task3StringArr = task3String.toCharArray();

            //create a new array which will contain characters in reversed order
            char[] revArr = new char[task3StringArr.length];

            for (int i = task3StringArr.length, r = 0; i > 0; i--, r++) {
                revArr[r] = task3StringArr[i - 1];

            }
            String revStr = new String(revArr);
            System.out.println("reversed string :" + revStr); // reversed string :syadiloh yppah

            /**
             * Task4:
             * Count the number of the vowels (a,e,i,o,u) present in the given sentence.
             */


            String str = "hOW arE You My DEAr FRiEnd";
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == ' ') {
                    count++;
                }
            }
            System.out.print(count);  // 9
        }
    }
