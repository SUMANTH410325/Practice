package Coding;

public class ReverseOfString {

	public static void main(String[] args) {

			String str="sumanth";
//			for(int i=str.length()-1;i>=0;i--)
//			{
//				char c=str.charAt(i);
//				System.out.print(c);
//			}
			
			
//			char[] c=str.toCharArray();
//			for(int i=c.length-1;i>=0;i--)
//			{
//				System.out.print(c[i]);
//			}
			
			StringBuffer sb=new StringBuffer(str);
			System.out.println(sb.reverse().toString());
	}

}



