package Class19;

    import com.sun.xml.internal.ws.util.xml.CDATA;
    import sun.java2d.pipe.SpanShapeRenderer;

    import java.text.ParseException;
    import java.text.SimpleDateFormat;
    import java.util.Date;

    public class Date_Class {
        public static void main(String[] args) {

            // Date
            Date now = new Date(); // always have to create object

            System.out.println(now); // will print out Thu Sep 02 19:28:30 EDT 2021

            // print current date in format like, MMM DD YYYY
            // Sep 02 2021

            // print current date in format like, MM/DD/YYYY
            // 09/02/2021

            // https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html
            SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss: a"); // this is object
            //09/02/2021 07:41:04 PM

            df.format(now); // below is giving it to String format

            String nowFormat = df.format(now); // Because of this format we can print out what ever we write on SimpleDateFormat df
            System.out.println(nowFormat);

            /**
             * MM : month in number
             * MMM : month in abbreviation
             * MMMM : month name in full name
             */

            /**
             * current date -> 2
             * d -> 2
             * dd -> 02
             *
             * current date -> 22
             * d -> 22
             * dd -> 22
             */

            // Verify article posted with correct date stamp
            // post an article
            // capture the date on posted article (String -> "September 2, 2021")
            // Date now = new Date();
            // format now into MMMM d, yyyy (String -> "September 2, 2021")
            // capturedDate must be equal to formattedDate -> Pass else Fail ********

            /**
             * if the current date is less or equal to 15
             *      print "In first half of the month"
             * else
             *      print "In second half of the month"
             *
             */
            Date currDate = new Date();     // Thu Sept 02 2021 20 09 00

            SimpleDateFormat df1 = new SimpleDateFormat("d");

            String currentDate = df1.format(currDate);  // "2"

            // "2" --> 2
            Integer dateInteger = Integer.valueOf(currentDate);

            if (dateInteger <= 15) {
                System.out.println("In first half of the month");
            } else {
                System.out.println("In second half of the month");
            }

            /**
             * Convert String into Date object
             *
             */
            Date convertedDate = null;

            String dateText = "August 22 2020, 19:20:10";

            SimpleDateFormat df2 = new SimpleDateFormat("MMMM d yyyy, HH:mm:ss"); //sss

            try {
                convertedDate = df2.parse(dateText); // parse is String Date // whenever we will have exception, we need to do try/catch from highlighted
            } catch (ParseException e) {
                e.printStackTrace();
            }

            System.out.println("\n\nConverted Date -> " + convertedDate);
            System.out.println("now Date -> " + now);

            // is now equal to convertedDate
            boolean isNowEqualsConvertedDate = now.equals(convertedDate);
            System.out.println("\nis now equal to convertedDate : " + isNowEqualsConvertedDate);

            // is now comes after convertedDate
            boolean isNowAfterConvertedDate = now.after(convertedDate);
            System.out.println("is now come after convertedDate : " + isNowAfterConvertedDate);

            // is now comes before convertedDate
            boolean isNowBeforeConvertedDate = now.before(convertedDate);
            System.out.println("is now come before convertedDate : " + isNowBeforeConvertedDate);











        }

}
