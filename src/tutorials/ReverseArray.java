package tutorials;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] inputArray = {'a', 'e', 'i', 'o', 'u'};
		
		ReverseArray obj=new ReverseArray();
		obj.reversearray(inputArray);
		obj.printreversearray(inputArray);
		
	}
	
	public void reversearray(char[] chararray) {
		char temp=0;
		int start=0;
		int end= chararray.length-1;
		
		while(start<end) {
			temp=chararray[start];
			chararray[start]=chararray[end];
			chararray[end]=temp;
			start++;
			end--;
			
		}
	}
	public void printreversearray(char[] reversedarray) {
		
		for (char ch : reversedarray) {
            System.out.print(ch + " ");
        }
        //System.out.println();
    }
		
	}


