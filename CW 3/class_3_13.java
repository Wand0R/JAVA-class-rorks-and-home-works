package class_work_3;

import java.lang.Math;
import java.util.Scanner;

public class class_3_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input x = ");

        float x = scanner.nextFloat();

        System.out.println(String.format("%20.4f", (Math.pow(x, 8))));


    }
}
