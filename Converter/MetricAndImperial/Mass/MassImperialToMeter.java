package Converter.MetricAndImperial.Mass;

import Converter.IConverter;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MassImperialToMeter implements IConverter {
    private double gram;
    private double oz;

    @Override
    public void getResult() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number for conversion: ");
        oz = scanner.nextDouble();

        gram = oz / 0.0353;

        DecimalFormat df = new DecimalFormat(".00");
        System.out.println("Conversion completed: " + df.format(gram) + " g");

    }
}
