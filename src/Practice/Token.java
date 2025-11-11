package Practice;

// count vowels and consonents 

public class Token {
	
	public static void main(String[] args)
	{
		String str="helloeveryone";
		int v=0,c=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				v++;
			}
			else
				c++;
		}

		System.out.println("Vowels= "+v);
		System.out.println("consonents= "+c);
	}
}






























   