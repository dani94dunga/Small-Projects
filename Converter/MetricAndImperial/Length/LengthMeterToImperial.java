package Converter.MetricAndImperial.Length;

import Converter.IConverter;

import java.text.DecimalFormat;
import java.util.Scanner;

public class LengthMeterToImperial implements IConverter {
    private double meter;
    private double inch;

    @Override
    public void getResult() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number for conversion: ");

        meter = scanner.nextDouble();
        inch = meter * 39.37;

        inch /= 12;
        DecimalFormat df = new DecimalFormat(".00");
        System.out.println("Conversion completed: " + df.format(inch) + " feet");

    }
}
