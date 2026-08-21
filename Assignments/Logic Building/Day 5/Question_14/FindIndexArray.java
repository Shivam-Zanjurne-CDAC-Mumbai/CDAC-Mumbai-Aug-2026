import java.util.Arrays;
import java.util.Scanner;

public class FindIndexArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int sz = sc.nextInt();
        int[] arr = new int[sz];

        System.out.println("Enter " + sz + " integers : ");
        for(int i = 0; i < sz; i++){
            int currN = sc.nextInt();
            arr[i] = currN;
        }
        System.err.println("Enter the number to search: ");
        int toFind = sc.nextInt();
        int idx = Arrays.binarySearch(arr, toFind);
        if (idx > 0){
            System.out.println("The number " + toFind + " is found at index " + idx);
        }
        else
            System.out.println("Element not present");


    }    
}
