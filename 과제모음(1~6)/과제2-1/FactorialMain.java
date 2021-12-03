import java.util.Scanner;

public class FactorialMain {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int inputNum = scanner.nextInt();
        int facNum = 1;
        for(int i = 1; i <= inputNum; i++){
            System.out.printf("Factorial of %d = %d\n", facNum, getFactorial(facNum));
            facNum += 1;
        }
    }
    private static long getFactorial(final int n){
        long num = 1;
        for(int i = 1; i <= n; i++){
            num *= i;
        }
        return num;
    }
}
