import java.util.Scanner;

public class AverageNumbers {
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

        int sum = 0;
        for (int ele : arr) {
            sum += ele;
        }
        float average = sum/sz;

        System.out.print("The average of the numbers is: " + average);
    }
}
