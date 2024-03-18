package tutorials;

public class GenerateOutput {

    public static void main(String[] args) {
        String input = "a6p3e4";
        String output = generateOutput(input);
        System.out.println(output);
    }

    private static String generateOutput(String input) {
        StringBuilder result = new StringBuilder();
        char currentChar = 0;

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                currentChar = ch;
            } else {
                int count = Character.getNumericValue(ch);
                result.append(String.valueOf(currentChar).repeat(Math.max(0, count)));
            }
        }

        return result.toString();
    }
}

