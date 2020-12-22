package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int input;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input : ");
        input = sc.nextInt();
        System.out.println("Output : " + elimination(input));
    }

    private static int elimination(int input) {
        boolean left = true;
        int r = input,h=1,s=1;
        while (r>1){
            if(left||r%2==1){
                h = h+s;
            }
            r = r/2;
            s = s*2;
            left=!left;
        }
        return h;
    }
}
