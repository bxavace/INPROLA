/**
 * Author: Brylle Nunez
 * Date: January 27 2022
 * Description: Java program that displays a temperature conversion table for degrees Celsius and degrees Fahrenheit by multiple of 10.
 */
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        // Celcius to Fahrenheit:
        // F = (C * (9/5)) + 32
        int c, f;
        System.out.println("Celcius" + "    " + "Fahrenheit"); // Headings
        for (c = 0, f = 0; c <= 100 && f <= 100; c += 10, f += 10) {
            // for-loop of celcius (by 10s), and its Fahrenheit conversion
            System.out.println(c + "    ||    " + (((9 * f) / 5) + 32)); // Output answer in two columns
        }
    }
}