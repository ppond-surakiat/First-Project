package com.project;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        System.out.println( "Hello, This is my first Java project on the first git repository!" );
        System.out.println( "Thanks for watching.\n" );

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if(age >= 20) {
            System.out.print("Are you sure you are an adult? (yes/no): ");
            String isSure = sc.next();
            if(isSure.equalsIgnoreCase("yes")) {
                System.out.print("Enter your country: ");
                String country = sc.next();
                System.out.println("Hello " + name + ", you are an adult from " + country + ".");
            } else {
                System.out.println("You are not an adult.");
            }
         } else if(age >= 13 && age < 20) {
            System.out.println("Hello " + name + ", you are a teenager.");
        } else {
            System.out.println("Hello " + name + ", you are a minor.");
        }

        sc.close();

    }
}