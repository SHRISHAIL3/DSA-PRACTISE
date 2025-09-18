package ARRAYS;



public class BuySellStock {
	
	public static int decide(int prices[]) {
		int buy=Integer.MAX_VALUE;
		int maxprofit=0;
		int purchased = 0;
		int sold = 0;
		
		for (int i = 0; i < prices.length; i++) {
			if (buy<prices[i]) {
				int profit=prices[i]-buy;
//				System.out.println(profit);
				
				if (profit > maxprofit) {
					maxprofit = profit;
					sold = i;           
				}
				
//			System.out.println(maxprofit);
			}else {
				buy=prices[i];
				purchased=i;
			}
			
		}
		System.out.println("The purchased day is:"+purchased +" at Price" +prices[purchased]);
		System.out.println("The sold day is :"+sold+" at price "+ prices[sold]);
		return maxprofit;
		
	}

	
	public static void main(String[] args) {
		int prices[]= {7,1,5,3,6,4};
		System.out.println("The total profit is :"+decide(prices));
	}
}
