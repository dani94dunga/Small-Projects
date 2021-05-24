package Converter.MetricAndImperial.Volume;

import Converter.IConverter;

import java.text.DecimalFormat;
import java.util.Scanner;

public class VolumeImperialToMeter implements IConverter {
    private double mtr3;
    private double yrd3;
    @Override
    public void getResult() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the numbers for conversion: ");

        yrd3 = scanner.nextDouble();

        mtr3 = yrd3 / 1.3080;
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Conversion Completed: " + df.format(mtr3) + " m3");

    }
}
