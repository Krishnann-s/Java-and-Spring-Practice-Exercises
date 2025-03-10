// DESCRIPTION

/*
Johanna, a 5 - years old child, is learning the number names. She finds it difficult to learn all the words. To give more practice, her mom gives a number and asks her to write the number names separated by white space. Help her mom by writing a Java program to print the number names of the numbers, so that Johanna can verify the answers by herself.

Assume that she is learning from zero to nine.

Note:

- In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by   

  the user and the rest of the text represents the output.

- Adhere to the code template, if provided. 

- Please don't use System.exit(0) to terminate the program.


Sample Input 1

Enter the number

58723

Sample Output 1 

five eight seven two three 

Sample Input 2

Enter the number

614

Sample Output 2

six one four

Sample Input 3

Enter the number

20

Sample Output 3

two zero
 */

// SOLUTION

import java.util.Scanner;

public class NumberNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        
        String[] numInWords = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        if(n == 0){
            System.out.println(numInWords[0]);
        }
        else {
            StringBuilder words = new StringBuilder();

            while(n > 0) {
                int digit = n % 10;
                words.insert(0, numInWords[digit] + " ");
                n /= 10;
            }
            System.out.println(words.toString().trim());
        }
    }    
}
