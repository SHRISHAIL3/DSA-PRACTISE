package Random;

public class WaterBottle1518 {
	
	    public static int numWaterBottles(int numBottles, int numExchange) {
	        int drink=numBottles;
	        while(numBottles>=numExchange){
	          int newnumBottles=numBottles/numExchange;
	          int left=numBottles%numExchange;
	          drink=drink+newnumBottles;
	          numBottles = newnumBottles + left; 

	           
	        }

	        return drink;
	        
	    }
	    public static void main(String[] args) {
		
			System.out.println(	numWaterBottles(25, 5));
		}
	}
 


