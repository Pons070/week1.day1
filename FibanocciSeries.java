package week1.day1;

public class FibanocciSeries {
	
	public static void main(String[] args) {
		
		int fstNum=0;
		int secNum=1;
		int sum=0;
		int i;
		
		System.out.print(fstNum+ "," +secNum);
		
		for (i=2;i<11;i++) {
		
			sum=fstNum+secNum;
			
			fstNum=secNum;
			secNum=sum;
			
			System.out.print(","+sum);
		}
		
		
	}

}
