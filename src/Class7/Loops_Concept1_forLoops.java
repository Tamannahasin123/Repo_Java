package Class7;

public class Loops_Concept1 {

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
         * String threeWordSentence = "hApPy nEW yeAr"
         * // code
         * String threeWordSentence = "Happy New Year"
         */
        /*

            String threeWordSentence = "hApPy nEW yeAr"

            1. apply split method on threeWordSentence (String[] words) --> ["hApPy", "nEW", "yeAr"]


            words[0] --> represents the value at index-0 in words[] ("hApPy")
            String firstWord = words[0].subString(0,1).toUppercase() + words[0].subString(1).toLowercase()      // Happy
            String secondWord = words[1].subString(0,1).toUppercase() + words[1].subString(1).toLowercase()     // New
            String thirdWord = words[2].subString(0,1).toUppercase() + words[2].subString(1).toLowercase()      // Year

            String result = "";

            result = result + " " + words[0].subString(0,1).toUppercase() + words[0].subString(1).toLowercase();
                // result = " Happy"

            result = result  + " " + words[1].subString(0,1).toUppercase() + words[1].subString(1).toLowercase();
                // result = " Happy New"

            result = result  + " " + words[2].subString(0,1).toUppercase() + words[2].subString(1).toLowercase();
                // result = " Happy New Year"

            result = result.trim()
                //  result = "Happy New Year"


            int i=0
            words[i].subString(0,1).toUppercase() + words[i].subString(1).toLowercase()


            threeWordSentence = firstWord + " " + secondWord + " " + thirdWord  // Happy New Year

            String threeWordSentence = "Happy New Year"

         */


        String[] names = {"Happy", "Peace", "Grow", "Learn"};
        // length=4 , lastIndex=3
        // print the values from array like below
        /*
            Happy   // sout(names[0])   initial value -> 0
            Peace   // sout(names[1])   rate of change -> +1
            Grow    // sout(names[2])
            Learn   // sout(names[3])   last value -> length-1
         */

        /**
         * Syntax for-loop:
         *
         * for (initialization ; condition ; increment) {
         *      // code inside
         *      // for-loop
         * }
         *
         */
        int namesLength = names.length;
        for (int i = 0; i <= namesLength - 1; i++) {
            System.out.println(names[i]);
        }
        System.out.println("outside for-loop");
        /*
            1. initialization ( int i = 0 )
            2. evaluates the condition with present value of i ( i <= namesLength-1 )  -> ( 0 <= 3 )
            3. If the condition results into true
                    java enters in the for-loop
                    sout(names[i])  -> sout(names[0])   --> sout("Happy") --> Happy
                    while exiting the for-loop, java updates the value of i
               else
                    java won't enter in the for-loop and move ahead in the code file
            4. evaluates the condition with present value of i ( i <= namesLength-1 )  -> ( 1 <= 3 )
            5. If the condition results into true
                    java enters in the for-loop
                    sout(names[i])  -> sout(names[1])   --> sout("Peace") --> Peace
                    while exiting the for-loop, java updates the value of i
               else
                    java won't enter in the for-loop and move ahead in the code file
            6. evaluates the condition with present value of i ( i <= namesLength-1 )  -> ( 2 <= 3 )
            7. If the condition results into true
                    java enters in the for-loop
                    sout(names[i])  -> sout(names[2])   --> sout("Grow") --> Grow
                    while exiting the for-loop, java updates the value of i
               else
                    java won't enter in the for-loop and move ahead in the code file
            8. evaluates the condition with present value of i ( i <= namesLength-1 )  -> ( 3 <= 3 )
            9. If the condition results into true
                    java enters in the for-loop
                    sout(names[i])  -> sout(names[3])   --> sout("Learn") --> Learn
                    while exiting the for-loop, java updates the value of i
               else
                    java won't enter in the for-loop and move ahead in the code file
            8. evaluates the condition with present value of i ( i <= namesLength-1 )  -> ( 4 <= 3 )
            9. If the condition results into true
                    //
               else
                    java won't enter in the for-loop and move ahead in the code file
         */

        System.out.println("\n\n");
        String[] namesArray = {"Happy", "Peace", "Grow", "Learn", "slEEp", "outside", "Hello", "Bye"};

        // print the words from namesArray- array in reverse order

        /*
            Bye         // namesArray[length - 1]           // int i=1 ; i <= length ; i++
            Hello       // namesArray[length - 2]
            outside     // namesArray[length - 3]
            slEEp       // namesArray[length - 4]
            Learn       // namesArray[length - 5]
            Grow        // namesArray[length - 6]
            Peace       // namesArray[length - 7]
            Happy       // namesArray[length - length]


            namesArray[length - 1]
            namesArray[length - 2]

            length = 8
            Bye         // namesArray[length-1]           // int i=length-1 ; i >= 0 ; i--   i=7 (length-1)
            Hello       // namesArray[length-1-1]        // i = length-1 - 1 ;               7-1 (length-1-1)
            outside     // namesArray[length-1-2]                                            7-2
            slEEp       // namesArray[length-1-3]                                            7-3
            Learn       // namesArray[3]                                            7-4
            Grow        // namesArray[2]                                            7-5
            Peace       // namesArray[1]
            Happy       // namesArray[0]     // -(length-1) = -length +1


            namesArray[length - 1]
            namesArray[length - 2]
         */

        int length = namesArray.length;

        for (int i = 1; i <= length; i++) {
            System.out.println(namesArray[length - i]);
        }
        System.out.println("\n");
        for (int i = length - 1; i >= 0; i--) {
            System.out.println(namesArray[i]);
        }

        // Print "Hello World" 5 times.
        /*
            Hello World
            Hello World
            Hello World
            Hello World
            Hello World

         */
//
//        System.out.println("Hello World");  // i = 1
//        System.out.println("Hello World");  // i++
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");  // i = 5    i <= 5


        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello World");
        }

        String[] words = {"Happy", "Peace", "Grow", "Learn", "sleep"};

        /**
         * print words present on even index in the given array
         *
         * Happy    // sout(words[0])   int i = 0 ; i <= words.length-1  ; i+=2
         * Grow     // sout(words[2])
         * sleep    // sout(words[4])
         * teach    // sout(words[6])
         * ..
         * ..
         */
        System.out.println("\n");
        for (int i = 0; i <= words.length - 1; i += 2) {      // i = i + 2
            System.out.println(words[i]);
        }

        System.out.println("\n");
        for (int i = 0; i <= words.length - 1; i++) {      // i = i + 1     0,1,2,3,4....
            if (i % 2 == 0) {
                System.out.println(words[i]);
            }
        }

        String[] myWords = {"Happy", "Peace", "Grow", "LEARN", "slEEp", "outsid", "Hllo", "Bye"};
        /*
            Print the words which contains 'e' in it.
            Note: Pls ignore cases

            Peace
            LEARN
            slEEP
            outside
            Hello
            Bye

         */
        /*
            int i=0 ; i <= length-1 ; i++

            if (myWords[0].toLowercase().contains("e")) {
                sout(myWords[0])
            }

            if (myWords[1].toLowercase().contains("e")) {
                sout(myWords[1])
            }

            if (myWords[1].toLowercase().contains("e")) {
                sout(myWords[1])
            }
            ...
            ...

         */
        System.out.println("\n");
        for (int i = 0; i < myWords.length; i++) {
            if (myWords[i].toLowerCase().contains("e")) {
                System.out.println(myWords[i]);
            }
        }

    }
}
