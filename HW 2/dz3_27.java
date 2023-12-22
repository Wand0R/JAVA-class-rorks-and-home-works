import java.util.Scanner;

public class dz3_27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введіть радіус основи конуса: ");
        double radius = scanner.nextDouble();

        System.out.print("Введіть висоту конуса: ");
        double height = scanner.nextDouble();

        // V = (1/3) * pi * r^2 * h
        double volume = (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;

        System.out.println("Об'єм конуса: " + volume);
    }
}
