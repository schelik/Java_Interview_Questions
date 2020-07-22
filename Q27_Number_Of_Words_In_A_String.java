package Java_Interview_Problems;

import java.util.Collections;

public class Q27_Number_Of_Words_In_A_String {

	public static void main(String[] args) {

		String str = "What is my name ";
		String s[] = str.split(" ");
		
		//Approach 1
//		for(String i : s) {
//			
//			String rev = "";
//			
//			for(int j = i.length() - 1 ; j >= 0 ; j--) {
//				rev += i.charAt(j) + "";
//			}
//			
//			System.out.print(rev + " ");
//		}
		
		//Approach 2: StringBuilder
		for(String i : s) {
			
			StringBuilder sb = new StringBuilder(i);
			System.out.print(sb.reverse().toString() + " ");
			
		}
		
	}
}
