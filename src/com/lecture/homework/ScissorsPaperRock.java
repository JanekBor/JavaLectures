package com.lecture.homework;

import java.util.Scanner;

public class ScissorsPaperRock {

        public static void main(String[] args) {
            int rock = 0;
            int paper = 1;
            int Scissors = 2;

            int user = 0;
            int computer = 0;
            int gamesplayed = 0;

            Scanner scan = new Scanner(System.in);

            while (gamesplayed < 5)
            {


                System.out.println("Rock = 0 , Paper = 1, Scissors = 2");
                String userinput = scan.nextLine();

                int convertinput = Integer.valueOf(userinput);
                int Computerinput = (int)(Math.random()*3);

                if (Computerinput == 1 && convertinput == 0)
                {
                    System.out.println("Paper beats Rock " +
                            "\nThe computer won");
                    gamesplayed++;
                    computer++;
                }
                else if (convertinput == 1 && Computerinput == 0)
                {
                    System.out.println("Paper beats Rock " +
                            "\nYou Win!");
                    gamesplayed++;
                    user++;
                }
                if (Computerinput == 0 && convertinput == 2)
                {
                    System.out.println("Rock beats Scissors " +
                            "\nThe computer won");
                    gamesplayed++;
                    computer++;
                }
                else if (convertinput == 0 && Computerinput == 2)
                {
                    System.out.println("Rock beats Scissors " +
                            "\nYou Win!");
                    gamesplayed++;
                    user++;
                }

                if (Computerinput == 2 && convertinput == 1)
                {
                    System.out.println("Scissors beats Paper " +
                            "\nThe computer won");
                    gamesplayed++;
                    computer++;
                }
                else if (convertinput == 2 && Computerinput == 1 )
                {
                    System.out.println("Scissors beats Paper " +
                            "\nYou Win");
                    gamesplayed++;
                    user++;
                }


                if (Computerinput == 0 && convertinput == 0)
                {
                    System.out.println("Rock ties Rock " +
                            "\nTie");

                }
                if (Computerinput == 1 && convertinput == 1)
                {
                    System.out.println("Paper ties Paper " +
                            "\nTie");

                }
                if (Computerinput == 2 && convertinput == 2)
                {
                    System.out.println("Scissors ties Scissors " +
                            "\nTie");

                }

                }
            if (computer < user){
                System.out.println( "You won the match ! Congrats !");
            }

            else {
                System.out.println("Computer won the match. Best of luck next time !");
            }
        }}
