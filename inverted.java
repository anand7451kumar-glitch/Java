import java.util.Scanner;

public class inverted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {          // rows: i = 1 to n
            for (int j = 1; j <= n - i + 1; j++) { // columns: j = 1 to n-i+1
                System.out.print(j + " ");
            }
            System.out.println();               // move to next line
        }
        sc.close();
    }
}