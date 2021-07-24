package Class4;

public class HomeWork4 {

    public static void main (String[] args) {

        //Question 1

        /**
         * String threeWordSentence = hApPy nEW yeAr"
         * // code
         * String threeWordSentence = "Happy New Year"
         */
        String threeWordSentence_1 ="hApPy nEW yeAr";
        // code

        // Split method
        String[] words = {"hApPy","nEW", "yeAr"};
        // word[index0]= hApPy, subString (0,1) input is begin index 0 and end in 0 too - h
        // word[index1]= hApPy, subString (1) input is begin from index 1 and end to entire word - ApPy
        // need to make it toLowerCase

        String firstWord= words[0].substring(0,1).toUpperCase() + words[0].substring(1).toLowerCase();
        String secondWord = words[1].substring(0,1).toUpperCase() + words[1].substring(1).toLowerCase();
        String thirdWord = words[2].substring(0,1).toUpperCase() + words[2].substring(1).toLowerCase();

        System.out.println("before code : " + threeWordSentence_1); // hApPy nEW yeAr

        String threeWordSentence = firstWord + " " + secondWord + " " + thirdWord;
        System.out.println("After code : " + threeWordSentence); //  Happy New Year

        // Question - 2;
        /**
         *
         * create the abbreviation  // Happy New year is HNY
         *
         */
        String threeWordSentence_2 = "very gOOD MorNING";
        String abbr = "";
        // convert to uppercase. use charAt and pull only first letter of VGM

        // code
        String threeWordSentence_2InUppercase = threeWordSentence_2.toUpperCase();
        System.out.println("\nthreeWordSentence in Uppercase : " + threeWordSentence_2InUppercase); // VERY GOOD MORNING


        char charAtIndex0 = threeWordSentence_2InUppercase.charAt(0);
        char charAtIndex5 = threeWordSentence_2InUppercase.charAt(5);
        char charAtIndex10 = threeWordSentence_2InUppercase.charAt(10);

        String firstLetter = "V";
        String secondLetter = "G";
        String thirdLetter = "M";
        System.out.println("Abbreviation for '" + threeWordSentence_2 + "' is : " + firstLetter + secondLetter + thirdLetter); // VGM
        System.out.println("Abbreviation for '" + threeWordSentence_2 + "' is : " + charAtIndex0 + charAtIndex5 + charAtIndex10);  // VGM

        //Question - 3
        /**
         *
         * print the number of words in the sentence
         */
        String sentence_3 = "We all are here to learn programming and testing";
        String word1 ="We";
        String word2 ="all";
        String word3 ="are";
        String word4 ="here";
        String word5 ="to";
        String word6 ="learn";
        String word7 ="programming";
        String word8 ="and";
        String word9 ="testing";

        String[] numOfWords = new String[9];
        int numOfWords_Length = numOfWords.length;
        System.out.println("Length of numOfWords array : " + numOfWords_Length);  //  Length of numOfWords array : 9










    }




}
