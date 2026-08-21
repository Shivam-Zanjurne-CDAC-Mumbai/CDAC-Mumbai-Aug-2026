public class StringPool {
    public static void main(String[] args) {
        String s1 = new String("Hello"); //heap memory
        // String s2 = "Hello"; //SCP memory
        String s2 = s1.intern();// returns address from SCP
        String s3 = "Hello"; //SCP memory
        boolean isEqual = s3 == s2;
        boolean isEqual2 = s1 == s2; //false cuz s1 is in heap memory and s2 is from SCP memory
        System.out.println("is s2 and s3 pointing to same object : " + isEqual);   
        System.out.println("is s1 and s2 pointing to same object : " + isEqual2);   
    }    
}
