package tutorials;

public class CompressedString {
	public static String compressedstring(String input) {
		
		StringBuilder compressed=new StringBuilder();
		int count=1;
		
		for (int i=0;i<input.length();i++) {
			
			if(i+1<input.length()&& input.charAt(i)==input.charAt(i+1)) {
				count++;
				
			}
			
			else {
				
				compressed.append(input.charAt(i));
				
				compressed.append(count);
				
				count=1;
			}
			
			
		}
		
		return compressed.length()<input.length()? compressed.toString():input;
		
	}

}
