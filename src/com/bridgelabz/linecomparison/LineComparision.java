package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class LineComparision{
    static double length1, length2, length;
    static int x1, x2, y1, y2;
    public static void coordinate(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Values for x1, x2, y1, y2 : ");
        
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y1 = sc.nextInt();
        int y2 = sc.nextInt();

        length = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)); // lenths

        }
        public static void calLength(){
            System.out.println("Enter Value For First Line");
            coordinate();
            length1 = length;
            System.out.println("Enter Value For Second Line");
            coordinate();
            length2 = length;
            System.out.println("Length of Line1 : "+ length1);
             System.out.println("Length of Line2 : "+ length2);
        }

        public static void compareLines(){
            if(length1 == length2){
                System.out.print("Both Lines are equal");
            }
            else if(length1>length2){
                System.out.print("Line1 is greater than Line2");
            }
            else{
                System.out.print("Line2 is greater than Line1");
            }
        }

        public static void main(String args[]){
            calLength();
            compareLines();
        }

}

    
