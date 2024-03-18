package tutorials;

import java.lang.reflect.Array;

public class BuynSellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] prices = {7, 1, 5, 3, 6, 4};
		//int maxprofit=0;
		int maxprofit=maxProfit(prices);
		
		System.out.println("Maximum Profit: " + maxprofit);
		

	}
	
public static int maxProfit(int[] prices) {
	
	int potentialprofit =0;
		
	if(prices == null || prices.length<=1 ) {
		return 0;
	}
	int minprice = prices[0];
	int maxprofit=0;

	
        for(int i =0; i<prices.length; i++) {
        	
        	int currentprice=prices[i];
        	
        	potentialprofit = currentprice - minprice;
        	
        	maxprofit=Math.max(potentialprofit, maxprofit);
        	
        	minprice=Math.min(currentprice,minprice);
        	
        
        }
		return maxprofit;
       
    }

}
