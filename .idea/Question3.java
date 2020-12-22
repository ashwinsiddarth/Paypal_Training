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
        System.out.println("Output : " + water(input));
    }

    private static int water(int[] input) {
        int water = 0;

        for(int i = 0; i < input.length; i++) {
            int leftMax = input[i], rightMax = input[i];

            for(int l = i; l >= 0; l--){
                leftMax = Math.max(leftMax, input[l]);
            }
            for(int r = i; r < input.length; r++){
                rightMax = Math.max(rightMax, input[r]);
            }

            water += Math.min(leftMax, rightMax) - input[i];
        }

        return water;

    }
}
