package Coding;

public class ReverseWordsInString {

	public static void main(String[] args) {
			String str="i am learning java";
			String result=" ";
			
			String[] ch=str.split(" ");
			for(int i=ch.length-1;i>=0;i--)
			{
				result=result+ch[i]+" ";
			}
			System.out.println(result);
					
		
	}
}
