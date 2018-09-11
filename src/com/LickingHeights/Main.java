package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//declare
    int height;
    int weight;
    String name;
    double BMI;
    double ITM;
    double PTK;



    Scanner keyboard;

    keyboard = new Scanner(System.in);
    System.out.println("Hello, what is your name?");
    name = keyboard.nextLine();
    System.out.println(name+", how much do you weigh?");
    weight = keyboard.nextInt();
    System.out.println(name+", how tall are you in inches?");
    height = keyboard.nextInt();
    ITM = height*(0.0254/1);
    System.out.println(name+"'s height in meters is "+ ITM+"m.");
    PTK = weight*(0.453592/1);
    System.out.println(name+"'s weight in kilograms is "+ PTK+"kg.");
    BMI = PTK/(ITM*ITM);
    System.out.println(name+ "'s total BMI is "+ BMI);


    }
}
