package class_work_5


public class class_1_1 {
    public static void main(String args[]) {
        String [] functions = {"sine", "cosine", "tangent", "cotangent"};

        System.out.print("Array elements: ");

        for (int i = 0; i < functions.length; i++) {
            System.out.print(functions[i] + ", ");
            if (i==functions.length-1) {
                System.out.print(functions[i] + ";");
            }
        }

        System.out.println("\n");

        for (int i = 0; i < functions.length; i++) {
            System.out.println(i + ": " + functions[i]);
        }
    }
}
