package com.company;

import java.util.Scanner;

public class Utils {
    public static int getNumber(int min, int max){
        int num = new Scanner(System.in).nextInt();
        if(num >= 1 && num <= max){
            return num;
        }else return getNumber(min, max);
    }
}
