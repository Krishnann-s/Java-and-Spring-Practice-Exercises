// DESCRIPTION

/*
Oliver and his friend are playing a number game. If Oliver says a 4-digit number, his friend should reverse the number and expand the number.

If the number is not a 4-digit number, then print '<<number>> is an invalid number'.

Note:

- In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by   

  the user and the rest of the text represents the output.

- Adhere to the code template, if provided. 

- Please don't use System.exit(0) to terminate the program.

Sample Input/Output 1:

Enter the number

456

456 is an invalid number

Sample Input/Output 2

Enter the number

5864

Reversed number is 4685

4000+600+80+5

Sample Input/Output 3

Enter the number

3400

Reversed number is 43

40+3
 */

// SOLUTION

import java.util.Scanner;
public class ReverseAndExpand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if(n<1000 || n>9999){
            System.out.println(n+" is an invalid number");
        }else{
            int rev = 0;
            while(n>0){
                rev = rev*10 + n%10;
                n = n/10;
            }
            System.out.println("Reversed number is "+rev);
            int temp = rev;
            int count = 0;
            while(temp>0){
                count++;
                temp = temp/10;
            }
            temp = rev;
            while(temp>0){
                int rem = temp%10;
                if(count>1){
                    System.out.print(rem*(int)Math.pow(10,count-1)+"+");
                }else{
                    System.out.print(rem);
                }
                count--;
                temp = temp/10;
            }
        }
    }
}
