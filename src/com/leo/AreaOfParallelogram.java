package com.leo;

import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // input base of the parallelogram
        System.out.print("Enter the base of the parallelogram: ");
        // reads the double entry of input of the base
        double base = in.nextDouble();

        //input the height of the parallelogram
        System.out.print("Enter the Height of the parallelogram: ");
        //reads the height of the parallelogram in double
        double height = in.nextDouble();

        // Area = base x height
        double area = base * height;
        System.out.println("Area of the parallelogram is: " + area);

        in.close();
    }

}
