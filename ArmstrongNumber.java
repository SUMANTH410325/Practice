package Coding;

public class ArmstrongNumber {

	public static void main(String[] args) {

			int a=153,total=0,temp=a,b;
			while(a>0)
			{
				b=a%10;
				total=total+(b*b*b);
				a=a/10;
			}
			if(total==temp)
				System.out.println("Armstrong number");
			else
				System.out.println(" not Armstrong number");

			
	}

}
