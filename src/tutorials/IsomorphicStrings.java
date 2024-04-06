package tutorials;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
	
	public boolean isIsomorphic(String s, String t) {
		if(s.length()!=t.length()) {
			return false;
		}
		
		Map<Character,Character> charmappings=new HashMap<>();
		
		for (int i=0;i<s.length();i++) {
			char original=s.charAt(i);
			char replacement=t.charAt(i);
			
			//if both key and value do not exist add the new mapping to the map
			
			if(!charmappings.containsKey(original)) {
				
				if(!charmappings.containsValue(replacement)) {
					charmappings.put(original, replacement);
				}
				
				else return false;
			}
			
			//check if already mapped to a different character
			
			else {
				
				if(charmappings.get(original)!=replacement)
					return false;
		}
		
		
	}
return true;
}
	
	public static void main(String[] args) {
		IsomorphicStrings solution = new IsomorphicStrings();
		
		String s1 = "egg";
		String t1 = "add";
		System.out.println(solution.isIsomorphic(s1, t1)); // Should return true
		
		String s2 = "foo";
		String t2 = "bar";
		System.out.println(solution.isIsomorphic(s2, t2)); // Should return false
	}

}
