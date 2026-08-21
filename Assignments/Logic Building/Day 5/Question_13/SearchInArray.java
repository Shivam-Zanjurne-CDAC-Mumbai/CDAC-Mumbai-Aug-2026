import java.util.Arrays;
import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int sz = sc.nextInt();
        Integer[] arr = new Integer[sz];

        System.out.println("Enter " + sz + " integers : ");
        for(int i = 0; i < sz; i++){
            int currN = sc.nextInt();
            arr[i] = currN;
        }
        
        System.out.println("Enter the number to search: ");
        int toFind = sc.nextInt();

        boolean ret = Arrays.asList(arr).contains(toFind);

        if (ret) System.out.println("Found");
        else System.out.println("Not Found");

        
        
    }    
}
