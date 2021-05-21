package Converter.MetricAndImperial.Length;

import Converter.IConverter;

import java.text.DecimalFormat;
import java.util.Scanner;

public class LengthImperialToMeter implements IConverter {
    private double meter;
    private double feet;
    private double inch;
    @Override
    public void getResult() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the numbers for conversion: ");

        feet = scanner.nextDouble();
        inch = scanner.nextDouble();
        meter = (feet * 3) / + (inch * 2.8);

        DecimalFormat df = new DecimalFormat(".00");
        System.out.println("Conversion completed: " + df.format(meter));

    }
}
