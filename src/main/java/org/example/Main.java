package org.example;

import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get Celsius input
        System.out.println("Enter temperature in Celsius: ");
        float getCelsius = scanner.nextFloat();

        // Convert Celsius to Fahrenheit
        float getFahrenheit = (getCelsius * ((float) 9/5)) + 32;

        // Display Fahrenheit
        System.out.print("Temperature in Fahrenheit: ");
        System.out.printf("%.2f", getFahrenheit);
    }
}