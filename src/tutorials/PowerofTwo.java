package tutorials;

public class PowerofTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =5;
		boolean res = isPowerOfTwo(a);
		if(res) {
			System.out.println("Number is a power of 2");
		}
		else {
			System.out.println("Number is not a power of 2");
		}

	}
	
public static boolean isPowerOfTwo(int n) {
	
	if(n<=0) {
		return false;
	}
	
	if(n==1) {
		return true;
	}
	
	int mod=0;
	int q=n;
	while(q>1 && mod==0) {
	mod = n%2;
	 q = n/2;
	n=q;
	}
        if(mod==0) {
        	return true;
        }
        return false;
    }

}
