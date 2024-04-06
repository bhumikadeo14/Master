/* Q1021. A valid parentheses string is either empty "", "(" + A + ")", or A + B, where A and B are valid parentheses strings, and + represents string concatenation.

For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.
A valid parentheses string s is primitive if it is nonempty, and there does not exist a way to split it into s = A + B, with A and B nonempty valid parentheses strings.

Given a valid parentheses string s, consider its primitive decomposition: s = P1 + P2 + ... + Pk, where Pi are primitive valid parentheses strings.

Return s after removing the outermost parentheses of every primitive string in the primitive decomposition of s*/

package tutorials;

public class RemoveOutermostParentheses {

	public String removeOuterParentheses(String s) {
		StringBuilder result = new StringBuilder();
		int count = 0;
		
		for (char c : s.toCharArray()) {
			if (c == '(') {
				if (count > 0) {
					result.append(c);
				}
				count++;
			} else if (c == ')') {
				count--;
				if (count > 0) {
					result.append(c);
				}
			}
		}
		
		return result.toString();
	}

	public static void main(String[] args) {
		RemoveOutermostParentheses solution = new RemoveOutermostParentheses();
		
		String s1 = "(()())(())";
		System.out.println(solution.removeOuterParentheses(s1)); // Output should be "()()()"
		
		String s2 = "(()(()))";
		System.out.println(solution.removeOuterParentheses(s2)); // Output should be "()()"
	}
}
