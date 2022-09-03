package week1.day1;

public class IsPrime {
	
	public static void main(String[] args) {
		
		int count=17;
		
		int i;
		
		for(i=2; i<=count; i++) {
			
			
			if (count%i==0) {
			
				System.out.println("The given number" +count+ "is a prime number");
			}
			else if (count%i!=0) {
			
				System.out.println("The given number" +count+ "is not a prime number");
			}
		}
		
	}

}
