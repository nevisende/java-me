package com.nevisende.ms;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int answer = 1;
        while (answer == 1) {
            new MineSweeperGame().play();
            System.out.println("Would you like to play a new game? (0 = No, 1= Yes)");
            answer = input.nextInt();
        }

        System.out.println("See you <3");
    }
}
