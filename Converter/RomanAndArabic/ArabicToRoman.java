package Converter.RomanAndArabic;

import Converter.IConverter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ArabicToRoman implements IConverter {
    private HashMap <Integer, String> arabicDigits = new HashMap<>();
    private HashMap <Integer, String> arabicDecimals = new HashMap<>();
    private HashMap <Integer, String> arabicHundreds = new HashMap<>();
    private HashMap <Integer, String> arabicThousands = new HashMap<>();

@Override
    public void getResult(){
        System.out.println("Please enter the number for conversion: ");

        Scanner scanner = new Scanner(System.in);

                //Mapping the digits
                arabicDigits.put(1, "I");
                arabicDigits.put(2, "II");
                arabicDigits.put(3, "III");
                arabicDigits.put(4, "IV");
                arabicDigits.put(5, "V");
                arabicDigits.put(6, "VI");
                arabicDigits.put(7, "VII");
                arabicDigits.put(8, "VIII");
                arabicDigits.put(9, "IX");
                //Mapping the decimals
                arabicDecimals.put(10, "X");
                arabicDecimals.put(20, "XX");
                arabicDecimals.put(30, "XXX");
                arabicDecimals.put(40, "XV");
                arabicDecimals.put(50, "L");
                arabicDecimals.put(60, "LX");
                arabicDecimals.put(70, "LXX");
                arabicDecimals.put(80, "LXXX");
                arabicDecimals.put(90, "XC");
                //Mapping the hundreds
                arabicHundreds.put(100, "C");
                arabicHundreds.put(200, "CC");
                arabicHundreds.put(300, "CCC");
                arabicHundreds.put(400, "CD");
                arabicHundreds.put(500, "D");
                arabicHundreds.put(600, "DC");
                arabicHundreds.put(700, "DCC");
                arabicHundreds.put(800, "DCCC");
                arabicHundreds.put(900, "CM");
                //Mapping the thousands
                arabicThousands.put(1000, "M");
                arabicThousands.put(2000, "M");
                arabicThousands.put(3000, "M");

                StringBuffer stbf = new StringBuffer();

                List<Integer> nums = new ArrayList<>();

        while (true) {
            try {
                int number = scanner.nextInt();
                while (number != 0) {
                    nums.add(number % 10);
                    number /= 10;
                }
                for (int i = nums.size() - 1; i >= 0; i--) {
                    if (nums.size() == 4) {
                        stbf.append(arabicThousands.get(nums.get(i) * 1000));
                        nums.remove(i);
                    } else if (nums.size() == 3) {
                        stbf.append(arabicHundreds.get(nums.get(i) * 100));
                        nums.remove(i);
                    } else if (nums.size() == 2) {
                        stbf.append(arabicDecimals.get(nums.get(i) * 10));
                        nums.remove(i);
                    } else if (nums.size() == 1) {
                        stbf.append(arabicDigits.get(nums.get(i)));
                        nums.remove(i);
                    }
                }
                System.out.println("Conversion completed: " + stbf.toString());
                break;
            }catch (Exception e){
                System.out.println("Please enter a VALID NUMBER!");
            }
        }
    }
}
