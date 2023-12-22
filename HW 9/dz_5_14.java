import java.util.Scanner;

class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void display() {
        System.out.println(numerator + "/" + denominator);
    }

    public Fraction addition(Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction subtraction(Fraction other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction multiplication(Fraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction division(Fraction other) {
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new Fraction(newNumerator, newDenominator);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть чисельник першого дробу:");
        int numerator1 = scanner.nextInt();

        System.out.println("Введіть знаменник першого дробу:");
        int denominator1 = scanner.nextInt();

        Fraction fraction1 = new Fraction(numerator1, denominator1);

        System.out.println("Введіть чисельник другого дробу:");
        int numerator2 = scanner.nextInt();

        System.out.println("Введіть знаменник другого дробу:");
        int denominator2 = scanner.nextInt();

        Fraction fraction2 = new Fraction(numerator2, denominator2);

        System.out.println("Перший дріб: ");
        fraction1.display();

        System.out.println("Другий дріб: ");
        fraction2.display();

        Fraction sum = fraction1.addition(fraction2);
        Fraction difference = fraction1.subtraction(fraction2);
        Fraction product = fraction1.multiplication(fraction2);
        Fraction quotient = fraction1.division(fraction2);


        System.out.println("Сума: ");
        sum.display();

        System.out.println("Різниця: ");
        difference.display();

        System.out.println("Добуток: ");
        product.display();

        System.out.println("Частка: ");
        quotient.display();

        scanner.close();
    }
}
