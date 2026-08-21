import java.util.Scanner;

public class SumOfElementsArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int sz = sc.nextInt();
        int[] arr = new int[sz];
        
        for (int i = 0; i < sz; i++) {
            System.out.println("Enter " + i + " index value");
            int x = sc.nextInt();
            arr[i] = x;
        }

        int sum = 0;
        for (int ele : arr) {
            sum += ele;
        }
        System.out.print("The sum of all numbers is " + sum);

    }
}
