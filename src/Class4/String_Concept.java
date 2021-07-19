package Class4;

public class String_Concept{

    public static void main (String[] args) {

        /**
         *
         * String - Non-Primitive datatype
         *      can store single or multiple characters.
         *      To store the value as String, value must be within double-quotes "".
         *
         */
        String myWords = "Happy Peace";
        System.out.println("My words are : " + myWords); // My words are : Happy Peace

        String singles = (" a  b  c  d  acd aa i");
        String info = "Value in singles variable --";
        int num = 10;
        System.out.println(info + num + singles); // Value in singles variable --10 a  b  c  d  acd aa i

        String firstLetter ="A";
        //myWords = "Happy Peace"
        myWords = myWords + " Laugh grow"; // Happy Peace Laugh grow - to create this have to have "space Laugh grow"
        System.out.println(myWords);

        /**
         * String have length
         * Length with Index number
         // String cityName = "neW yOrK";
         *
         * To find the length of a given String
         * Method: length()
         *
         * n e W   y O r K
         * 0 1 2 3 4 5 6 7
         *
         * startIndex = 0
         * lastIndex = 7
         * length = 8
         *
         * Index is ALWAYS int
         * last Index = length -1
         */
        String cityName = "neW yOrK";
        int cityNameLength = cityName.length();
        System.out.println("\nLength of '" + cityName + "' is : " + cityNameLength); // Length of 'neW yOrK' is : 8

        /**
         *
         * To convert the String into all lowercase
         * Method: toLowercase()
         *
         * This method is NOT going to change the original value
         * It will convert the value in lowercase, and return the result to user
         */

        //String cityName = "neW yOrK";
        String cityNameInLowercase = cityName.toLowerCase();
        /* converting the value in cityName to lowercase
            and, storing the all-lowercase value in NEW variable (cityNameInLowercase)
         */
        System.out.println("\nCity name in lowercase : " + cityNameInLowercase); // City name in lowercase : new york
        System.out.println("City name : " + cityName); // City name : neW yOrK (original value)

        /**
         * To convert the String into all lowercase
         * Method: toUppercase()
         * Return type : String
         *
         * This method is NOT going to change the original value
         * It will convert the value in Uppercase, and return the result to user
         */
        //String cityName = "neW yOrK";
        String cityNameInUppercase = cityName.toUpperCase();
        /* converting the value in cityName to Uppercase
            and, storing the all-Uppercase value in NEW variable (cityNameInUppercase)
         */
        System.out.println("\nCity name in Uppercase : " + cityNameInUppercase); // City name in Uppercase : NEW YORK
        System.out.println("City name : " + cityName); // City name : neW yOrK (original value)

        /**
         * For comparison, when we need to verify if two Strings are identical
         * Method : equals()
         * This method only applicable to compare two Strings - important
         * Return type - boolean
         * true or false
         *
         * "New York"
         * "New York" - same as equal
         */
        /* cityName = "neW yOrK";
             cityNameInUppercase = "NEW YORK";
         */
        boolean isEqual = cityName.equals(cityNameInUppercase);
        System.out.println("\nis " + cityName + "equals to " + cityNameInUppercase + "? : " + isEqual); //is neW yOrKequals to NEW YORK? : false

        /**
         * For comparison, when we need to verify if two Strings HAVE SAME VALUE
         * Method : equalsIgnoreCase()
         *
         * Return type - boolean
         * true or false
         *
         * "New York"
         * "New York" - same as equal
         */
        /* cityName = "neW yOrK";
             cityNameInUppercase = "NEW YORK";
         */
        boolean isEqualIgnoreCase = cityName.equalsIgnoreCase(cityNameInUppercase);
        System.out.println("\nis " + cityName + " equals to (ignore cases) " + cityNameInUppercase + "? : " + isEqualIgnoreCase); //is neW yOrK equals to (ignore cases) NEW YORK? : true

        String abc = "happy land";
        String def = "happy    land";
        System.out.println(abc.equalsIgnoreCase(def)); // false

        /**
         * "happy peace world"
         * To find if a particular sequence is EXACTLY present in the given String
         * Method : contains()
         * return type: boolean
         *
         * "abc" - false
         * "ace" - true
         * "aCe"- false
         *
         * cityName = "neW yOrK
         */
        boolean isContains_new = cityName.contains("new");
        System.out.println("\nis " + cityName + " contains 'new' ?: " + isContains_new);

        /**
         * Task: verify is cityName (neW yOrK) contains "NeW"
         * note: ignore the cases
         * expected answer : true
         *
         * Note (Pseudo Coding) - contain method DO NOT have ignore case
         *      To Do ignore cases need to do below task
         *      convert cityName into Uppercase (toUppercase) -- NEW YORK
         *      convert "NeW" into Uppercase                  -- NEW
         *      Now in (contains) method it will give us true answer
         */
        /*
        First change cityName - String cityName_Uppercase = cityName.toUpperCase();
        Second change "NeW"- String stringToCheck_Uppercase = "NeW".toUpperCase();
        Third - boolean isContains data

        cityName "neW yOrK", Search for "w yo", do not ignore cases. Answer should false.
        see line 157 to print out all in one time - (cityName.toUpperCase().contains("w yo".toUpperCase()));
         */
        String cityName_Uppercase = cityName.toUpperCase();
        String stringToCheck_Uppercase = "w yo".toUpperCase();
        boolean isContains = cityName_Uppercase.contains(stringToCheck_Uppercase);
        System.out.println(isContains); //true

        System.out.println(cityName.toUpperCase().contains("w yo".toUpperCase())); // true

        /**
         * To replace a string in a given String
         * Method: replace()
         * return type: String
         *
         * This method doesn't change the original value
         * it will replace the data, and returns a new String
         *
         * It will replace all the instances.
         *
         */
        // cityName = "neW yOrK";
        String news = "Power surgEs from lightning can damage computers. monitors and TVs.";
        news.replace("e", "XXX"); // This will not apply to anywhere until we create variable as below

        String newsAfterReplace_e_XXX = news.replace("e", "XXX"); // create this String variable as newsAfterReplace_e_XXX
        System.out.println(news); // will print whatever on String news
        System.out.println(newsAfterReplace_e_XXX); // will print after replacement

        /*
        Please replace all instances of e/E with XXX
        1. convert news into lowercase
        2. then replace all e to XXX
         */

        news.toLowerCase().replace("e", "XXX"); //1. convert news into lowercase
        System.out.println(news.toLowerCase().replace("e", "XXX")); // 2. then replace all e to XXX
        //powXXXr surgXXXs from lightning can damagXXX computXXXrs. monitors and tvs.

        // cityName = "neW yOrK";
        System.out.println(cityName.replace("W y", "w york city")); // will print - new york cityOrk
        //  new york cityOrK




        /**
         *
         * To find the character present at a particular given index
         * method: charAt() // if incase we made mistake and write down wrong code (indexvalue is not valid) charAt() will give us EXCEPTION
         * return type:  char
         *
         * cityName = "neW yOrK";
         *
         * n e W   y O r K
         * 0 1 2 3 4 5 6 7
         *
         *
         * if given index is within the index-range, it will return the char at given index
         * else, it will throw Exception (StringIndexOutOfBoundsException)
         *
         */
        char charAtIndex4 = cityName.charAt(4);
        System.out.println("In '" + cityName + "' char at index-4: " +charAtIndex4);
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

        /**
         *
         * To find the index of FIRST OCCURRENCE number of the given value - as example 0 1 2 3 4
         * Method: indexOf()
         * return type: int
         *
         * "neW yOrK"
         * index of "n" is 0
         *
         * index of "N" is -1 (that mean there are not capital N on the index, that's why it is giving us -1 in return)
         *
         * If there multiple "n"- "new yOrk city is the best town in the world"
         *
         * indexOf will always count only first number of n on the sentence
         */
        String newCityName = "new yOrk city is the best town in the world, and in AMEriCA";
        int indexOf_N = newCityName.indexOf("N");
        System.out.println("\nIndex of 'N' in '" + newCityName + "' is : "  + indexOf_N); //-1

        int indexOf_or = newCityName.indexOf("or");
        System.out.println("\nIndex of 'or' in '" + newCityName + "' is : " + indexOf_or); // 39

        /**
         *
         * To find the index LAST OCCURRENCE number of the given value - as example 0 1 2 3 4
         * Method: lastIndexOf()
         * return type: int
         *
         * "new yOrk city is the best town in the world, and in AMErica";
         * index of last "n" is 0
         *
         * index of last "N" is -1 (that mean there are not capital N on the index, that's why it is giving us -1 in return)
         *
         * If there multiple "n"- "new yOrk city is the best town in the world"
         *
         * indexOf will always count only first number of n on the sentence
         */
        // String newCityName = "new yOrk city is the best town in the world, and in AMErica";
        int lastIndexOf_n = newCityName.lastIndexOf("n");
        System.out.println("\nLast index of 'n' in '" + newCityName + "' is : "  + lastIndexOf_n); // 50

        int lastIndexOf_or = newCityName.lastIndexOf("or");
        System.out.println("\nLast Index of 'or' in '" + newCityName + "' is : " + lastIndexOf_or); // 39

        /**
         *
         * To find if the String starts with a given value
         * Method: startsWith()
         * return: boolean
         *
         * yes / no
         *
         * newCityName = "new yOrk city is the best town in the world, and in AMErica";
         * does it start with "N"? : false
         * does it start with "new"? : true
         */

        boolean isStartsWith_N = newCityName.startsWith("N");
        System.out.println("is '" + newCityName + "' starts with 'N'? : " + isStartsWith_N);  // false

        boolean isStartsWith_new = newCityName.startsWith("new");
        System.out.println("is '" + newCityName + "' starts with 'N'? : " + isStartsWith_new); // true

        /**
         *
         * To find if the String ends with a given value
         * Method: EndsWith()
         * return: boolean
         *
         * yes / no
         *
         * newCityName = "new yOrk city is the best town in the world, and in AMEriCA";
         * does it ends with "N"? : false
         * does it ends with "iCA"? : true
         */

        boolean isEndsWith_N = newCityName.endsWith("N");
        System.out.println("is '" + newCityName + "' ends with 'N'? : " + isEndsWith_N); // false

        boolean isEndsWith_iCA = newCityName.endsWith("iCA");
        System.out.println("is '" + newCityName + "' ends with 'iCA'? : " + isEndsWith_iCA); // true

        /**
         * To remove spaces from the beginning (before the first character in string)
         *      and from the end (after the last character in the String)
         * method : trim()
         * return type:  String
         *
         * This method will not change the original value
         *  it will remove extra spaces and return the new String
         *
         */
        String myCity = "   new   york   city   is   the    best   city   in   the   world  ";
        System.out.println("\n#"+myCity+"#");

        String myCityTrim = myCity.trim();
        System.out.println("\n#"+myCityTrim+"#");
        // After trimming the answer should looks like this - #new   york   city   is   the    best   city   in   the   world#









    }
}
