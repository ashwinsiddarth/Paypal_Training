package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n =0;
        boolean empty = true;
        Scanner sc = new Scanner(System.in);
        while (empty) {
            System.out.println("Length of array 'N': ");
            n = sc.nextInt();
            if (n!=0)
                empty = false;
            else
                System.out.println("N should be grater than 0");
        }
        int[] gas = new int[n];
        int[] cost = new int[n];
        System.out.println("Input [gas] : ");
        for (int i = 0; i < n; i++) {
            gas[i] = sc.nextInt();
        }
        System.out.println("Input [cost] : ");
        for (int i = 0; i < n; i++) {
            cost[i] = sc.nextInt();
        }
        System.out.println("Output : " + isValid(gas,cost));


    }

    private static int isValid(int[] gas, int[] cost) {
        int leftGas = 0,tank = 0,start = 0 ;
        for(int i=0;i<gas.length;i++){
            int left = gas[i]-cost[i];
            if(leftGas<0){
                start=i;
                leftGas = left;
            }else {
                leftGas += left;
            }
            tank +=left;
        }
        if(tank<0)
            return -1;
        else
            return start;
    }
}
