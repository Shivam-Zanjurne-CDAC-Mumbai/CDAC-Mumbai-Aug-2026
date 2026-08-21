import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s = sc.next();
        String rev = "";
        for(int i = s.length()-1; i >=0; i--){
            char currChar = s.charAt(i);
            rev += currChar;

        }
        // System.out.println(rev);
        // System.out.println(s);
        //'==' checks mem address of objects (reminder)
        if(s.equals(rev)){
            System.out.println("The String " + s + " is " + " a palindrome.");
        }
        else{
            System.out.println("The String " + s + " is " + "not a palindrome.");
        }
    }
    
}
