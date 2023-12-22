public class dz_2_5 {
    public static void main(String[] args) {
        String inputText = "Це рядок 1. Це рядок 2, який містить кому. Це рядок 3? Та це рядок 4!";
        printTextLines(inputText);
    }

    private static void printTextLines(String text) {
        int length = text.length();
        StringBuilder line = new StringBuilder();

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);

            // Додаємо символ до поточного рядка
            line.append(currentChar);

            // Перевіряємо, чи це останній символ або наступний символ не є комою, окликом або питанням
            if (i == length - 1 || !isNextCharCommaExclamationOrQuestionMark(text.charAt(i + 1))) {
                System.out.println(line.toString().trim());  // Друкуємо поточний рядок
                line.setLength(0);  // Очищаємо поточний рядок
            }
        }
    }

    private static boolean isNextCharCommaExclamationOrQuestionMark(char nextChar) {
        return nextChar == ',' || nextChar == '!' || nextChar == '?';
    }
}
