package class_work_7;

import java.util.Scanner;


public class class_1_1 {
    double x;
    double y;
    public void input(Scanner s) {
        System.out.println("Input x,y: ");
        this.x = s.nextDouble();
        this.y = s.nextDouble();
    }

    public String toStr() {
        return String.format("(%f, %f)", this.x, this.y);
    }
} 