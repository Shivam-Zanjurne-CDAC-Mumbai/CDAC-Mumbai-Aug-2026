import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int sz = sc.nextInt();
        String[] s = new String[sz];
        
        for (int i = 1; i <= sz; i++) {
            System.out.println("Enter name " + i + ":");
            String currName = sc.next();
            s[i-1] = currName;
        }
        System.out.println("----------Output---------");
        for (String ele : s) {
            System.out.println(ele);
        }

    }    
}
