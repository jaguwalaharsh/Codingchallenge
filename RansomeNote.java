package com.mycompany.pratice;

import java.util.HashMap;

public class RansomeNote {
    public static void main(String[] args) {
        String s1 = "cab";
        String s2 = "bab";
        int count = 0;
        boolean value = false;
        HashMap<Character,Integer> map = new HashMap<>();
        for (char c : s2.toCharArray()) {
            if (!map.containsKey(c)) {
                count = 0; 
            }
        }
        
        for (char c : s1.toCharArray()) {
            if (map.containsKey(c)) { 
                if (map.get(c) != 0) {  
                    value = true;
                    map.put(c, map.get(c)-1); 
                } else {
                    value = false; 
                    break;
                }
            } else {
                value = false;
                break;
            }
        }
        
        if (value) {
            System.out.println("true");
        } else {
            System.out.println("False");
        }
    }
}
