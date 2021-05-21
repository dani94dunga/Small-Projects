package Converter;

import Converter.MetricAndImperial.MetricAndImperial;
import Converter.RomanAndArabic.RomanAndArabic;

import java.util.Scanner;

public class ConverterMenu {


    public static Scanner scanner = new Scanner(System.in);

    public ConverterMenu() {

        //Choices for the user
        System.out.println("****Conversion Program****");
        System.out.println("Please select one of the following choices: ");

        System.out.println("1. Roman and Numerals");
        System.out.println("2. Metric and Imperial ");
        int selection = scanner.nextInt();
        //Which way to convert the chosen selection

        //Roman and Numerals
        if (selection == 1) {
            RomanAndArabic romanAndArabic = new RomanAndArabic();
        }
        //Metric and Imperial
        if (selection == 2) {
            MetricAndImperial metricAndImperial = new MetricAndImperial();
        }
    }
}