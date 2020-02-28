/*
 * Created by: Maria Temu
 * Created on: 10-Feb-2020
 * Created for: ICS4U
 * Day #3 (Einsteins Equation)
 * This program allows the user to enter the mass of an object and
 * receive the energy in joules as the output
 */
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here  e = mc2
        System.out.println("Please enter the mass of an object");
        Scanner reader = new Scanner(System.in);

        //variables
        double inputEnergy = 0;
        double userMass =  reader.nextDouble();;
        double lightSpeed = 2.998 * Math.pow(10,8);
        double energyAnswer = 0;

        //read user input
        inputEnergy= Math.pow (lightSpeed,2);
        energyAnswer = userMass * inputEnergy;

        //output
        String Answer = String.valueOf(energyAnswer);
        System.out.println(Answer);

    }
}
