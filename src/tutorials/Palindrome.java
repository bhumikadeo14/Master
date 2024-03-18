package tutorials;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        
        int n = scanner.nextInt();
		int sum =0, r;
		int temp = n;
		
		while(n>0) {
			r = n%10;
			sum = (sum *10)+r;
			n = n/10;
		}
		
		if(sum==temp) {
			System.out.println("Number is palindrome");
		}
		else {
			System.out.println("number is not palindrome");
		}

	}

}
