package Converter.MetricAndImperial.Temperature;

import Converter.IConverter;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TempMeterToImperial implements IConverter {
    private double fahrenheit;
    private double celsius;
    @Override
    public void getResult() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number for conversion: ");

        celsius = scanner.nextDouble();

        fahrenheit = (celsius * 1.8) + 32;

        DecimalFormat df = new DecimalFormat(".00");
        System.out.println("Conversion completed: " + df.format(fahrenheit) + " °F");
    }
}
