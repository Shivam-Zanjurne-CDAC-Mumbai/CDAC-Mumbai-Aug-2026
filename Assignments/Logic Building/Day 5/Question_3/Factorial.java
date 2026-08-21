import java.util.Scanner;

public class Factorial {

    // static int fact(int n){
    //     if (n == 0)
    //         return 1;
    //     return n * fact(n-1);
    // }
    public static void main(String[] args) {
        // int res  = fact(5);
        //System.out.print(res);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact *= i;
        }
        System.out.print("Factorial of " + n + " is " + fact);


    }
}
