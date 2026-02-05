package Coding;

public class MoveNonNegativeElements {

	public static void main(String[] args) {

			int[] arr= {-10,11,-1,28,-3,1};
			//int[] result=new int[arr.length];
			int[] result= {0,0,0,0,0,0};
			int index=0;
			//step1
			//Add all Non-negative number first
			for(int num:arr)
			{
				if(num>=0)
				{
					result[index]=num;
					index++;
				}
			}
			//step2
			//Add all negative number next
			for(int num:arr)
			{
				if(num<0)
				{
					result[index]=num;
					index++;
				}
			}
			for(int num:result)
			{
				System.out.print(num+"  ");
			}
			
			
	}

}
