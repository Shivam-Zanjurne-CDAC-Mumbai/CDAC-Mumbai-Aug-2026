public class MultiplicationTable {
    void printMultiplicationTable(int n){
        for(int i = 1; i <= 10; i++){
            System.out.println(n + " " + "x " + i + " = " + n*i);
        }
    }
    public static void main(String[] args) {
        MultiplicationTable obj1 = new MultiplicationTable();
        obj1.printMultiplicationTable(5);
    }    
}
