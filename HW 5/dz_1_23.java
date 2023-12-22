import java.util.Scanner;

public class dz_1_23 {

    public static void coinChange(int N) {
        int[] coins = {50, 10, 5, 1};
        int i = 0;

        while (N > 0) {
            if (N >= coins[i]) {
                int count = N / coins[i];
                N -= count * coins[i];
                System.out.println(coins[i] + " коп * " + count);
            }
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість пенні: ");
        int N = scanner.nextInt();

        coinChange(N);

        scanner.close();
    }
}
