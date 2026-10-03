import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            int sum = a;
            int power = 1; // 2^0

            for (int j = 0; j < n; j++) {
                sum += power * b;
                System.out.print(sum);

                if (j < n - 1) {
                    System.out.print(" ");
                }

                power *= 2;
            }

            System.out.println();
        }

        sc.close();
    }
}
