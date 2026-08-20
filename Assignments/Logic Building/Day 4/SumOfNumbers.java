public class SumOfNumbers {
    void calculateSum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++){
            System.out.println(i);
            sum += i;
        }
        System.out.println("The sum of numbers from 1 to " + n + " is: " + sum);

    }
    public static void main(String[] args) {
        SumOfNumbers obj1 = new SumOfNumbers();
        obj1.calculateSum(5);
    }    
}
