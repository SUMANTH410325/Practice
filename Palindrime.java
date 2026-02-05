package Coding;

public class Palindrime {

	public static void main(String[] args) {
		
		int a=2442,temp=a,rev=0,b; 
		//we have copied the original a value to temporary variable temp=a
		
		while(a>0)
		{
			b=a%10;
			rev=rev*10+b;
			a=a/10;
		}
		
		if(temp==rev)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("palindrome");
		}
	}

}
