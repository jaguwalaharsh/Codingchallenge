package com.mycompany.pratice;

import java.util.HashMap;

public class JewelsAndStones {
    public static void main(String[] args) {
        String jewels = "aAbb";
        String stones = "aAAbbbb";
        int count = 0,total = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for (char c : stones.toCharArray()) {
            if (!map.containsKey(c)) {
                count = 0;
            }
            map.put(c, ++count);
        }
        
        for (char c : jewels.toCharArray()) {
            if (map.containsKey(c)) {
                total = total + map.get(c);
                map.put(c, 0);
            }
        }
        System.out.println("Total jewles and stones are " + total);
        System.out.println(map);
    }
}
