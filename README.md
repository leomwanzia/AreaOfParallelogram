# AreaOfParallelogram

Explanation of Each Line:
import java.util.Scanner;:

This line imports the Scanner class from the java.util package. The Scanner class is used to read input from the user.

    public class AreaOfParallelogram {:

This line declares a public class named AreaOfParallelogram. In Java, every program must have at least one class, and the class name should match the file name (e.g., AreaOfParallelogram.java).

    public static void main(String[] args) {:

This line declares the main method, which is the entry point of the program. The public keyword means that the method can be accessed from outside the class. The static keyword means that the method belongs to the class rather than an instance of the class. The void keyword means that the method does not return any value. The main method takes an array of strings (String[] args) as a parameter, which can be used to pass command-line arguments to the program.

    Scanner in = new Scanner(System.in);:

This line creates a new Scanner object named in that is used to read input from the standard input (usually the keyboard).
  
    System.out.print("Enter the base of the parallelogram: ");:

This line prompts the user to enter the base of the parallelogram. The System.out.print method is used instead of System.out.println to keep the cursor on the same line after printing the prompt.

    double base = in.nextDouble();:
    
This line reads the input from the user as a double and assigns it to the variable base.

    System.out.print("Enter the height of the parallelogram: ");:

This line prompts the user to enter the height of the parallelogram.

    double height = in.nextDouble();:

This line reads the input from the user as a double and assigns it to the variable height.

    double area = base * height;:

This line calculates the area of the parallelogram using the formula area = base * height. The result is stored in the area variable.

    System.out.println("The area of the parallelogram is: " + area);:

This line prints the calculated area to the console. The System.out.println method is used to print the string and move the cursor to the next line. The + operator is used to concatenate the string with the value of the area variable.

    in.close();:

This line closes the Scanner object to free up system resources. It is a good practice to close the Scanner when you are done with it.

    Summary:
The program prompts the user to input the base and height of a parallelogram.

It calculates the area using the formula area = base * height.

Finally, it prints the calculated area to the console.
