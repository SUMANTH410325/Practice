package Coding;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int a=0,b=1,c;
	
		for(int i=0;i<8;i++)
		{
			c=a+b;
			System.out.println(a);
			a=b;
			b=c;
			
		}
	}

}
