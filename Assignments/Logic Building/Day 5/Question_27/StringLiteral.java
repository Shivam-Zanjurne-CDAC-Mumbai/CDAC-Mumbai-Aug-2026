public class StringLiteral {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        boolean isEqual = str1 == str2;
        // boolean isEqual2 = str1.equals(str2);
        System.out.println("Both variables point to the same object: " + isEqual);
        
    }    
}
