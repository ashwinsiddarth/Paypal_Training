package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Length of array : ");
        n = sc.nextInt();
        int[] input = new int[n];
        System.out.println("Input : ");
        for(int i=0;i<n;i++){
            input[i] = sc.nextInt();
        }
        System.out.println("Output : " + missingNo(input));
    }

    private static int missingNo(int[] input) {
        int missing = input.length;
        for(int i=0;i<input.length;i++){
            missing += i - input[i];
        }
        return missing;
    }
}
