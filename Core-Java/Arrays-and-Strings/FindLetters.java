// SOLUTION

import java.util.Scanner;

public class FindLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder res = new StringBuilder();

        System.out.println("Enter the word");
        String word = sc.nextLine();

        System.out.println("Enter 2 indices");
        int index1 = sc.nextInt();

        if(index1 > word.length()) {
            System.out.println(index1 + " is greater than the word length");
            return;
        }

        int index2 = sc.nextInt();
        if(index2 > word.length()) {
            System.out.println(index2 + " is greater than the word length");
        }
        else if( index2 > index1) {
            System.out.println("Index2 should be greaer than Index1");
        }
        else {
            for(int i = index1; i < index2; i++) {
                res.append(word.charAt(i));
            }
            System.out.println(res);
        }
    }
}