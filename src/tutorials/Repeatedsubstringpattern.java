package tutorials;

public class Repeatedsubstringpattern {
	
	public boolean repeatedSubstringPattern(String s) {
		
		int len=s.length();
		
		for(int i=len/2;i>=1;i--) {
			if(len%i==0) {
				
				int repeatcount=len/i;
				String substring=s.substring(0, i);
				StringBuilder sb=new StringBuilder();
				
				for(int j=0;j<repeatcount;j++) {
					sb.append(substring);
				}
				
				if(sb.toString().equals(s)) {
					return true;
				}
				
				
			}
		}
		return false;
		
		
	}

}
