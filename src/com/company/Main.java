package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void raffle(boolean valid, int j, int i) {
        BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(System.in));
        try{
            while (valid) {
                System.out.println("Do you want to purchase a raffle ticket?");
                String rafflechoice = bufferedreader.readLine();
                if (rafflechoice.equals("yes")){
                    System.out.println("Input your name");
                    personList[j] = bufferedreader.readline();
                    j++;

                    for (i = 0; i<=k; i++){
                        int raffleno = Random.Randint(0,10);
                    }

                }

            }
        } catch (Exception e) {
            System.out.println("Error!");
    }

    public static void main(String[] args) {
        // Raffle ticket program
        String personlist[] = new String[9];
        int Tickets[] = new int[9];
        int i = 0;
        int j = 0;
        int k = 1;




    }}}
