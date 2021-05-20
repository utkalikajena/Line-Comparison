package com.bridgelabz21;

public class LineComparisonProblem {
    public static void main(String args[]){
       int x1 = 2 , x2 = 3 ,y1 = 4 , y2 = 6 ;

       double lengthOfLine1;
       lengthOfLine1 = Math.sqrt((x2 - x1)^2 + (y2 - y1)^2);

       System.out.println("The length of line1 is: " + lengthOfLine1);
    }
}
