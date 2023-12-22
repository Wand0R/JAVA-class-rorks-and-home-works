import java.util.Scanner;

public class dz4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть значення x: ");
        double x = scanner.nextDouble();

        System.out.print("Введіть значення y: ");
        double y = scanner.nextDouble();

        double result = calculatePolynomial(x, y);

        System.out.println("Значення многочлена f(x, y) = " + result);
    }

    private static double calculatePolynomial(double x, double y) {
        double term1 = Math.pow(x, 3);
        double term2 = 3 * Math.pow(x, 2) * y;
        double term3 = 3 * x * Math.pow(y, 2);
        double term4 = Math.pow(y, 3);

        return term1 + term2 + term3 + term4;
    }
}
