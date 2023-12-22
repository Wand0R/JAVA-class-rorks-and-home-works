public class dz_2_8 {
    public static void main(String[] args) {
        // Задайте квадратну матрицю 3x3
        int[][] matrix = {
                {3, -5, 10},
                {4, 9, -6},
                {3, 4, 8}
        };

        // Обчислення визначника
        double determinant = calculateDeterminant(matrix);

        // Виведення результату
        System.out.println("Визначник матриці: " + determinant);
    }

    private static double calculateDeterminant(int[][] matrix) {
        if (matrix.length != 3 || matrix[0].length != 3 || matrix[1].length != 3 || matrix[2].length != 3) {
            throw new IllegalArgumentException("Матриця повинна бути розмірністю 3x3.");
        }

        int a = matrix[0][0];
        int b = matrix[0][1];
        int c = matrix[0][2];
        int d = matrix[1][0];
        int e = matrix[1][1];
        int f = matrix[1][2];
        int g = matrix[2][0];
        int h = matrix[2][1];
        int i = matrix[2][2];

        return a * (e * i - f * h) - b * (d * i - f * g) + c * (d * h - e * g);
    }
}
