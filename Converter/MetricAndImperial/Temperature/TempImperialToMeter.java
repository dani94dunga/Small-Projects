package Converter.MetricAndImperial.Temperature;

import Converter.IConverter;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TempImperialToMeter implements IConverter {
    private double fahrenheit;
    private double celsius;
    @Override
    public void getResult() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number for conversion: ");

        fahrenheit = scanner.nextDouble();

        celsius = (fahrenheit - 32) / 1.8;

        DecimalFormat df = new DecimalFormat(".00");
        System.out.println("Conversion completed: " + df.format(celsius) + " °C");
    }
}
