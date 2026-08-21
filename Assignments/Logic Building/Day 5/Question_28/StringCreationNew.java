public class StringCreationNew {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        boolean isEqual = str1 == str2;
        boolean isEqual2 = str1.equals(str2);
        System.out.println("Using == : " + isEqual);
        System.out.println("Using .equals(): " + isEqual2);
    }    
}
