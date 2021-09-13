package Class19;


    import java.text.ParseException;
    import java.text.SimpleDateFormat;
    import java.util.Calendar;
    import java.util.Date;

    public class Calendar_Class {
        public static void main(String[] args) {

            Calendar cal = Calendar.getInstance(); // always Calendar.getInstance
            // System.out.println(cal);

            /**
             * create Date object using Calendar instance/object
             */
            Date fromCal = cal.getTime(); // creating variable Date object
            System.out.println(fromCal);
            //go


            Date convertedDate = null;

            String dateText = "August 22 2020, 19:20:10";

            SimpleDateFormat df2 = new SimpleDateFormat("MMMM d yyyy, HH:mm:ss");

            try {
                convertedDate = df2.parse(dateText);
            } catch (ParseException e) {
                e.printStackTrace();
            }

            System.out.println("\n\nConverted Date -> " + convertedDate);

            /**
             * Create Calendar using Date
             */
            cal.setTime(convertedDate);
            System.out.println(cal);


            // add 37 days, 10 years and subtract 2 month to convertedDate

            cal.add(Calendar.DATE, 37);
            cal.add(Calendar.YEAR, 10);
            cal.add(Calendar.MONTH, -2);
            // System.out.println(cal);


            Date afterAdding37Days = cal.getTime();

            System.out.println("afterAdding37Days -> " + afterAdding37Days);



        /*
            Checkin Date : current Date

            Checkout Date : 7 days from current Date
         */

            Date checkIn = new Date();

            System.out.println("\n\n\nCheckin date -> " + checkIn);

            // creating Calendar using Date
            Calendar calNow = Calendar.getInstance();
            calNow.setTime(checkIn);

            calNow.add(Calendar.DAY_OF_MONTH, 7);

            Date checkOut = calNow.getTime();

            System.out.println("Checkout Date -> " + checkOut);






        }

}
