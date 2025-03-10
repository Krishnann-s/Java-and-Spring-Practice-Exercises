// DESCRIPTION

/*
Jerry checks his height in the nearest gym. The gym has only metric units for measuring the height i.e., the height is available in centimeter. Jerry wants to convert it to feet. Help him with a java program to convert centimeter to feet. Display the result correct to 2 decimal places.

Hint: 1 foot = 30.48 centimeter

Note:

Ensure to follow the object-oriented specifications provided in the question description.

Ensure to provide the names for classes, attributes, and methods as specified in the question description.

Adhere to the code template, if provided.

Please ignore the warning message that appears during compilation in the compilation window.

Please do not use System.exit(0) to terminate the program.


Sample Input :

Enter height in cm

153.65

Sample Output :

Height in feet is 5.04 feet
 */


// SOLUTION

import java.util.Scanner;

public class HeightConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height in cm");
        double height = sc.nextDouble();
        System.out.printf("Height in feet is %.2f feet", height / 30.48);
    }
}