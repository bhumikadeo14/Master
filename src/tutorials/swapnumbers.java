package tutorials;

public class swapnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=10;
		int num2=20;
		System.out.print("ORIGINAL NUMBERS-");
		System.out.println(num1);
		System.out.println(num2);
		
		
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.print("SWAPPED NUMBERS-");
		System.out.println(num1);
		System.out.println(num2);
		
		

	}

}
