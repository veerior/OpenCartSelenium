package may21;

import java.util.Arrays;
import java.util.Scanner;

public class Printevenodd {

	public static void main(String[] args) {
		int evencount=0;
		int oddcount=0;
		System.out.println("Enter 5 numbers");
		Scanner input=new Scanner(System.in);
		int[] a=new int[5];
		
//		to display the input in an array
		for(int s=0;s<a.length;s++) {a[s]=input.nextInt();}
		System.out.println(Arrays.toString(a));
		
//		even odd count
//		for(int j:a) if ( j% 2==0) {evencount++;}
//		else oddcount++;
//		System.out.println("evencount: "+evencount+" oddcount: "+oddcount);


//		even odd display nos
		int[] evennos=new int[5];
		int[] oddnos=new int[5];
		
		for(int j:a) 
			if ( j%2==0) 
			{
				evennos[evencount]=j;
					evencount++;
							}				
		else  
		{
			oddnos[oddcount]=j;
			oddcount++;
					}
		
		System.out.println(Arrays.toString(evennos));
		System.out.println(Arrays.toString(oddnos));
		System.out.println("evencount: "+evencount+" oddcount: "+oddcount);
	}

}
