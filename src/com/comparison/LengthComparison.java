package com.comparison;

public class LengthComparison
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Line Comparison Computation ");

        int x1,x2,y1,y2,x3,x4,y3,y4;
        double length1,length2;
        x1 = 20;
        x2 = 30;
        y1 = 10;
        y2 = 20;
        x3 = 20;
        x4 = 30;
        y3 = 10;
        y4 = 20;
        length1 = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        System.out.println("The length of line1 " + length1);
        length2 = Math.sqrt(Math.pow(x4-x3,2) + Math.pow(y4-y3,2));
        System.out.println("The length of line2 " + length2);

        if (length1 == length2)
        {
            System.out.println("Length of both line is equal");
        }
        else if (length1 < length2)
        {
            System.out.println("Length of line1 is less than line2");
        }
        else if (length1 > length2)
        {
            System.out.println("Length of line1 is greater than length2");
        }

        Double d1 = new Double(length1);
        Double d2 = new Double(length2);
        System.out.println(d1.equals(d2));
        System.out.println(d1.compareTo(d2));
    }
}
