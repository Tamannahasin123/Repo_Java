package Practic;
import java.util.*;


    public class CodeTest2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int userSpeed = scanner.nextInt();
            trafficTest(userSpeed);

            System.out.println();

            int[] array1 = new int[]{32, 14, 24, 98, 24, 56, 148, 24, 78, 24};
            System.out.println("Input array: " + Arrays.toString(array1));
            int key = 24;
            System.out.println("Input key: " + key);
            array1 = removeIntVar(array1, key);
            System.out.println("Output array: " + Arrays.toString(array1));

            System.out.println();

            int[] array2 = new int[]{3, 5, 1, 4, 2, 7};
            System.out.println("Input array: " + Arrays.toString(array2));
            System.out.println("Smallest positive integer in array: " + smallestPositiveInteger(array2));
        }

        public static void trafficTest(int userSpeed) {
            int speedLimit = 65;
            int licenseSuspensionCount = -1;
            int testLength = 0;
            for(int i = 0; i <= testLength; i++) {
                if (userSpeed > speedLimit + 5) {
                    licenseSuspensionCount++;
                    testLength++;
                    speedLimit = speedLimit + 5;
                } else if (userSpeed <= speedLimit + 5) {
                    i = i + 2;
                }
            }
            if (userSpeed == 70) {
                System.out.println("Thank you for driving within the speed limit.");
            } else if (licenseSuspensionCount < 12) {
                System.out.println(licenseSuspensionCount + " points");
            } else if (licenseSuspensionCount > 12) {
                System.out.println(licenseSuspensionCount + " points (License suspended).");
            }
        }

        public static int[] removeIntVar(int[] array, int num) {
            int[] newArray = {};
            int index = 0;
            for(int i =0; i < array.length; i++) {
                if (array[i] != num) {
                    array[index++] = array[i];
                }
            }
            return Arrays.copyOf(array, index);
        }

        public static int smallestPositiveInteger(int[] a) {

            HashSet<Integer> hashSet = new HashSet<Integer>();
            int x = 1;

            for (int i = 0 ; i < a.length; i++) {
                hashSet.add(a[i]);
            }

            while (hashSet.contains(x)) {
                x++;
            }

            return x;
        }
    }


    /**
     * Question 1:
     * Scenario: Traffic ticketing system
     * Write a method, that will print (not return) the points to be charged against
     * the license for over speeding.
     *
     *    1. Speed Limit = 70
     *    2. Every 5 miles over the speed limit will add 1 point
     *    3. If user speed is such that system shows 12 points for a speed
     *      then print, license is suspended
     *
     *  Example:
     *      user speed = 74 ; 0 points
     *      user speed = 78 ; 1 points  // 70-75(1) 75-78(0) = 1
     *      user speed = 88 ; 3 points  // 70-75(1) 75-80(1) 80-85(1) 85-88(0) = 3
     *      user speed = 178 ; 21 points (License suspended).
     *      user speed = 70 ; Thank you for driving within the speed limit.
     *
     */


    /**
     * Question 2:
     * Create a method to return an int-array
     * after removing a given int-value from a given int array.
     *
     * Input array: {32, 14, 24, 98, 24, 56, 148, 24, 78, 24}    Input Number: 24
     * Returned array: {32, 14, 98, 56, 148, 78}
     *
     * Input array:     {1, 2, 4, 3, 1, 6, 1}    Input Number: 11
     * Returned Array:  {1, 2, 4, 3, 1, 6, 1}
     */

    /**
     * Question 3:
     * Create a method to return missing smallest positive integer (greater than 0) from given int-array.
     *
     * Example:
     *  For array : {3, 5, 1, 4, 2, 7}
     *  Method should return : 6
     *
     *  For array : {2, 5, -1, 0, 6}
     *  Method should return : 1
     *
     *  For array : {0, 5, -1, 1, 2, 5, 3, 7, 1, 2}
     *  Method should return : 4
     *
     *  For array : {-2, -5, -1, -10, -6}
     *  Method should return : 1
     *
     */



