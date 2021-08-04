package Class7;

public class Homework5_Discussion {

        public static void main(String[] args) {

            // Due: July 21

            /**
             * Create variable to store studentScore and maxScore;
             * Based on the percentage, display grade to student:
             * Grade A: 91-100
             * Grade B: 81-90.99
             * Grade C: 71-80.99
             * Grade D: 61-70.99
             * Grade E: 51-60.99
             * Grade F: less than or equal to 50.99
             */
            int studentScore = 1480;
            int maxScore = 150;
            // calculate percentage --> 80*100/150
            // print result like:
            //      Your percentage: XX.yy and your Grade is: Z

            // studentScore > 0 and studentScore <= maxScore

            if (studentScore > 0 && studentScore <= maxScore) {

                // calculate percentage and get grade
                double percentage = studentScore * 100.0 / maxScore;
                char yourGrade = 'a';
                String scholarshipAmt = "";

                if (percentage >= 91) {
                    yourGrade = 'A';
                    scholarshipAmt = "full";
                } else if (percentage >= 81) {
                    yourGrade = 'B';
                    scholarshipAmt = "half";
                } else if (percentage >= 71) {
                    yourGrade = 'C';
                    scholarshipAmt = "half";
                } else if (percentage >= 61) {
                    yourGrade = 'D';
                    scholarshipAmt = "no";
                } else if (percentage >= 51) {
                    yourGrade = 'E';
                    scholarshipAmt = "no";
                } else {
                    yourGrade = 'F';
                    scholarshipAmt = "no";
                }

                System.out.println("Your percentage is: " + percentage + " and your Grade is: " + yourGrade);
                System.out.println("Based on your grade(" + yourGrade + "), you get " + scholarshipAmt + " scholarship for next year");

            } else {
                System.out.println("Invalid student score entered : " + studentScore);
            }


            /**
             * store value in an int variable
             * if number is divisible by 3, print "divisible by 3"
             * if number is divisible by 5, print "divisible by 5"
             * if number is divisible by 3 and 5, print "divisible by both"
             * if not divisible by 3 or 5, print the number
             */
            int num2 = 2;
        }


        }
