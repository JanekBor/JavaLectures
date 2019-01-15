package com.lecture.recap.One;

import java.util.Scanner;

public class PermutationFactorial {

    public static void main(String[] args) {

        int number;
        int fact = 1;


        System.out.println("Enter a number :");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        if (number < 0 ){
            System.out.println("You cannot enter a negative value ! ");
        }

        else if (number == 0 ){
            System.out.println(" Result is 1 ");
        }

        else {
            for(int i = 1; i<=number; i++) {
                fact = fact * i;
            }
            System.out.println("Result is: "+fact);

        }
}}
