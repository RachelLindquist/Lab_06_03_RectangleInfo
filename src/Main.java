import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {


        //Write a program that asks the user for the lengths of the sides of a rectangle.
        // Again, check for valid input and exit with an error msg if you don’t get it.
        // Testing: use some known values to confirm that the calculations are correct.
        // E.g. 3 – 4 - 5 triangle >> 3 X 4 rectangle

        Scanner in = new Scanner(System.in);

        double length = 0;
        double width = 0;

        String trash = ""; // use for bad input which will read as a String
        System.out.println("Please enter the length of a rectangle");
        if(in.hasNextDouble())
        {
            // OK safe to read in a double
            length = in.nextDouble();
            in.nextLine(); // clears the newline from the buffer
        }
        else
        {
            // Not a double can’t use nextDouble() read as String with nextLine() instead
            trash = in.nextLine();
            System.out.println("\nYou entered " + trash);
            System.out.println("Run the program again and enter a valid amount!");
            System.exit(0);  // terminate the program
        }
        System.out.println("Please enter the width of a rectangle");
        if(in.hasNextDouble())
        {
            // OK safe to read in a double
            width = in.nextDouble();
            in.nextLine(); // clears the newline from the buffer
        }
        else
        {
            // Not a double can’t use nextDouble() read as String with nextLine() instead
            trash = in.nextLine();
            System.out.println("\nYou entered " + trash);
            System.out.println("Run the program again and enter a valid amount!");
            System.exit(0);  // terminate the program
        }

        //Then print
        // The area and perimeter of the rectangle
        //The length of the diagonal (use the Pythagorean theorem)

        double area = length * width;
        double perimeter = length * 2 + width * 2;
        double diagonal = Math.sqrt(length*length + width*width);

        System.out.println("The area of your rectangle is " + area);
        System.out.println("The perimeter of your rectangle is " + perimeter);
        System.out.println("The diagonal length of your rectangle is " + diagonal);

    }
}