package Converter.MetricAndImperial.Area;

import Converter.IConverter;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaMeterToImperial implements IConverter {
    private double sqm;
    private double sqft;
    @Override
    public void getResult() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the numbers for conversion: ");
        sqm = scanner.nextDouble();
        sqft = sqm * 10.7639104;
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Conversion Completed: " + df.format(sqft));
    }
}
