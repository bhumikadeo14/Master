package tutorials;

public class MaximumNumberofWordsYouCanType {
    
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] strArray = text.split(" ");
        int count = 0;

        for (String s : strArray) {
            boolean flag = true;

            for (char ch : brokenLetters.toCharArray()) {
                if (s.contains(String.valueOf(ch))) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        MaximumNumberofWordsYouCanType obj = new MaximumNumberofWordsYouCanType();
        String text = "hello world";
        String brokenLetters = "le";
        int result = obj.canBeTypedWords(text, brokenLetters);
        System.out.println("Number of fully typeable words: " + result);
    }
}
