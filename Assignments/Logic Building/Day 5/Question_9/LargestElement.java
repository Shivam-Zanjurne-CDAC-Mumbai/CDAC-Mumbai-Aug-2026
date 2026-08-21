import java.util.Arrays;
import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int sz = sc.nextInt();
        int[] arr = new int[sz];

        for(int i = 0; i < sz; i++){
            System.out.println("Enter number :");
            int currN = sc.nextInt();
            arr[i] = currN;
        }

        int max = Arrays.stream(arr).max().getAsInt();

        System.out.print("The largest element is: " + max);
    }    
}
