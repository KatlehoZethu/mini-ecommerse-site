package com.mycompany.mavenproject4;

import java.util.Scanner;

public class Mavenproject4 {

    static double speed = 0.17, acc, brakes, total, time, speeed = 40;
    static int start;
            static String dec;

    static void start(){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter 1 to start the car");
        start = s.nextInt();
        if (start != 1){
            System.out.println("Please start the vehicle");
            start();
        }
        else{       
            System.out.println("Your initial speed is " + speeed + "km/h");
        
            total += speeed;
        }
    } 

    static void decision(){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Do you want to accelerate or brake?");
        dec = s.next();
        
        if(dec.equalsIgnoreCase("accelerate")){
            System.out.println("How many seconds have you been holding the accelerator?");
            acc = s.nextDouble();  
        }
        else if(dec.equalsIgnoreCase("brake")){
            System.out.println("how many seconds have you been holding the brakes?");
            brakes = s.nextDouble();
        }
        else{
            System.out.println("Please check your spelling and enter a valid option");
            decision();
        }
    }

    static void calculation(){
        
        while(start == 1){
            time = (acc - brakes);
            total +=  time * speed;

            if (total > 0){
                System.out.println("Your current speed is " + total + "km/h");
                acc = 0;
                brakes = 0;
                decision();      
            }    
            else{
                System.out.println("Your current speed is 0km/h" );
                System.out.println("The car has stopped");
                start = 2;
            }
        }
    }

    public static void main(String[] args) {
        start();
        decision();
        calculation();
    }
}

