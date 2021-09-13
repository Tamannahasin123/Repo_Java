package Class19;

import java.util.*;

public class Homework12_SampleCode {

    public static void main(String[] args) {


        String[] arr = {"green", "blue", "green", "yellow", "grey", "green", "red", "grey",
                "green", "red", "yellow", "yellow", "grey", "blue", "yellow", "grey",
                "green", "blue", "yellow", "grey", "green", "blue", "green", "green",
                "green", "green", "yellow", "yellow", "yellow", "yellow", "yellow"}; // sss



        Homework12_SampleCode s1 = new Homework12_SampleCode();

        Set<String> colorNames = s1.getColorMaxTimes(arr);

        System.out.println(colorNames);

    }


    public Set<String> getColorMaxTimes(String[] colors) {

        Map<String, Integer> colorCount = new HashMap<>();

        for (int i=0 ; i < colors.length ; i++) {
            if (!colorCount.containsKey(colors[i])) {
                int count = 1;
                for (int j=i+1 ; j < colors.length ; j++) {
                    if (colors[j].equalsIgnoreCase(colors[i])) {
                        count++;
                    }
                }
                colorCount.put(colors[i], count);
            }
        }

        // System.out.println(colorCount);

        Collection<Integer> allColorCount = colorCount.values();

        Integer maxValue = 0;

        for (Integer value : allColorCount) {
            if (value > maxValue) {
                maxValue = value;
            }
        }

        // System.out.println(maxValue);

        Set<String> allColorNames = colorCount.keySet();
        Set<String> maxColor = new HashSet<>();

        for (String colorName : allColorNames) {
            if (colorCount.get(colorName) == maxValue) {
                maxColor.add(colorName);
            }
        }

        // System.out.println(maxColor);
        return maxColor;

    }




}