package Converter.MetricAndImperial.Mass;

import Converter.IConverter;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MassMeterToImperial implements IConverter {
    private double gram;
    private double oz;

    @Override
    public void getResult() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number for conversion: ");
        gram = scanner.nextDouble();

        oz = gram * 0.0353;

        DecimalFormat df = new DecimalFormat(".00");
        System.out.println("Conversion completed: " + df.format(oz) + " oz");

    }
}
