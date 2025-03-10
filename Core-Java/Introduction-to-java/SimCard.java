// DESCRIPTION

/*
Rahul is planning to buy a new sim card for his new phone. He wishes to buy a phone number where sum of odd numbers in phone number must be equal to the even numbers present in the phone number. Write a Java code to help him to find the right phone number.

Requirements:

-       Use long datatype for Phone number.

-       If the sum of the odd numbers and sum of the even numbers in the phone number are equal, print as "Sum of odd and even are equal".

-       If the sum of the even numbers is greater than the sum of the odd numbers in the phone number, then print as "Sum of even is greater than sum of odd".

-       If the sum of the odd numbers is greater than the sum of the even numbers in the phone number, then print as "Sum of odd is greater than sum of even".

 

Note:

-       In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.

-       Ensure to follow the object-oriented specifications provided in the question description.

-       Ensure to provide the names for classes, attributes, and methods as specified in the question description.

-       Adhere to the code template, if provided.

 

Please do not use System.exit(0) to terminate the program.

 

Sample Input/Output 1:

Enter the phone number

9719112322

Sum of odd is greater than sum of even

 

Sample Input/Output 2:

Enter the phone number

8287123456

Sum of even is greater than sum of odd

 

Sample Input/Output 3:

Enter the phone number

1551462

Sum of odd and even are equal
 */

// SOLUTION

import java.util.Scanner;

public class SimCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the phone number");
        long phoneNumber = sc.nextLong();
        SimCard simCard = new SimCard();
        simCard.checkSum(phoneNumber);
    }

    public void checkSum(long phoneNumber) {
        long evenSum = 0;
        long oddSum = 0;
        while (phoneNumber > 0) {
            long digit = phoneNumber % 10;
            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
            phoneNumber = phoneNumber / 10;
        }
        if (evenSum == oddSum) {
            System.out.println("Sum of odd and even are equal");
        } else if (evenSum > oddSum) {
            System.out.println("Sum of even is greater than sum of odd");
        } else {
            System.out.println("Sum of odd is greater than sum of even");
        }
    }
}