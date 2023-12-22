import java.util.Scanner;

public class dz_3_2 {
    public static void main(String[] args) {
        if (args.length > 0) {
            // Якщо текст передано через командний рядок
            String inputText = String.join(" ", args);
            String reversedText = reverseString(inputText);
            System.out.println("Вихідний текст: " + inputText);
            System.out.println("Текст у зворотному порядку: " + reversedText);
        } else {
            // Якщо текст передано з консолі
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введіть текст: ");
            String inputText = scanner.nextLine();
            String reversedText = reverseString(inputText);
            System.out.println("Текст у зворотному порядку: " + reversedText);
        }
    }

    private static String reverseString(String input) {

        return new StringBuilder(input).reverse().toString();
    }
}
