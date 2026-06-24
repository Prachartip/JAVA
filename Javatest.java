package javatest;

import java.util.Scanner;

public class Javatest {
   static double average(double array[]){
       double sum = 0;
       double average;
        for(int i=0;i<array.length;i++)
            sum=sum+array[i];
        average = sum/array.length;
        return average;
    }
    public static void main(String[] args) {
        int x,i;
        double av ;
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("How many number of array");
         x = input.nextInt();
         
        double[] arr = new double[x];
        
        for(i=0;i<x;i++){
            System.out.println("Enter number"+(i+1)+" : ");
            arr[i] = input.nextDouble();
        }
     System.out.println("Member of Array");
        for (i=0;i<x;i++)
            System.out.println(arr[i]);
        
        av = average(arr);
        System.out.println("average is"+av);
       
        
        
        /*
        System.out.println("Enter x: ");
        x =input.nextInt();
        System.out.println("Enter y: ");
        y =input.nextDouble();
        System.out.println(x+y);
        */
    }
    
}
