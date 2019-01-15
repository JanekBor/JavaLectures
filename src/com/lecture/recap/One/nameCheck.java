package com.lecture.recap.One;

import java.util.Scanner;

public class nameCheck {
    public static void main(String[] args) {

        String name = "Janek";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name :");

        String nameCheck = scanner.nextLine();

        System.out.println("Please enter your age : ");

        int age = scanner.nextInt();


        if (name.equalsIgnoreCase(nameCheck) && age >= 50) {
            System.out.println("Hi Janek! You have a same name as mine, you are old. ");
        } else if (name.equalsIgnoreCase(nameCheck) && age < 50) {
            System.out.println("Hi Janek! You have a same name as mine, you are young. ");
        } else if (age >= 50) {

            System.out.println("Hi " + nameCheck + ", your name is different from mine and you are old.");
        } else {

            System.out.println("Hi  " + nameCheck + ", your name is different from mine and you are young.");
        }
    }


}
