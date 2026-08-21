import java.util.Scanner;

public class PositiveNegative {
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

    int cntPositives = 0;
    int cntNegatives = 0;

    for (int ele : arr) {
        if (ele >= 0)  cntPositives+=1;
        else cntNegatives-=1;
    }
 
    System.out.println("Positive numbers: " + cntPositives);
    System.out.println("Negative numbers: " + cntNegatives);
 }   
}
