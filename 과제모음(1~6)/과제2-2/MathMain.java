import java.util.Scanner;

public class MathMain {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a begin number: ");
        int begin = scanner.nextInt();
        System.out.println("Enter an end number: ");
        int end = scanner.nextInt();
        // SumNum
        long sum = getSumBetween(begin, end);
        System.out.printf("Sum between %d and %d : %,d%n", begin, end, sum);
        // ProductNum
        long product = getProductBetween(begin, end);
        System.out.printf("Product between %d and %d : %,d%n", begin, end, product);
    }
    private static int getSumBetween(int n1, int n2){
        int sum = 0;
        for(int i = n1; i <= n2; i++){
            sum += i;
        }
        return sum;
        //        int sum = 0;
//        int ans1 = (n1*(n1-1))/2;
//        int ans2 = (n2*(n2+1))/2;
//        sum = ans2 - ans1;
//        return sum; // another method
    }
    private static int getProductBetween(int n1, int n2){
        int prod = 1;
        for(int i = n1 ; i <= n2; i++){
            prod *= i;
        }
        return prod;
    }
}
