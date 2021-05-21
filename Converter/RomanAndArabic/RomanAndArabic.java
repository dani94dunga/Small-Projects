package Converter.RomanAndArabic;

import Converter.IConverter;

import java.util.Scanner;

public class RomanAndArabic {
    private IConverter romanToArabic = new RomanToArabic();
    private IConverter arabicToRoman = new ArabicToRoman();
    public RomanAndArabic(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select how to convert:");
        System.out.println("1. From Roman - Arabic");
        System.out.println("2. From Arabic - Roman");
        int selection = scanner.nextInt();
        if (selection == 1) {
            romanToArabic.getResult();
        } else if (selection == 2) {
            arabicToRoman.getResult();
        }
        }
    }


