package Coding;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Practice {

	public static void main(String[] args) {

		int[] a= {10,20,40,2,8};
		int h=a[0];
		int l=a[0];
		for(int num:a)
		{
			if(num>h)
			{
				h=num;
			}
			if(num<l)
			{
				num=l;
			}
		}
		System.out.println(h);
		System.out.println(l);

		
		
			
	}
}
