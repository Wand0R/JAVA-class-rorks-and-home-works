import java.util.Scanner;

public class dz_1_9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть кількість чисел у масиві: ");
        int count = scanner.nextInt();

        int[] array = new int[count];

        System.out.print("Введіть числа: ");
        for (int i = 0; i < count; i++) {
            array[i] = scanner.nextInt();
        }

        int maxUnique = findMaxUnique(array);
        if (maxUnique != -1) {
            System.out.println("Найбільше число з унікальними цифрами: " + maxUnique);
        } else {
            System.out.println("У масиві немає чисел з унікальними цифрами.");
        }
    }

    public static int findMaxUnique(int[] arr) {
        int maxUnique = -1;

        for (int num : arr) {
            if (areDigitsUnique(num) && num > maxUnique) {
                maxUnique = num;
            }
        }

        return maxUnique;
    }

    public static boolean areDigitsUnique(int num) {
        boolean[] digits = new boolean[10];

        while (num > 0) {
            int digit = num % 10;
            if (digits[digit]) {
                return false;
            }
            digits[digit] = true;
            num /= 10;
        }

        return true;
    }
}
