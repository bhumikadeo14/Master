package tutorials;

public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]]
		
		int num =2;
		//HappyNumber obj = new HappyNumber();
		boolean res=isHappy(num);
			
			if(res) {
				System.out.println("yayy,number hApPy!");
			}
			else {
				System.out.println("Oops,number is NOT happy!");
			}

	}
	
public static boolean isHappy(int n) {
	while(n!=1) {
		int sum =0;
	while(n>0) {
		int rem = n%10;
		sum =(int) (sum+Math.pow(rem, 2));
		n=n/10;
	}
	n=sum;
	}
	
	if(n==1) {
		return true;
	}
	else return false;
        
    }

}
