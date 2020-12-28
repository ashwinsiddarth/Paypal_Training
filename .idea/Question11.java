package com.company;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Length of list : ");
        n = sc.nextInt();

        for(int i=1;i<=n;i++){
            list.add(i);
        }
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.print("Input:"+list);
        swap(list);

    }
    public static void swap(LinkedList list) {
        if(list.size()==0){
            System.out.println("Output = []");
        }
        else {
            for (int i = 1; i < list.size(); i += 2) {
                String temp = "" + list.get(i - 1);
                int head = Integer.parseInt(temp);
                temp = "" + list.get(i);
                int next = Integer.parseInt(temp);
                list.set(i, head);
                list.set(i - 1, next);
            }
            System.out.println("Output : "+list);

        }
    }
}
