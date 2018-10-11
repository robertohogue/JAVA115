
public class Power {

    public static void main(String[] args) {
    	printPowersOfN(2,7);
    	printPowersOfN(5,3);
    }	
    	public static void printPowersOfN(int num1, int count) {
    		for(int i = 1; i <=count; i++) {
    			double result= Math.pow(num1, i);
    			System.out.println((int)(result));
    		}
    	}
 
}
