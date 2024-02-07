package com.mycompany.pratice;

public class Practice {
    public static int[] processOfNums(int[] sumofnumber,int sum) {
        int[] arr1 = new int[sumofnumber.length];
        if (sumofnumber.length != 9) {
            arr1[sumofnumber.length-1] = sum + sumofnumber[sumofnumber.length-1];
            for(int i = sumofnumber.length-2; i >= 0; i--) {
                arr1[i] = sumofnumber[i];
            }
        } else {
            
        }
        return arr1;
    }
    public static void main(String[] args) {
        int[] sumofnumber = new int[]{4,3,2,1};
        int[] arr2 = processOfNums(sumofnumber,1);
        for(int i = sumofnumber.length-1; i >= 0; i--) {
            System.out.println(arr2[i]);
        }
    }
}
