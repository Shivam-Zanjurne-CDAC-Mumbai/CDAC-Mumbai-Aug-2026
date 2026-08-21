public class StringMultiple {
    public static void main(String[] args) {
        //All from SCP same memory add
        String str1 = "java";
        String str2 = "java";
        String str3 = "java";

        //All from different heap addresses content same, addresses different
        // String str1 = new String("java");
        // String str2 = new String("java");
        // String str3 = new String("java");
        
        boolean isEqual = str1 == str2 && str2 == str3 && str1 == str3;
        System.out.println("All strings points to the same object : " + isEqual);
        
    }    
}
