package Converter.RomanAndArabic;

import Converter.IConverter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToArabic implements IConverter {
    private HashMap<Character, Integer> romanValues = new HashMap<>();
    private int result;
@Override
    public void getResult() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number for conversion: ");

                //Mapping the roman numbers
                romanValues.put('I', 1);
                romanValues.put('V', 5);
                romanValues.put('X', 10);
                romanValues.put('L', 50);
                romanValues.put('C', 100);
                romanValues.put('D', 500);
                romanValues.put('M', 1000);
        while (true) {
            try {
                String s = scanner.nextLine().toUpperCase();
                int length = s.length();
                int result = romanValues.get(s.charAt(length - 1));

                for (int i = length - 2; i >= 0; i--) {
                    if (romanValues.get(s.charAt(i)) >= romanValues.get(s.charAt(i + 1))) {
                        result += romanValues.get(s.charAt(i));
                    } else {
                        result -= romanValues.get(s.charAt(i));
                    }
                }
                System.out.println(result);
                break;
            }catch (Exception e){
                System.out.println("Please enter a VALID NUMBER!");
            }

        }
    }

}
