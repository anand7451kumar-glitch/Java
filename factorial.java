import java.util.Scanner;
import java.math.BigInteger;

public class f4 {
    public static void printFactorial(int n) {
        BigInteger factorial = BigInteger.ONE;

        for (int i = n; i >= 1; i--) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        System.out.println(factorial);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printFactorial(n);
    }
}
