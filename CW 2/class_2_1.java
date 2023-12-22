package class_work_2;
import java.util.Scanner;

public class class_2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть прізвище: ");
        String surname = scanner.nextLine();

        System.out.println("Привіт, " + surname);
    }
}
