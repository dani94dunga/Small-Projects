package Converter.MetricAndImperial;

import Converter.IConverter;

import java.util.Scanner;

public class MetricAndImperial {
    private IConverter metricToImperial = new MetricToImperial();
    private IConverter imperialToMetric = new ImperialToMetric();
    public MetricAndImperial(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select how to convert:");
        System.out.println("1. From Metric - Imperial");
        System.out.println("2. From Imperial - Metric");
        int selection = scanner.nextInt();
        if (selection == 1) {
            metricToImperial.getResult();
        } else if (selection == 2) {
            imperialToMetric.getResult();
        }
    }
}
