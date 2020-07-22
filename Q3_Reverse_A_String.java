package Java_Interview_Problems;

import java.util.Scanner;

public class Q3_Reverse_A_String {

	public static void main(String[] args) {


		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s = sc.next();
		String rev = "";

		
		
		//using +(concat operator) 
//		for(int i = s.length()-1 ; i >= 0 ; i--) {
//			rev += s.charAt(i) + "";
//		}
//		
//		System.out.println("Reversed string is: " + rev);

		
		
		//using StringBuilder class
		
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		
		System.out.println("Reversed string is: " + sb);
		
	}

}
