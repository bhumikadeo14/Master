package tutorials;

public class UglyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 34;
		UglyNumber obj = new UglyNumber();
		boolean boo = obj.isUgly(num);
		
		if(boo) {
			System.out.println("number is ugly");
		}
		else {
			System.out.println("number is beautiful");
		}
		

	}
	
public boolean isUgly(int n) {
	
	for (int i=2; i<6 && n>0; i++){
        while (n % i == 0){
            n /= i;
        }
    }
    if(n==1){
        return true ;
    }
    return false ;

}
}
