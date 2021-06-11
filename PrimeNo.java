import java.util.Scanner;

public class PrimeNo {
    public static void primenos(int start, int end) {
        // to print prime nos
        for (int i = start; i <= end; i++) {
            // method call--prime logic
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int n) {
        int m = n / 2;

        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= m; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number : ");
        int start = sc.nextInt();
        System.out.print("Enter the 2nd number : ");
        int end = sc.nextInt();
        System.out.println("List of prime numbers between " + start + " and " + end);
        primenos(start, end);
    }
}