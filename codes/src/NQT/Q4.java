package NQT;
//PRINT ALL THE DEVISIOR
import java.util.*;

public class Q4 {
    public static void printDivisor(int n) {
        List<Integer> small = new ArrayList<>();
        List<Integer> large = new ArrayList<>();

        for (int i = 1; i * (long)i <= n; i++) {
            if (n % i == 0) {           // ✅ correct divisor check
                small.add(i);

                if (i != n / i) {      // ✅ avoid duplicate for perfect squares
                    large.add(n / i);
                }
            }
        }

        // Printing in ascending order
        for (int d : small) {
            System.out.print(d + " ");
        }
        for (int i = large.size() - 1; i >= 0; i--) {
            System.out.print(large.get(i) + " ");
        }
    }

    public static void main(String args[]) {
        printDivisor(40);   // Output: 1 2 4 5 8 10 20 40
    }
}