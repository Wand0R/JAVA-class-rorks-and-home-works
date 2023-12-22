package class_work_4;

import java.util.Scanner;

public class class_3_4 {
    public static void main(String args[]) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int res = 1;

        if (a == b) {res++;}
        
        if (a == c || b == c) {res++;}

        System.out.print("Різних значень: ");
        System.out.println(4-res);

    }
}
