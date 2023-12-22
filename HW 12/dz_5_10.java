public class dz_5_10 {
    public static void main(String[] args) {
        String input = "Мамо! А ти ж мені казала* що я не прав! МАМОООООООО!";
        String result = transformString(input);
        System.out.println(result);
    }

    private static String transformString(String input) {
        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (ch == '!') {
                result.append("...");
            } else if (ch == '.') {
                result.append("...");
            } else if (ch == '*') {
                result.append("+");
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }
}
