import java.util.Scanner;

public class dz_4_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть коефіцієнти a, b і c для біквадратного рівняння ax^2 + bx + c = 0:");

        System.out.print("a = ");
        double a = scanner.nextDouble();

        System.out.print("b = ");
        double b = scanner.nextDouble();

        System.out.print("c = ");
        double c = scanner.nextDouble();

        solveQuadraticEquation(a, b, c);
    }

    private static void solveQuadraticEquation(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Рівняння має два дійсних корені: " + root1 + " і " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Рівняння має один дійсний корінь: " + root);
        } else {
            System.out.println("Рівняння не має дійсних коренів (коренів немає в області дійсних чисел).");
        }
    }
}
