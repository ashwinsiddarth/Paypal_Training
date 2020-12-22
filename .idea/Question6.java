package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String input;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input : ");
        input = sc.next();
        System.out.println("Output : " + longPal(input));

    }

    private static String longPal(String input) {
        int l = input.length(),maxLen=1,s =0;
        String output="";
        for(int i=0;i<input.length();i++){
            for(int j=i;j<input.length();j++){
                int flag = 1;
                for(int k=0;k<(j-i+1)/2;k++) {
                    if (input.charAt(i + k) != input.charAt(j - k))
                        flag = 0;
                }
                if(flag!=0 && (j-i+1)>maxLen){
                    s = i;
                    maxLen = j-i+1;
                }
            }
        }
        for(int i=s;i<=s+maxLen-1;i++){
            output = output + input.charAt(i);
        }
        return output;

    }
}
