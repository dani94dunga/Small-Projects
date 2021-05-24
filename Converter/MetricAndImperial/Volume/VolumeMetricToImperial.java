package Converter.MetricAndImperial.Volume;

import Converter.IConverter;

import java.text.DecimalFormat;
import java.util.Scanner;

public class VolumeMetricToImperial implements IConverter {
    private double mtr3;
    private double yrd3;
    @Override
    public void getResult() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the numbers for conversion: ");

        mtr3 = scanner.nextDouble();

        yrd3 = mtr3 * 1.3080;
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Conversion Completed: " + df.format(yrd3) + " yd3");

    }
}
