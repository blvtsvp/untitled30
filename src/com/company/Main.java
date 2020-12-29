package com.company;

import java.util.Scanner;

public class Main {
public static int gcd(int a, int b){
    return b == 0 ? a : gcd(b,a%b);
}
public static int lcm(int a, int b){
    return a / gcd(a,b) * b;
}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("NOK(a,b) = "+ lcm(a,b));
    }
}
