package tutorials;

public class PrintFibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int firstterm=0;
		int secondterm=1;
		int nextterm=0;
		
		System.out.println(firstterm);
		System.out.println(secondterm);
		for (int i=0;i<=6;i++) {
			
			nextterm=firstterm+secondterm;
			firstterm=secondterm;
			secondterm=nextterm;
			System.out.println(nextterm);
			
		}

	}

}
