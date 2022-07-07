package ru.example;

import java.util.Arrays;
import java.util.Scanner;

public class NewClass {
    public static void main(String[] args){
        String[] romeArr = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        int num = Arrays.asList(romeArr).indexOf("IV") + 1;

        String[] romeArrD = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] romeArrEd = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String res = romeArrD[4] + romeArrEd[5];
        System.out.println(res);
        Scanner in = new Scanner(System.in);
        int [] ar = {11, 4, 1, 7, 2, 3};
        int [] array = new int[4];
        int t;
        for (int j= ar.length - 1; j> 0; j--){
            for (int i=0; i < j; i++){
                if (ar[i] > ar[i+1]) {
                    t = ar[i];
                    ar[i] = ar[i+1];
                    ar[i+1] = t;
                }
            }
        }
        for (int i=0; i< 6; i++){
            System.out.print(ar[i] + " ");
        }
        for (int i = 1; i < 4; ++i) System.out.println(i);
    }
}
