package com.mycompany.pratice;

import java.util.HashMap;

public class RomanToInt {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        int total=0,currentValue=0,nextValue=0;
        for (int i=0; i < s.length(); i++) {
            if (i != s.length()-1) {
                currentValue = map.get(s.charAt(i));
                nextValue = map.get(s.charAt(i+1));
            } else {
                currentValue = map.get(s.charAt(i));
                total += currentValue;
                break;
            }
            if (currentValue < nextValue) {
                total -= currentValue;
            } 
            if (currentValue > nextValue) {
                total += currentValue;
            }
        }
        System.out.println(total);
    }
}
