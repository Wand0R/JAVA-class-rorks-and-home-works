package class_work_3;

public class class_2_1 {
    public static void main(String args[]) {
        int x1 = 0x88880000;
        int x2 = 0x0000AAAA;

        System.out.println(" | : " + Integer.toBinaryString(x1 | x2));
        System.out.println(" ^ : " + Integer.toBinaryString(x1 ^ x2));
        System.out.println(" ~ : " + Integer.toBinaryString(~x1));
        System.out.println(" & : " + Integer.toBinaryString(x1 & x2));
        System.out.println(" >> : " + Integer.toBinaryString(x1 >> x2));
        System.out.println(" >>> : " + Integer.toBinaryString(x1 >>> x2));
        System.out.println(" << : " + Integer.toBinaryString(x1 << x2));

    }
}
