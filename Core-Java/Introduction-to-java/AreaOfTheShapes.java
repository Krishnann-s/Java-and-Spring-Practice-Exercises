// DESCRIPTION

/*
The fourth standard teacher teaches the area of Basic Shapes to the students. The teacher shows certain shapes, the student is asked to identify the shapes based on the number of sides and calculate the area. Write a java program to find the shape and calculate the area. 

If the number of sides is 0, it is a circle. Get the radius and calculate the area using the formula area = 3.14 * radius * radius.

If the number of sides is 3, it is a triangle. Get the base and height and calculate the area using the formula area= (base * height)/2.

If the number of sides is 4, get the length and breadth. If the length and breadth are equal, it is a square. Calculate the area using the formula area = length * length. If the length and breadth are different, it is a rectangle. Calculate the area using the formula area = length * breadth.

If any other value is entered for the number of sides, print "Invalid side".

Note:

- In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by   

  the user and the rest of the text represents the output.

- Adhere to the code template, if provided. 

- Please don't use System.exit(0) to terminate the program.

- Area should have only 2 decimal places.



Sample Input 1:

Enter the sides

3

Enter the base and height

5.2

7.8

Sample Output 1:

Area of the Triangle is 20.28



Sample Input 2:

Enter the sides

0

Enter the radius

5.5

Sample Output 2:

Area of the Circle is 94.99



Sample Input 3:

Enter the sides

4

Enter the length

8.5

Enter the breadth

5.2

Sample Output 3:

Area of the Rectangle is 44.20



Sample Input 4:

Enter the sides

4

Enter the length

8.5

Enter the breadth

8.5

Sample Output 4:

Area of the Square is 72.25



Sample Input 5:

Enter the sides

2

Sample Output 5:


Invalid side
 */

// SOLUTION

import java.util.Scanner;

public class AreaOfTheShapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides");
        int sides = sc.nextInt();
        AreaOfTheShapes areaOfTheShapes = new AreaOfTheShapes();
        if (sides == 0) {
            System.out.println("Enter the radius");
            double radius = sc.nextDouble();
            areaOfTheShapes.calculateAreaOfCircle(radius);
        } else if (sides == 3) {
            System.out.println("Enter the base and height");
            double base = sc.nextDouble();
            double height = sc.nextDouble();
            areaOfTheShapes.calculateAreaOfTriangle(base, height);
        } else if (sides == 4) {
            System.out.println("Enter the length");
            double length = sc.nextDouble();
            System.out.println("Enter the breadth");
            double breadth = sc.nextDouble();
            areaOfTheShapes.calculateAreaOfRectangle(length, breadth);
        } else {
            System.out.println("Invalid side");
        }
    }

    public void calculateAreaOfCircle(double radius) {
        double area = 3.14 * radius * radius;
        System.out.printf("Area of the Circle is %.2f", area);
    }

    public void calculateAreaOfTriangle(double base, double height) {
        double area = (base * height) / 2;
        System.out.printf("Area of the Triangle is %.2f", area);
    }

    public void calculateAreaOfRectangle(double length, double breadth) {
        if (length == breadth) {
            double area = length * length;
            System.out.printf("Area of the Square is %.2f", area);
        } else {
            double area = length * breadth;
            System.out.printf("Area of the Rectangle is %.2f", area);
        }
    }
}