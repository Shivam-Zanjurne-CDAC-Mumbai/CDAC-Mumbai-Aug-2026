import java.util.Scanner;

class Positive_Number{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int N = scanner.nextInt();
        if (N > 0){
            System.out.println("Number Is Positive");
        }else{
            System.out.println("Number Is Not Positive");
        }
        
    }
}