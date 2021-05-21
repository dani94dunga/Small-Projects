package Converter.MetricAndImperial;

import Converter.IConverter;
import Converter.MetricAndImperial.Length.LengthImperialToMeter;

import java.util.Scanner;

public class ImperialToMetric implements IConverter {
    private LengthImperialToMeter lengthImperialToMeter = new LengthImperialToMeter();

    @Override
    public void getResult() {
        Scanner scanner = new Scanner(System.in);
        //Multiple selection for the user from which he can select.
        System.out.println("Please select from which you need to convert: ");
        System.out.println("1. Length Conversion");
        System.out.println("1. Area Conversion");
        System.out.println("1. Volume Conversion");
        System.out.println("1. Mass Conversion");
        System.out.println("1. Temperature Conversion");
        int metric = scanner.nextInt();

        if (metric == 1){
            lengthImperialToMeter.getResult();
        }
    }
}
