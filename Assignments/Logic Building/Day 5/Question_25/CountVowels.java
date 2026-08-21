import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s = sc.next();
        int countVowels = 0;
        char[] vowels = {'a','e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        for(int i = 0; i < s.length(); i++){
            char currChar = s.charAt(i);
            for(char currVowel : vowels){
                if (currChar == currVowel)
                    countVowels++;
            }
        }
        System.out.println("The number of vowels in " + s + " is " + countVowels);
    }    
}
