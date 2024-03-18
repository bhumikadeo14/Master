package tutorials;
import java.util.Scanner;

public class CheckArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        
        int number = scanner.nextInt();
        if (isArmstrong(number)) {
            System.out.println(number + " is a armstrong number.");
        } else {
            System.out.println(number + " is not a armstrong number.");
        }
        
        scanner.close();
        
	}
	//BHUMIKA'S CODE
	
	public static boolean isArmstrong(int num) {
		int sum=0;
		int temp=num;
		
		while(num!=0) {
			int rem=num%10;
			sum=(int) (sum+Math.pow(rem, 3));
			num=num/10;
			}
		//System.out.println("sum after while loop is "+sum);
	
		if(sum==temp)return true;
		else return false;
		
	}

	//CHATGPT CODE
	
	/*public static boolean isArmstrong(int num) {
        int sum = 0;
        int temp = num;
        
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, 3); // Use Math.pow to calculate the cube
            temp = temp / 10;
        }

        return sum == num;
    }*/
}

