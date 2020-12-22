package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String input;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input : ");
        input = sc.next();
        System.out.println("Output : " + substring(input));



    }
    public static boolean substring(String input){
        int len = input.length();
        for(int i=1;i<len/2;i++){
            if(len%i==0){
                int m = len/i;
                String sub = input.substring(0,i);
                StringBuffer sb = new StringBuffer();
                for(int j=0;j<m;j++){
                    sb.append(sub);
                }
                if(sb.toString().equals(input))
                    return true;
            }
        }
        return false;
    }

}
