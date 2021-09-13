package Class19;


    public class Homework12_Discussion {

        // Sept 01, 2021 //sss

        /**
         * Question:
         * Create a method, that will return all duplicates values with count from the given List<String>
         * List<String> words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
         * Output:
         *      happy - 2
         *      joy - 3
         *      laugh - 2
         */





        String[] arr = {"green", "blue", "green", "yellow", "grey", "green", "red", "grey",
                "green", "red", "yellow", "yellow", "grey", "blue", "yellow", "grey",
                "green", "blue", "yellow", "grey", "green", "blue", "green", "green",
                "green", "green"};

        /**
         * Question:
         * Create a method that will take String-array as input
         *
         * If there is a color with maximum count, return the color name
         * If there are two or more colors with same number, return all
         *
         * hint: return type as Set/List<String>
         */
        /*
        Manually start counting color

        green - 18
        blue - 11
        red - 20
        yellow - 20
        grey - 16

        like to sort it as pair - is that called Map

        Map<String, Integer> colorCount = new HashMap<>();
        Map-green (this is String)
        Integer - 18 (this is int)
        Name - colorCount
        create new HashMap<>()
         */
    /*
        Map<String, Integer> colorCount = new HashMap<>();

        if (arr[0] is NOT a key in Map) { // if (green[0] is not a key in Map
            count occurrences of arr[0]  // count occurrences of green
            add pair (arr[0],18) in colorCountMap
        }

        if (arr[1] is NOT a key in Map) {
            count occurrences of arr[1]
            add pair (arr[1],19) in colorCountMap
        }

        if (arr[2] is NOT a key in Map) {
            count occurrences of arr[2]
            add pair (arr[1],19) in colorCountMap
        }

        Map<String, Integer> colorCount = new HashMap<>();
        // { (green,18) , (blue,19) , (red,20) , (grey,20) , (yellow,10) }

        to find out maximum value, make a empty Set as below

        Set<String> maxColor = new HashSet<>();

        18, 19, 20, 20, 10

        20

        (green, blue, red, grey, yellow)

        green
        if (value of green == 20) // picking # 20 because that is max number
            add green in maxColor-Set

        blue
        if(value of blue == 20)
            add blue in maxColor-Set

        red
        if (value of red == 20)
            add red in maxColor-Set

        grey
        if(value of grey == 20)
            add grey in maxColor-Set

        yellow
        if(value of yellow == 20)
            add yellow in maxColor-Set


        maxColor -> red, grey


     */



        /**
         *
         * Question:
         * Create a hashMap with any numbers of key-value pairs from the user
         * Key should be Integer
         * Value should be String
         *
         * Create method that will print the keys with same value, else "All keys have different values"
         *
         * Input to method -> [{101="happy"}, {102="peace"}, {103="Happy"}, {104="learn"}, {105="PEaCe"}, {106="HAPPY"}]
         * Output (print) ->
         *      "happy" with keys -> 101, 103, 106
         *      "peace" with keys -> 102, 105
         *
         * Input to method -> [{111="happy"}, {98="peace"}, {10="LAugh"}, {55="learn"}, {101="Grow"}]
         * Output (print) ->
         *      All keys have different values
         *
         *
         */

















}
