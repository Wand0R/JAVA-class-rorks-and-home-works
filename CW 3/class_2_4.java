package class_work_3;

import java.util.Scanner;

public class class_2_4 {
    public static int modify(int n, int p, int b) {
        int a = 1 << p;
        return ((n & ~a) | (b << p));
    }

    public static int nth_value(int n, int m) {
        return ((n >> (m-1)) & 1);
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n = ");
        int n = scanner.nextInt();

        System.out.print("m = ");
        int m = scanner.nextInt();

        System.out.println(modify(n, m, nth_value(n, m)));

        scanner.close();
    }
}
