package Converter.MetricAndImperial.Area;

import Converter.IConverter;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaImperialToMeter implements IConverter {
    private double sqm;
    private double sqft;
    @Override
    public void getResult() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the numbers for conversion: ");
        sqft = scanner.nextDouble();
        sqm = sqft / 10.7639104;
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Conversion Completed: " + df.format(sqm));
    }
}
