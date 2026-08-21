import java.util.Scanner;

public class ForEach {
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

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
