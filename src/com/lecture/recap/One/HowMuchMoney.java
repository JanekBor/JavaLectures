package com.lecture.recap.One;

import java.util.Scanner;

public class HowMuchMoney {

    public static void main(String[] args) {
        double money;
        double moneySpent;
        String exit;

        System.out.println(" Enter the amount of money that you have : ");

        Scanner scanner = new Scanner(System.in);

        money = scanner.nextDouble();

        System.out.println("Enter the amount of money you have spent : ");
        moneySpent = scanner.nextDouble();

        while (money >= 0) {

            money -= moneySpent;

            if (money == 0) {

                System.out.println("Your balance is 0 , goodbye !");
                break;

            }

            System.out.println("Your balance is " + money);

            System.out.println("Enter the amount of money you have spent : ");
            moneySpent = scanner.nextDouble();


        }


    }


}