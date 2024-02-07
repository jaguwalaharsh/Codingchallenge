package com.mycompany.pratice;

public class RemoveDuplicateCharacterFromString {
    public static void main(String[] args) {
        /* solution 1 */
        String str = "bbbb";
        char[] charArray = str.toCharArray(); 
        char[] storeOriginalValue = new char[charArray.length];
        int k=0;
        boolean valueIsMatch = true;
        for(int i=0; i < charArray.length; i++) {  
            for(int j=0; j < storeOriginalValue.length; j++) {
                if (charArray[i] == storeOriginalValue[j]) { 
                    valueIsMatch = true;
                    break;
                } else {
                    valueIsMatch = false; 
                }
            }
            if(valueIsMatch == false) {
                storeOriginalValue[k] = charArray[i]; 
                System.out.println(storeOriginalValue[k]);
                k++; 
            }
        }
        
        /* Solution 2 */
        for(int i=0; i < charArray.length; i++) {  
            for(int j=i+1; j < charArray.length; j++) {
                if (charArray[i] == charArray[j]) { 
                    charArray[j] = ' ';
                } 
            }
            System.out.println(charArray[i]);
        }
    }
}
