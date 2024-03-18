package tutorials;

import java.util.Stack;

public class ValidParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declare a stack
	}
	public boolean isValid(String s) {
		Stack<Character> stc=new Stack<>();
		
		for(char c:s.toCharArray()) {
			if(c=='(') {
				stc.push(')');
			}
			else if ((c=='{')) {
				stc.push('}');
			}
			else if ((c=='[')) {
				stc.push(']');
			}
			else if (stc.isEmpty()||stc.pop()!=c) {
				return false;
			}
		}
		return true;

	}

}
