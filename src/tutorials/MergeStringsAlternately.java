package tutorials;

public class MergeStringsAlternately {
    
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;
        
        while (i < word1.length() || j < word2.length()) {
            if (i < word1.length()) {
                sb.append(word1.charAt(i++));
            }
            
            if (j < word2.length()) {
                sb.append(word2.charAt(j++));
            }
        }
        
        return sb.toString();
    }

    public static void main(String[] args) {
        MergeStringsAlternately merger = new MergeStringsAlternately();
        String word1 = "hellooo";
        String word2 = "world";
        String merged = merger.mergeAlternately(word1, word2);
        System.out.println(merged);  // Output: hwedlolrlo
    }
}
