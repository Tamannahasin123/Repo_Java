package Class6;

public class String_Contcept {

    public class String_Concept_charAt {

        public static void main(String[] args) {

            /**
             *
             * To find the character present at a particular given index
             * method: charAt() // if in-case we made mistake and write down wrong code (indexvalue is not valid) charAt() will give us EXCEPTION
             * return type:  char
             *
             * cityName = "neW yOrK";
             *
             * n e W   y O r K
             * 0 1 2 3 4 5 6 7
             *
             ** if given index is within the index-range, it will return the char at given index
             * else, it will throw Exception (StringIndexOutOfBoundsException)
             *
             */
            String cityName = "neW yOrK";
            char charAtIndex4 = cityName.charAt(4);
            System.out.println("In '" + cityName + "' char at index-4: " + charAtIndex4);
            //In 'neW yOrK' char at index-4: y

            // char charAtIndex1 = cityName.charAt(10);
            // System.out.println("In '" + cityName + "' char at index-1: " +charAtIndex1);
        /* error will pop up on console as below
               Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 10
               at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
               at java.base/java.lang.String.charAt(String.java:711)
               at Class4.String_Concept.main(String_Concept.java:214)
         */

            /**
             * task:  write a code to print the char present at last index of the string
             * String str = "Hello World"
             */
        /*
        use Pseudo code
        1. If the code change from "Hello World" to only "Hello" - Need to find out length of str
        2. using length value, find lastIndex value (len - 1)
        3. use last Index with charAt
         */
            String str = "Hello World";
            int strLength = str.length();
            int lastIndex = strLength -1;
            System.out.println(str.charAt(10)); // answer : d
            System.out.println(str.charAt(lastIndex)); // answer : d
            System.out.println(str.charAt(str.length()-1)); // answer : d
        }
    }
}
