package MyPackage;

public class Homework5 {
    public static void main(String[] args) {

        /**
         * Create variable to store studentScore and maxScore
         * Based on the percentage, display grade to student
         *
         * Grade A: 91-100
         * Grade B: 81-90.99
         * Grade C: 71-80.99
         * Grade D: 61-70.99
         * Grade E: 51-60.99
         * Grade F: less than or equal to 50.99
         */
        int studentScore = 80;
        int maxScore = 150;
        // calculate percentage -- 80*100/150
        // print result like;
        // Your percentage: XX.yy and your Grade is Z
        // studentScore greater then > 0 and less or equal to maxScore <=

        if (studentScore > 0 && studentScore <= maxScore) ;

        double percentage = studentScore * 100.0 / maxScore;

        if (percentage >= 95) {
            System.out.println("Your percentage is: " + percentage + " and your Grade is : A");
        } else if (percentage >= 87) {
            System.out.println("Your percentage is: " + percentage + " and your Grade is : B");
        } else if (percentage >= 74) {
            System.out.println("Your percentage is: " + percentage + " and your Grade is : C");
        } else if (percentage >= 68) {
            System.out.println("Your percentage is: " + percentage + " and your Grade is : D");
        } else if (percentage >= 56) {
            System.out.println("Your percentage is: " + percentage + " and your Grade is : E");
        } else {
            System.out.println("Invalid student score entered: " + studentScore);
        }

        /**
         * store value in an int variable
         * if number is divisible by 3, print "divisible by 3"
         * if number is divisible by 5, print "divisible by 5"
         * if number is divisible by 3 and 5, print "divisible by both"
         * if not divisible by 3 and 5, print the number
         */
        int num2 = 16;
        if (num2%3 == 0){
            System.out.println(num2%3 + "divisible by 3");
         } else if (num2%5 == 0){
             System.out.println(num2%5 + "divisible by 5");

        } else if (num2%3 == 0 || num2%5 == 0) {
            System.out.println((num2 % 3 == 0 || num2 % 5 == 0) + "divisible by both");
        }  System.out.print(num2%3 == 0 || num2%5 == 0);       }

    }

