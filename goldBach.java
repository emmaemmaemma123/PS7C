import java.util.ArrayList;
public class goldBach{
    public static boolean isPrime(int n) {
        if (n<2) {
            return false;
        }
        for (int i=2; i*i<=n; i++) {
        if (n%i == 0) {
            return false;
            }
        }
        return true;
    }
    public static void goldbach(int n) {
        if (n <= 2 || n % 2 != 0) {
            System.out.println("Input must be an even number greater than 2.");
            return;
        }

        for (int i=2; i <= n / 2; i++) {
            if (isPrime(i) && isPrime(n-i)) {
                System.out.println(n + " = " + i + " + " + (n - i));
                return;
            }
        }
    }
}