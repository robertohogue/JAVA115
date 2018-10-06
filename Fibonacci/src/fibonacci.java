
public class fibonacci {

	public static void main(String[] args) {
		// totalNumber is for how many times the loop counts through
		 int totalNumber = 12; 
		 int startNumber = 0;
		 int nextNumber = 1;
		 
	        System.out.print("Computing the Fibonacci Sequence to "+totalNumber+" numbers:");

	        for (int i = 1; i <= totalNumber; ++i)
	        {
	            System.out.print(startNumber+" ");
	      
	            int sum = startNumber + nextNumber;
	            startNumber = nextNumber;
	            nextNumber = sum;
	        }

	}

}