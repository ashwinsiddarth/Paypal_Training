package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n,amount;
        Scanner sc = new Scanner(System.in);
        System.out.println("Length of array : ");
        n = sc.nextInt();
        int[] input = new int[n];
        System.out.println("Input [coins] : ");
        for(int i=0;i<n;i++){
            input[i] = sc.nextInt();
        }
        System.out.println("[amount] : ");
        amount = sc.nextInt();
        System.out.println("Output : " + coinChange(input,amount));
    }

    private static int coinChange(int[] input, int amount) {
        Arrays.sort(input);
        int[] dp = new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0] = 0;
        for(int i=0;i<=amount;i++){
            for(int j=0;j<input.length;j++){
                if(input[j]<=i){
                    dp[i]=Math.min(dp[i],1+dp[i-input[j]]);
                }
            }
        }
        return dp[amount]>amount?-1:dp[amount];
    }

}
