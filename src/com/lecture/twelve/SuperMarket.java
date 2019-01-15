package com.lecture.twelve;

import java.io.IOException;
import java.util.Scanner;

public class SuperMarket {


    public static void main(String[] args) throws IOException {
        double[] prices = new double[5];
        String[] items = new String[5];
        Scanner scanner = new Scanner(System.in);
        SuperMarketUtilities superMarketUtilities = new SuperMarketUtilities();

        System.out.println("Welcome to the super market. Admin please enter items and prices.");
        for (int counter=0;counter<items.length;counter++){
            //how many times this place run
            System.out.println("Please enter the new item name: ");

            String itemName = scanner.next();
            if(superMarketUtilities.duplicateChecker(itemName,items)){
                System.out.println("This is duplicate item:"+itemName);
                counter--;
            }else{
                items[counter] = itemName;
                System.out.println("Please enter the price for item "+itemName);
                double itemPrice = scanner.nextDouble();
                prices[counter] = itemPrice;
            }
        }

        for (int counter=0;counter<items.length;counter++){
            System.out.println(items[counter]+" "+prices[counter]);
        }


    }
}