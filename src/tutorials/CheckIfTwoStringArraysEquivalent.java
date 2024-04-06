package tutorials;

public class CheckIfTwoStringArraysEquivalent {
    
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sum1 = new StringBuilder();
        StringBuilder sum2 = new StringBuilder();
        
        for (String str : word1) {
            sum1.append(str);
        }
        
        for (String str : word2) {
            sum2.append(str);
        }
        
        return sum1.toString().equals(sum2.toString());
    }

    public static void main(String[] args) {
        // Example usage
        CheckIfTwoStringArraysEquivalent solution = new CheckIfTwoStringArraysEquivalent();
        String[] word1 = {"abc", "def"};
        String[] word2 = {"abcdef"};
        boolean result = solution.arrayStringsAreEqual(word1, word2);
        System.out.println("Are the arrays equivalent? " + result);
    }
}
