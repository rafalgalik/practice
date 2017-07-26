package com.company;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumbers {

    private Map<Integer, String> romanNumbers = getRomanNumbersAsMap();

    public int RomanToArabic(String romanNumber) {
        int value = 0;
        for (Map.Entry<Integer, String> romanSign : romanNumbers.entrySet()) {
            while (romanNumber.contains(romanSign.getValue())) {
                    romanNumber = romanNumber.replaceFirst(romanSign.getValue(), "");
                    value += romanSign.getKey();
            }
        }
        return value;
    }

    private Map<Integer, String> getRomanNumbersAsMap() {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(900, "CM");
        map.put(90, "XC");
        map.put(9, "IX");
        map.put(4, "IV");
        map.put(1000, "M");
        map.put(500, "D");
        map.put(100, "C");
        map.put(10, "X");
        map.put(50, "L");
        map.put(5, "V");
        map.put(1, "I");
        return map;
    }
}
