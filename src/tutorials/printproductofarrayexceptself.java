package tutorials;

public class printproductofarrayexceptself {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] originalarray= {10,20,30,40,50};
		int [] result=productExceptSelf(originalarray);

		System.out.println("Product of array elements except self:");
		
		for(int num: result) {
			System.out.print(num + " ");
		}
	}
	
	public static int[] productExceptSelf(int[] originalarray){
		int arrlength=originalarray.length;
		int[] result = new int[arrlength];
        result[0] = 1;
        
     // Calculate left products
        
		int left=1;
		for (int i=1;i<arrlength;i++) {
			left*=originalarray[i-1];
			result[i]=left;
		}
		//Calculate right products and multiply with left products
		
		int right=1;
		for(int i=arrlength-1;i>=0;i--) {
			result[i]*=right;
			right*=originalarray[i];
			
		}
		return result;
		
	}

}
