import java.util.Scanner;

public class dz_4_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть рядок: ");
        String input = scanner.nextLine();

        if (hasTwoSymmetricSubstrings(input)) {
            System.out.println("Рядок складається з двох симетричних підрядків.");
        } else {
            System.out.println("Рядок не складається з двох симетричних підрядків.");
        }
    }

    private static boolean hasTwoSymmetricSubstrings(String input) {
        int length = input.length();

        for (int i = 1; i < length; i++) {
            String firstSubstring = input.substring(0, i);
            String secondSubstring = input.substring(i);

            if (isSymmetric(firstSubstring) && isSymmetric(secondSubstring)) {
                return true;
            }
        }

        return false;
    }

    private static boolean isSymmetric(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
