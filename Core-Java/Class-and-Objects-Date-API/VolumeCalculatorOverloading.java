// DESCRIPTION

/*
Sarah got confused to calculate volume of cylinder and cuboid. Write a Java application to help Sarah to do this.

Requirement: Calculate the volume.

Component Specification:  VolumeCalculator

Component Name
Calculate the Volume of the Cylinder

Type(Class)
VolumeCalculator

Methods
public double calculateVolume(double radius,double height)

Responsibilities
This method calculates the volume of the cylinder and returns the calculated volume of the cylinder

Formula

Volume of the cylinder =

3.14*radius*radius*height


Component Name
Calculate the Volume of the Cuboid

Type(Class)
VolumeCalculator

Methods
public double calculateVolume(int length,int breadth,int height)

Responsibilities
This method calculates the volume of the cuboid and returns the calculated volume of the cuboid

Formula

Volume of the cuboid =

length*breadth*height

 
Note: The class and methods should be declared as public and all the attributes should be declared as private. 

Example

Length = 3

Breadth = 2

Height = 1

Formula

Volume of the Cuboid = length*breadth*height

Volume of the Cuboid = 3*2*1= 6.00.

 

In the UserInterface class, write the main method to test the application.

 Note:

-         The output format should be in two decimal places. Use "System.out.printf("%.2f",percentage);" for 2 digits after the decimal points.

-         In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.

-         Ensure to follow the object-oriented specifications provided in the question description.

-         Ensure to provide the names for classes, attributes, and methods as specified in the question description.

-         Adhere to the code template, if provided.

-         Please do not use System.exit(0) to terminate the program

 

Sample Input 1:

Enter the choice
1.Find Volume For Cylinder
2.Find Volume For Cuboid
1
Enter the radius
3
Enter the height
2

Sample Output 1:

Volume of the Cylinder is 56.52



Sample Input 2:
Enter the choice
1.Find Volume For Cylinder
2.Find Volume For Cuboid
2

Enter the length
3
Enter the breadth
2
Enter the height
1


Sample Output 2:

Volume of the Cuboid is 6.00
 */

// SOLUTION

import java.util.Scanner;

public class VolumeCalculatorOverloading {
    public static class VolumeCalculator {
        private double radius;
        private double heightOfCylinder;
        private int length;
        private int breadth;
        private int height;

        public double getRadius() {
            return radius;
        }
        public void setRadius(double radius) {
            this.radius = radius;
        }
        public double getHeightOfCylinder() {
            return heightOfCylinder;
        }
        public void setHeight(double heightOfCylinder) {
            this.heightOfCylinder = heightOfCylinder;
        }
        public int getLength() {
            return length;
        }
        public void setLength(int length) {
            this.length = length;
        }
        public int getBreadth() {
            return breadth;
        }
        public void setBreadth(int breadth) {
            this.breadth = breadth;
        }
        public int getHeight() {
            return height;
        }
        public void setHeight(int height) {
            this.height = height;
        }

        public VolumeCalculator() {
        }
        public double calculateVolume(double radius, double height) {
            return 3.14 * radius * radius * height;
        }

        public double calculateVolume(int length, int breadth, int height) {
            return length * breadth * height;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the choice");
        System.out.println("1.Find Volume For Cylinder");
        System.out.println("2.Find Volume For Cuboid");
        int choice = sc.nextInt();

        VolumeCalculator vc = new VolumeCalculator();

        if (choice == 1) {
            System.out.println("Enter the radius");
            double radius = sc.nextDouble();
            System.out.println("Enter the height");
            double height = sc.nextDouble();
            System.out.printf("Volume of the Cylinder is %.2f", vc.calculateVolume(radius, height));
        } else if (choice == 2) {
            System.out.println("Enter the length");
            int length = sc.nextInt();
            System.out.println("Enter the breadth");
            int breadth = sc.nextInt();
            System.out.println("Enter the height");
            int height = sc.nextInt();
            System.out.printf("Volume of the Cuboid is %.2f", vc.calculateVolume(length, breadth, height));
        }
    }
}