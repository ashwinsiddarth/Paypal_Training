package com.company;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int n;
        String input = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Input : ");
        input = sc.nextLine();
        System.out.println("Output : " + isValid(input));
    }

    private static boolean isValid(String input) {
        Stack<Character> stack = new Stack<>();
        for(char c : input.toCharArray()){
            if(c=='[' || c=='{' || c=='('){
                stack.push(c);
            }
            else if(c==']' && !stack.isEmpty() && stack.peek()=='['){
                stack.pop();
            }
            else if(c=='}' && !stack.isEmpty() && stack.peek()=='{'){
                stack.pop();
            }
            else if(c==')' && !stack.isEmpty() && stack.peek()=='('){
                stack.pop();
            }
            else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
