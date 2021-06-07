/*
 *  UCF COP3330 Summer 2021 Assignment 19 Solution
 *  Copyright 2021 Quentin_Burney
 */
package org.example;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args){
        int weight, height;
        double bmi;
        System.out.println("What is your weight?");
        Scanner scanner = new Scanner(System.in);
        String newweight = scanner.next();
        System.out.println("What is your height?");
        Scanner scanner1 = new Scanner(System.in);
        String newheight = scanner1.next();

        weight = Integer.parseInt(newweight);
        height = Integer.parseInt(newheight);

        bmi = (weight / (height * height)) * 703;

        if(bmi < 18.5){
            System.out.println(" Your bmi is " + bmi + ". You are underweight. See a doctor.");
        }
        if(bmi > 25){
            System.out.println(" Your bmi is " + bmi +". You are overweight. See a doctor.");
        }
        else {
            System.out.println(" Your bmi is " + bmi +". You are within the ideal range");
        }
    }
}
