// DESCRIPTION

/*
Across the world, millions of plants produce oxygen for millions of people. Levi is experimenting with oxygen production in an airtight room. He calculates the total number of plants that can be placed in a room based on the floor area of the room. Plant sets should be a multiple of 10, if not they should be rounded to the nearest and the lowest multiple of 10. Also, a mature plant produces 0.9 litres of oxygen per day. Calculate the total production of oxygen based on the total number of plants in the room using Java program.

Note:

m denotes Meter and cm denotes Centimeter. 
To convert cm2 to m2, divide it by 100*100.
If the length of the room is negative or zero print "Invalid length" and terminate the program.
If breadth of the room is negative or zero print "Invalid breadth" and terminate the program.
If the plant area is zero or negative print "Invalid plant area" and terminate the program.
The output format should be in two decimal places. Use "System.out.printf("%.2f",percentage);" for 2 digits after the decimal points.
In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.
Ensure to follow the object-oriented specifications provided in the question description.
Ensure to provide the names for classes, attributes, and methods as specified in the question description.
Adhere to the code template, if provided.
Please do not use System.exit(0) to terminate the program.
 

Sample Input 1

Enter the length of the room(in m)

4

Enter the breadth of the room(in m)

4

Enter the plant area of a single plant(in cm2)

625

Sample Output 1

Total number of plants is 250

Total oxygen production is 225.00 litres

 

Explanation:

Total plants = floor area ( in m2 )/plant area ( in m2 )

Total plants = ( 4*4 / 625 )*100*100 = 256 ~250 ( Round it the nearest and lowest multiple of 10 )

Total Production of Oxygen = 250*0.9 = 225



Sample Input 2

Enter the length of the room(in m)

-5

Sample Output 2

Invalid length



Sample Input 3

Enter the length of the room(in m)

8

Enter the breadth of the room(in m)

-4

Sample Output 3

Invalid breadth



Sample Input 4

Enter the length of the room(in m)

5

Enter the breadth of the room(in m)

5

Enter the plant area of a single plant(in cm2)

-8

Sample Output 4

Invalid plant area
 */

// SOLUTION

import java.util.Scanner;
public class OxygenPlants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the room(in m)");
        int length = sc.nextInt();
        if(length<=0){
            System.out.println("Invalid length");
            return;
        }
        System.out.println("Enter the breadth of the room(in m)");
        int breadth = sc.nextInt();
        if(breadth<=0){
            System.out.println("Invalid breadth");
            return;
        }
        System.out.println("Enter the plant area of a single plant(in cm2)");
        int plantArea = sc.nextInt();
        if(plantArea<=0){
            System.out.println("Invalid plant area");
            return;
        }
        int totalPlants = (length*breadth*100*100)/plantArea;
        totalPlants = (totalPlants/10)*10;
        System.out.println("Total number of plants is "+totalPlants);
        double totalOxygen = totalPlants*0.9;
        System.out.printf("Total oxygen production is %.2f litres",totalOxygen);
    }
}