package Coding;

public class CountVowelsAndConsonents {

	public static void main(String[] args) {

			String str="SumanthYarramsettY";
			int vowels=0,consonents=0;
			char[] ch=str.toLowerCase().toCharArray();
			for(char c:ch)
		if(c>='a'&&c<='z')
		{
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				vowels++;
			}
			else
			{
				consonents++;
			}
		}
			System.out.println(vowels);
			System.out.println(consonents);
			
	}

}
