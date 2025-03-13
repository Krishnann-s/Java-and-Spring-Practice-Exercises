
import java.util.Arrays;
import java.util.Scanner;
public class SumOfMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int size = sc.nextInt();
        
        int arr[] = new int[size];

        if(size % 2 == 1) {
            System.out.println(size + " is an odd number.Please enter an even number");
        } else if(size <= 0) {
            System.out.println(size + " is an invalid array size.");
        } else {
            System.out.println("Enter the number");
            for(int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int maxSum = Integer.MIN_VALUE;

            for(int i = 0; i < size/2; i++) {
                int max = arr[size - 1 - i];
                int min = arr[i];
                int sum = min + max;

                if(sum > maxSum) {
                    maxSum = sum;
                }
            }
            System.out.println("The Maximum number is " + maxSum);
        }
    }
}
