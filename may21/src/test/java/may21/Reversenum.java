package may21;

import java.util.Scanner;

public class Reversenum {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
//		int rev=0;
//		
//		while(num!=0) {
//			rev=rev*10+num%10;
//		num=num/10;}
//		System.out.println(rev);
		
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer rev=sb.reverse();
		System.out.println(rev);
		
		StringBuilder sbl=new StringBuilder();
		sbl.append(num);
		StringBuilder reverse=sbl.reverse();
		System.out.println(reverse);
		
	}

}
