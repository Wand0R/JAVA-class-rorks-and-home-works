public class dz_2_29 {
    public static void main(String[] args) {
        String input = "abcdefgba";
        String result = removeSymmetricSubstring(input);
        System.out.println(result);
    }

    private static String removeSymmetricSubstring(String input) {
        int start = 0;
        int end = input.length() - 1;

        // Знаходимо найдовший симетричний підрядок на початку та кінці рядка
        while (start < end && input.charAt(start) == input.charAt(end)) {
            start++;
            end--;
        }

        // Видаляємо симетричний підрядок
        return input.substring(start, end + 1);
    }
}
