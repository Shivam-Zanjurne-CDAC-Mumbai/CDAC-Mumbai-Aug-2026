import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s = sc.next();
        String rev = "";
        for(int i = s.length()-1; i >=0; i--){
            char currChar = s.charAt(i);
            rev += currChar;

        }
        System.out.println(rev);

    }    
}
