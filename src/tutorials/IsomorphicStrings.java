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
			
			if(!charmappings.containsKey(original)) {
				if(!charmappings.containsValue(replacement))
					charmappings.put(original, replacement);
				else return false;
			}
			
			else {
				char mappedcharacter=charmappings.get(original);
				if(mappedcharacter!=replacement)
					return false;
		}
		
		
	}
return true;
}
}
