package may21;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		int[]a = {1,3,8,7,9,5};
		int []b = new int[a.length];
		int c=0;
		for (int i=0;i<a.length-1;i++)
		{
			if (a[i]>a[i+1])  
			{
				c=a[i];
				a[i]=a[i+1];
				a[i+1]=c;
				
			}
		}
		System.out.println(Arrays.toString(b));


	}

}
