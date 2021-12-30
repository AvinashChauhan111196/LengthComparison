package com.comparison;

public class LengthComparison {

    public static void main(String[] args)
    {
        System.out.println("Welcome to Line Comparison Computation ");
        
        int x1,x2,y1,y2;
        double length1;
        x1 = 20;
        x2 = 30;
        y1 = 10;
        y2 = 20;
        length1 = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        System.out.println("The length of line1 " + length1);
    }
}
