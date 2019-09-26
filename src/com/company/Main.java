package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the number");
        int a;
        int b;

        Scanner obj = new Scanner(System.in);
         a = obj.nextInt();
         b = obj.nextInt();

        int c= a&b;
        System.out.println( "Ans:"+ c);




    }
}
