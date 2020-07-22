package Java_Interview_Problems;

import java.util.Scanner;

public class Q2_Reverse_A_Number {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a = sc.nextInt();
		
//		//1.Algorithm
//		
//		int rev = 0;
//		
//		while(a > 0) {
//			rev = rev * 10 +  a % 10;
//			a = a / 10;
//		}
		
		//Using StringBuffer class
		
		StringBuffer sb = new StringBuffer(String.valueOf(a));
		StringBuffer rev = sb.reverse();
		
		System.out.println("Reversed number equals to = " + rev);
	}

}
