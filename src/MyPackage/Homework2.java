package MyPackage;

public class Homework2 {
    public static void main(String[] args) {

    /*
     * Convert deg-Cel into Fahrenheit
     * fT = cT × 9/5 + 32;

     * double cTemp = 21.11;
     * double fTemp = cTemp * 9/5 + 32;
     * System.out.println(cTemp + "°C = " + fTemp + "°F");


     /** Refer -> https://www.rapidtables.com/convert/temperature/how-celsius-to-fahrenheit.html;
     * C -> F;
     * C -> K
     * F -> C
     * F -> K
     * K -> C
     * K -> F
     */

    double cTemp = 21.11;
    double fTemp = cTemp * 9/5 + 32;
    double kelVin = cTemp + 273.15;

    System.out.println(cTemp + "°C = " + fTemp + "°F");

    System.out.println(cTemp + "°C = " + kelVin + "°K");

    System.out.println(fTemp + "°F = " + cTemp + "°C");

    System.out.println(fTemp + "°F = " + kelVin + "°K");

    System.out.println(kelVin + "°K = " + cTemp + "°C");

    System.out.println(kelVin + "°K = " + fTemp + "°F");
    }
}

