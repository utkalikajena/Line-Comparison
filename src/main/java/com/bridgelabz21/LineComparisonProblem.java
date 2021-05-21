package com.bridgelabz21;

import java.util.Objects;

public class LineComparisonProblem {
    public static void main(String args[]){

       int x1 = 2 , x2 = 3 ,y1 = 4 , y2 = 6 ;
       int a1 = 3 , a2 = 5 , b1 = 1 , b2 = 7 ;

       double lengthOfLine1;
       double lengthOfLine2;

       lengthOfLine1 = Math.sqrt((x2 - x1)^2 + (y2 - y1)^2);
       lengthOfLine2 = Math.sqrt((a2 - a1)^2 + (b2 - b1)^2);

       System.out.println("The length of line1 is: " + lengthOfLine1);
       System.out.println("The length of line2 is: " + lengthOfLine2);

       System.out.print(Objects.equals(lengthOfLine1, lengthOfLine2));
       System.out.print(lengthOfLine1.compareTo(lengthOfLine2));
    }
}
